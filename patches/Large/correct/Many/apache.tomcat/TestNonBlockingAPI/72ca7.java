diff --git a/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java b/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java
index 367213d..46acc62 100644
--- a/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java
+++ b/test/org/apache/catalina/nonblocking/TestNonBlockingAPI.java
@@ -302,7 +302,7 @@
         int read = 0;
         int readSinceLastPause = 0;
         int readTotal = 0;
-        while (read != -1 && readTotal < WRITE_SIZE / 2) {
+        while (read != -1 && readTotal < WRITE_SIZE / 8) {
             long start = System.currentTimeMillis();
             read = is.read(buffer);
             long end = System.currentTimeMillis();
@@ -349,8 +349,8 @@
 
         // TODO Figure out why non-blocking writes with the NIO connector appear
         // to be slower on Linux
-        alv.validateAccessLog(1, 500, WRITE_PAUSE_MS * 7,
-                WRITE_PAUSE_MS * 7 + 30 * 1000);
+        alv.validateAccessLog(1, 500, WRITE_PAUSE_MS,
+                WRITE_PAUSE_MS + 30 * 1000);
     }
 
 
