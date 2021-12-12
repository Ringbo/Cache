diff --git a/core/java/android/server/BluetoothHealthProfileHandler.java b/core/java/android/server/BluetoothHealthProfileHandler.java
index eafd7bd..51c995e 100644
--- a/core/java/android/server/BluetoothHealthProfileHandler.java
+++ b/core/java/android/server/BluetoothHealthProfileHandler.java
@@ -569,7 +569,7 @@
             int newDeviceState) {
         mHealthDevices.put(device, newDeviceState);
         mBluetoothService.sendConnectionStateChange(device, BluetoothProfile.HEALTH,
-                                                    prevDeviceState, newDeviceState);
+                                                    newDeviceState, prevDeviceState);
     }
 
     /**
