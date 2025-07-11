SUMMARY = "BIOS BMC SMM Error Logger"
DESCRIPTION = "Allows BIOS in SMM to log errors to the BMC"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"
DEPENDS += " \
  boost \
  stdplus \
  systemd \
  nlohmann-json \
  libbej \
  sdbusplus \
  phosphor-dbus-interfaces \
"
SRCREV = "2be0870da4a51805105c7ca7fc950bcab1ec988f"
PV = "0.1+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/openbmc/bios-bmc-smm-error-logger;branch=main;protocol=https"

S = "${WORKDIR}/git"
SYSTEMD_SERVICE:${PN} += "xyz.openbmc_project.bios_bmc_smm_error_logger.service"

inherit meson pkgconfig systemd

EXTRA_OEMESON = " \
  -Dtests=disabled \
"
