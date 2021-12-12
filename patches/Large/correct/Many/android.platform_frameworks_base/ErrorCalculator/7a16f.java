diff --git a/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java b/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java
index a08b558..9e3ab42 100644
--- a/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java
+++ b/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java
@@ -57,7 +57,7 @@
         for (int i = 0; i < rowIndices.length; i++)
             rowIndices[i] = i * REGION_SIZE;
 
-        mScript = new ScriptC_errorCalculator(mRS, resources, R.raw.errorcalculator);
+        mScript = new ScriptC_errorCalculator(mRS);
         mScript.set_HEIGHT(height);
         mScript.set_WIDTH(width);
         mScript.set_REGION_SIZE(REGION_SIZE);
