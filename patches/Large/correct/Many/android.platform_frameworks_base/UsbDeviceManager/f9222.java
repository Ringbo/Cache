diff --git a/services/usb/java/com/android/server/usb/UsbDeviceManager.java b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
index a7180c9..a5797c0 100644
--- a/services/usb/java/com/android/server/usb/UsbDeviceManager.java
+++ b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
@@ -1032,7 +1032,9 @@
                     if (DEBUG) {
                         Slog.v(TAG, "Accessory mode enter timeout: " + mConnected);
                     }
-                    if (!mConnected) {
+                    if (!mConnected || !UsbManager.containsFunction(
+                            mCurrentFunctions,
+                            UsbManager.USB_FUNCTION_ACCESSORY)) {
                         notifyAccessoryModeExit();
                     }
                     break;
