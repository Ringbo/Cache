diff --git a/services/usb/java/com/android/server/usb/UsbPortManager.java b/services/usb/java/com/android/server/usb/UsbPortManager.java
index 4b8e4c8..5e4854d 100644
--- a/services/usb/java/com/android/server/usb/UsbPortManager.java
+++ b/services/usb/java/com/android/server/usb/UsbPortManager.java
@@ -117,7 +117,7 @@
     public UsbPortManager(Context context) {
         mContext = context;
         try {
-            boolean ret = IServiceManager.getService("manager")
+            boolean ret = IServiceManager.getService()
                     .registerForNotifications("android.hardware.usb@1.0::IUsb",
                     "", mServiceNotification);
             if (!ret) {
