diff --git a/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/message/Device.java b/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/message/Device.java
index 3615998..eb5c42e 100644
--- a/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/message/Device.java
+++ b/bundles/binding/org.openhab.binding.maxcube/src/main/java/org/openhab/binding/maxcube/internal/message/Device.java
@@ -115,13 +115,13 @@
 		case HeatingThermostatPlus:
 			HeatingThermostat heatingThermostat = (HeatingThermostat) device;
 			// "xxxx xx00 = automatic, xxxx xx01 = manual, xxxx xx10 = vacation, xxxx xx11 = boost":
-			if (bits2[0] == false && bits2[0] == false) {
+			if (bits2[1] == false && bits2[0] == false) {
 				heatingThermostat.setMode(ThermostatModeType.AUTOMATIC);
-			} else if (bits2[0] == false && bits2[1] == false) {
+			} else if (bits2[1] == false && bits2[0] == true) {
 				heatingThermostat.setMode(ThermostatModeType.MANUAL);
-			} else if (bits2[1] == false && bits2[0] == false) {
+			} else if (bits2[1] == true && bits2[0] == false) {
 				heatingThermostat.setMode(ThermostatModeType.VACATION);
-			} else if (bits2[1] == false && bits2[1] == false) {
+			} else if (bits2[1] == true && bits2[0] == true) {
 				heatingThermostat.setMode(ThermostatModeType.BOOST);
 			} else {
 				// TODO: handel malformed message
