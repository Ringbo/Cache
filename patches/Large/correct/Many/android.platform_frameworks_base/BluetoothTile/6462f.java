diff --git a/packages/SystemUI/src/com/android/systemui/qs/tiles/BluetoothTile.java b/packages/SystemUI/src/com/android/systemui/qs/tiles/BluetoothTile.java
index 14afbfa..c691498 100644
--- a/packages/SystemUI/src/com/android/systemui/qs/tiles/BluetoothTile.java
+++ b/packages/SystemUI/src/com/android/systemui/qs/tiles/BluetoothTile.java
@@ -269,7 +269,7 @@
                     item.icon = R.drawable.ic_qs_bluetooth_on;
                     item.line1 = device.getName();
                     item.tag = device;
-                    int state = mController.getMaxConnectionState(device);
+                    int state = device.getMaxConnectionState();
                     if (state == BluetoothProfile.STATE_CONNECTED) {
                         item.icon = R.drawable.ic_qs_bluetooth_connected;
                         int batteryLevel = device.getBatteryLevel();
