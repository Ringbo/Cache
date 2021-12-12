diff --git a/core/java/android/server/BluetoothEventLoop.java b/core/java/android/server/BluetoothEventLoop.java
index aa62cd7..a2038c9 100644
--- a/core/java/android/server/BluetoothEventLoop.java
+++ b/core/java/android/server/BluetoothEventLoop.java
@@ -784,12 +784,12 @@
                 // machine.  We don't handle AVCTP signals currently. We only send
                 // intents for AVDTP state changes. We need to handle both of them in
                 // some cases. For now, just don't move to incoming state in this case.
-                mBluetoothService.notifyIncomingA2dpConnection(address, true);
+                mBluetoothService.notifyIncomingA2dpConnection(address, false);
             } else {
                 Log.i(TAG, "" + authorized +
                       "Incoming A2DP / AVRCP connection from " + address);
                 mA2dp.allowIncomingConnect(device, authorized);
-                mBluetoothService.notifyIncomingA2dpConnection(address, false);
+                mBluetoothService.notifyIncomingA2dpConnection(address, true);
             }
         } else if (BluetoothUuid.isInputDevice(uuid)) {
             // We can have more than 1 input device connected.
