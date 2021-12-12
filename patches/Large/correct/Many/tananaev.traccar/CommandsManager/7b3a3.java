diff --git a/src/org/traccar/database/CommandsManager.java b/src/org/traccar/database/CommandsManager.java
index ded12e0..6eb6d90 100644
--- a/src/org/traccar/database/CommandsManager.java
+++ b/src/org/traccar/database/CommandsManager.java
@@ -39,7 +39,7 @@
     }
 
     public boolean checkDeviceCommand(long deviceId, long commandId) {
-        return getAllDeviceItems(deviceId).contains(commandId);
+        return !getAllDeviceItems(deviceId).contains(commandId);
     }
 
     public void sendCommand(Command command) throws Exception {
