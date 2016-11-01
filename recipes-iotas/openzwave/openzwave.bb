SUMMARY = "Library to access Z-Wave interface"
DESCRIPTION = "OpenZWave is an open-source, cross-platform library designed to enable anyone to add support for Z-Wave home-automation devices to their applications, without requiring any in depth knowledge of the Z-Wave protocol."
HOMEPAGE = "http://openzwave.net/"

inherit autotools

SRC_URI = "git://github.com/OpenZWave/open-zwave.git"
SRCREV = "master"

S = "${WORKDIR}/git"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://license/license.txt;md5=584c7ddacb8739db77ddcc47bd9d3b52"

DEPENDS += "udev"

FILES_${PN} += "/usr"

do_install() {
  export PREFIX="${D}${prefix}"
  export pkgconfigdir="${PKG_CONFIG_DIR}"
  export instlibdir="${D}${prefix}${base_libdir}"
  make BITBAKE_ENV=1 -C ${S} install
}

do_compile() {
  export PREFIX="${D}${prefix}"
  export pkgconfigdir="${PKG_CONFIG_DIR}"
  export instlibdir="${D}${prefix}${base_libdir}"
  make -C ${S} BITBAKE_ENV=1
}