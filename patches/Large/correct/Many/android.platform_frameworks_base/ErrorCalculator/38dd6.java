diff --git a/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java b/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java
index 08d7667..d402699 100644
--- a/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java
+++ b/tests/CanvasCompare/src/com/android/test/hwuicompare/ErrorCalculator.java
@@ -54,7 +54,7 @@
         for (int i = 0; i < rowIndices.length; i++)
             rowIndices[i] = i * REGION_SIZE;
 
-        mScript = new ScriptC_errorCalculator(mRS, resources, R.raw.errorcalculator);
+        mScript = new ScriptC_errorCalculator(mRS);
         mScript.set_HEIGHT(height);
         mScript.set_WIDTH(width);
         mScript.set_REGION_SIZE(REGION_SIZE);
