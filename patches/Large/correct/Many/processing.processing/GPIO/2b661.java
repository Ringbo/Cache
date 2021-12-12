diff --git a/java/libraries/io/src/processing/io/GPIO.java b/java/libraries/io/src/processing/io/GPIO.java
index a404212..8065794 100644
--- a/java/libraries/io/src/processing/io/GPIO.java
+++ b/java/libraries/io/src/processing/io/GPIO.java
@@ -450,7 +450,7 @@
    *  @webref
    */
   public static void waitFor(int pin, int mode) {
-    waitForInterrupt(pin, mode, -1);
+    waitFor(pin, mode, -1);
   }
 
 
