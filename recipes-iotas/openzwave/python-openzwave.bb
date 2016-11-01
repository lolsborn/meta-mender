inherit autotools

SRC_URI = "git://github.com/OpenZWave/python-openzwave"
SRCREV = "master"

S = "${WORKDIR}/git"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYRIGHT.txt;md5=60b0221258e884b75863208e096fc155"

DEPENDS += "openzwave python systemd python-setuptools"

do_install() {
  make -C ${S} install
}

do_compile() {
  make -C ${S}
}