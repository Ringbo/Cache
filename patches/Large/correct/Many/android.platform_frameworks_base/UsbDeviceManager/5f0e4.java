diff --git a/services/usb/java/com/android/server/usb/UsbDeviceManager.java b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
index 7cb176d..eddcbda 100644
--- a/services/usb/java/com/android/server/usb/UsbDeviceManager.java
+++ b/services/usb/java/com/android/server/usb/UsbDeviceManager.java
@@ -855,7 +855,7 @@
                         if (!mConnected) {
                             // restore defaults when USB is disconnected
                             Slog.i(TAG, "Disconnect, setting usb functions to null");
-                            setEnabledFunctions(null, false, false);
+                            setEnabledFunctions(null, true, false);
                         }
                         updateUsbFunctions();
                     } else {
