inherit cross

SRC_URI = "git@github.com:OpenZWave/open-zwave.git;protocol=https;destsuffix=openzwave-${PV}/src/github.com/openzwave"

LICENSE = "lgpl"
LIC_FILES_CHKSUM = "file://${S}/src/github.com/openzwave/license/license.txt;md5=584c7ddacb8739db77ddcc47bd9d3b52"

do_compile() {
  make
}

do_install() {
  install -d "${D}/${bindir}"
}