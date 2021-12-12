diff --git a/addons/binding/org.openhab.binding.enocean/src/main/java/org/openhab/binding/enocean/internal/eep/D2_01/D2_01.java b/addons/binding/org.openhab.binding.enocean/src/main/java/org/openhab/binding/enocean/internal/eep/D2_01/D2_01.java
index 6852ff3..981f66f 100644
--- a/addons/binding/org.openhab.binding.enocean/src/main/java/org/openhab/binding/enocean/internal/eep/D2_01/D2_01.java
+++ b/addons/binding/org.openhab.binding.enocean/src/main/java/org/openhab/binding/enocean/internal/eep/D2_01/D2_01.java
@@ -75,7 +75,7 @@
 
     protected State getSwitchingData() {
         if (getCMD() == CMD_ACTUATOR_STATUS_RESPONE) {
-            return (bytes[bytes.length - 1] & outputValueMask) == STATUS_SWITCHING_ON ? OnOffType.OFF : OnOffType.ON;
+            return (bytes[bytes.length - 1] & outputValueMask) == STATUS_SWITCHING_OFF ? OnOffType.OFF : OnOffType.ON;
         }
 
         return UnDefType.UNDEF;
