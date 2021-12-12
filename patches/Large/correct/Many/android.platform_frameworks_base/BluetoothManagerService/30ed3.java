diff --git a/services/java/com/android/server/BluetoothManagerService.java b/services/java/com/android/server/BluetoothManagerService.java
index ce75e35..e7cd279 100755
--- a/services/java/com/android/server/BluetoothManagerService.java
+++ b/services/java/com/android/server/BluetoothManagerService.java
@@ -481,7 +481,7 @@
                             mHandler.sendMessageDelayed(timeoutMsg,TIMEOUT_BIND_MS);
                             Intent i = new Intent(IBluetooth.class.getName());
                             if (!mContext.bindService(i, mConnection,
-                                                  Context.BIND_AUTO_CREATE)) {
+                                  Context.BIND_AUTO_CREATE, UserHandle.USER_CURRENT)) {
                                 mHandler.removeMessages(MESSAGE_TIMEOUT_BIND);
                                 Log.e(TAG, "fail to bind to: " + IBluetooth.class.getName());
                             }
@@ -717,7 +717,8 @@
                 mHandler.sendMessageDelayed(timeoutMsg,TIMEOUT_BIND_MS);
                 mConnection.setGetNameAddressOnly(false);
                 Intent i = new Intent(IBluetooth.class.getName());
-                if (!mContext.bindService(i, mConnection,Context.BIND_AUTO_CREATE)) {
+                if (!mContext.bindService(i, mConnection, Context.BIND_AUTO_CREATE,
+                                          UserHandle.USER_CURRENT)) {
                     mHandler.removeMessages(MESSAGE_TIMEOUT_BIND);
                     Log.e(TAG, "Fail to bind to: " + IBluetooth.class.getName());
                 }
