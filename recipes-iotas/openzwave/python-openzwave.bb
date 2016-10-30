inherit autotools

SRC_URI = "git://github.com/OpenZWave/python-openzwave"
SRCREV = "master"

S = "${WORKDIR}/git"

LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://COPYRIGHT.txt;md5=584c7ddacb8739db77ddcc47bd9d3b52"

DEPENDS += "openzwave python"