diff --git a/arduino-core/src/cc/arduino/packages/uploaders/SerialUploader.java b/arduino-core/src/cc/arduino/packages/uploaders/SerialUploader.java
index d7fc02b..971bfb8 100644
--- a/arduino-core/src/cc/arduino/packages/uploaders/SerialUploader.java
+++ b/arduino-core/src/cc/arduino/packages/uploaders/SerialUploader.java
@@ -155,7 +155,7 @@
 
     BoardPort boardPort = BaseNoGui.getDiscoveryManager().find(PreferencesData.get("serial.port"));
     try {
-      prefs.put("serial.port.iserial", boardPort.getPrefs().get("iserial"));
+      prefs.put("serial.port.iserial", boardPort.getPrefs().getOrExcept("iserial"));
     } catch (Exception e) {
       // if serial port does not contain an iserial field
     }
