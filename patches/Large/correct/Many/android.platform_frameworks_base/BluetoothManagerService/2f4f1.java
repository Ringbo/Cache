diff --git a/services/core/java/com/android/server/BluetoothManagerService.java b/services/core/java/com/android/server/BluetoothManagerService.java
index 763a4e4..d9713a5 100644
--- a/services/core/java/com/android/server/BluetoothManagerService.java
+++ b/services/core/java/com/android/server/BluetoothManagerService.java
@@ -1628,7 +1628,7 @@
 
                         //Do enable request
                         try {
-                            if (mQuietEnable) {
+                            if (!mQuietEnable) {
                                 if (!mBluetooth.enable()) {
                                     Slog.e(TAG, "IBluetooth.enable() returned false");
                                 }
