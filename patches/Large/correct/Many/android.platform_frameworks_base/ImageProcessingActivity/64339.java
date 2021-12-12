diff --git a/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java b/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java
index c171a64..a8462e6 100644
--- a/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java
+++ b/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java
@@ -377,7 +377,7 @@
         long result = 0;
 
         //Log.v(TAG, "Warming");
-        long t = java.lang.System.currentTimeMillis() + 2000;
+        long t = java.lang.System.currentTimeMillis() + 250;
         do {
             mTest.runTest();
             mTest.finish();
@@ -391,7 +391,7 @@
             mTest.runTest();
             mTest.finish();
             ct++;
-        } while ((t+5000) > java.lang.System.currentTimeMillis());
+        } while ((t+1000) > java.lang.System.currentTimeMillis());
         t = java.lang.System.currentTimeMillis() - t;
         float ft = (float)t;
         ft /= ct;
