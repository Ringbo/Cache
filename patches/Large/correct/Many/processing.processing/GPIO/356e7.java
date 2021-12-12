diff --git a/java/libraries/io/src/processing/io/GPIO.java b/java/libraries/io/src/processing/io/GPIO.java
index a0f6b92..711aafd 100644
--- a/java/libraries/io/src/processing/io/GPIO.java
+++ b/java/libraries/io/src/processing/io/GPIO.java
@@ -389,14 +389,14 @@
     }
 
     // we need to give udev some time to change the file permissions behind our back
-    // retry for 500ms when writing to the file fails with -EPERM
+    // retry for 500ms when writing to the file fails with -EACCES
     long start = System.currentTimeMillis();
     do {
       ret = NativeInterface.writeFile(fn, out);
-      if (ret == -1) {
+      if (ret == -13) {
         Thread.yield();
       }
-    } while (ret == -1 && System.currentTimeMillis()-start < 500);
+    } while (ret == -13 && System.currentTimeMillis()-start < 500);
 
     if (ret < 0) {
       throw new RuntimeException(fn + ": " + NativeInterface.getError(ret));
