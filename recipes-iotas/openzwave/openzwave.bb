inherit autotools

SRC_URI = "git://github.com/OpenZWave/open-zwave.git"
SRCREV = "master"

S = "${WORKDIR}/git"
B = "${WORKDIR}/git"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://license/license.txt;md5=584c7ddacb8739db77ddcc47bd9d3b52"

DEPENDS += "systemd"

FILES_${PN} += "/usr/etc/openzwave"

do_install() {
  export PREFIX="${D}${prefix}"
  export pkgconfigdir="${PKG_CONFIG_DIR}"
  export instlibdir="${D}${prefix}${base_libdir}"
  make BITBAKE_ENV=1 install
}

do_compile() {
  bbnote "In compile"
  bbnote "${B}"
  export PREFIX="${D}${prefix}"
  export pkgconfigdir="${PKG_CONFIG_DIR}"
  export instlibdir="${D}${prefix}${base_libdir}"
  make BITBAKE_ENV=1