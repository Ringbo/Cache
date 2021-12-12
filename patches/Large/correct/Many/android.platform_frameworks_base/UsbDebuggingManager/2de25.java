diff --git a/services/usb/java/com/android/server/usb/UsbDebuggingManager.java b/services/usb/java/com/android/server/usb/UsbDebuggingManager.java
index b3900b9..8849acd 100644
--- a/services/usb/java/com/android/server/usb/UsbDebuggingManager.java
+++ b/services/usb/java/com/android/server/usb/UsbDebuggingManager.java
@@ -96,7 +96,7 @@
                 }
                 try {
                     listenToSocket();
-                } catch (IOException e) {
+                } catch (Exception e) {
                     /* Don't loop too fast if adbd dies, before init restarts it */
                     SystemClock.sleep(1000);
                 }
