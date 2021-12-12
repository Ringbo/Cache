diff --git a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleIoThread.java b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleIoThread.java
index 8bbc5b5..bd990d2 100644
--- a/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleIoThread.java
+++ b/app/src/main/java/nodomain/freeyourgadget/gadgetbridge/service/devices/pebble/PebbleIoThread.java
@@ -595,7 +595,7 @@
         }
     }
 
-    private void writeInstallApp(byte[] bytes) {
+    synchronized private void writeInstallApp(byte[] bytes) {
         if (!mIsInstalling) {
             return;
         }
