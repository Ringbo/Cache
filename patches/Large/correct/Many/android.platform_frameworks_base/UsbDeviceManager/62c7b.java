diff --git a/services/java/com/android/server/usb/UsbDeviceManager.java b/services/java/com/android/server/usb/UsbDeviceManager.java
index 86de880..91c5e33 100644
--- a/services/java/com/android/server/usb/UsbDeviceManager.java
+++ b/services/java/com/android/server/usb/UsbDeviceManager.java
@@ -382,7 +382,7 @@
                 mAdbEnabled = enable;
                 // Due to the persist.sys.usb.config property trigger, changing adb state requires
                 // switching to default function
-                setEnabledFunctions(mDefaultFunctions, false);
+                setEnabledFunctions(mDefaultFunctions, true);
                 updateAdbNotification();
             }
         }
