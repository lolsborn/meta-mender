inherit cross

SRC_URI = "git@github.com:OpenZWave/open-zwave.git"

SRCREV_pn-godep = "83919e36719967c83a4d2b5b9520a8a9b463f820"

do_compile() {
  make
}

do_install() {
  install -d "${D}/${bindir}"
}