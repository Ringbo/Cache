diff --git a/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java b/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java
index 07626a3..327ff06 100644
--- a/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java
+++ b/tests/RenderScriptTests/ImageProcessing/src/com/android/rs/image/ImageProcessingActivity.java
@@ -168,10 +168,10 @@
             mTest = new Vignette(true, true);
             break;
         case 15:
-            mTest = new GroupTest(true);
+            mTest = new GroupTest(false);
             break;
         case 16:
-            mTest = new GroupTest(false);
+            mTest = new GroupTest(true);
             break;
         case 17:
             mTest = new Intrinsics(0);
