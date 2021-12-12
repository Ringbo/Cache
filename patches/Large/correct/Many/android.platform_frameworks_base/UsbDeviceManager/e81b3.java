diff --git a/services/usb/java/com/android/server/usb/UsbDeviceManager.java b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
index 7f813ec..3160e39 100644
--- a/services/usb/java/com/android/server/usb/UsbDeviceManager.java
+++ b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
@@ -753,7 +753,7 @@
                                         UsbManager.USB_FUNCTION_MTP)
                                 || UsbManager.containsFunction(mCurrentFunctions,
                                         UsbManager.USB_FUNCTION_PTP);
-                        if (active && mCurrentUser != UserHandle.USER_NULL) {
+                        if (mUsbDataUnlocked && active && mCurrentUser != UserHandle.USER_NULL) {
                             Slog.v(TAG, "Current user switched to " + mCurrentUser
                                     + "; resetting USB host stack for MTP or PTP");
                             setEnabledFunctions(mCurrentFunctions, true);
