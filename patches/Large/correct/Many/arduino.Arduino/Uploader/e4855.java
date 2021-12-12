diff --git a/arduino-core/src/cc/arduino/packages/Uploader.java b/arduino-core/src/cc/arduino/packages/Uploader.java
index cfec57b..54b5c7a 100644
--- a/arduino-core/src/cc/arduino/packages/Uploader.java
+++ b/arduino-core/src/cc/arduino/packages/Uploader.java
@@ -132,8 +132,8 @@
       new MessageSiphon(process.getErrorStream(), this, 100);
 
       // wait for the process to finish, but not forever
-      // kill the flasher process after 2 minutes to avoid 100% cpu spinning
-      if (!process.waitFor(2, TimeUnit.MINUTES)) {
+      // kill the flasher process after 5 minutes to avoid 100% cpu spinning
+      if (!process.waitFor(5, TimeUnit.MINUTES)) {
         process.destroyForcibly();
       }
       if (!process.isAlive()) {
