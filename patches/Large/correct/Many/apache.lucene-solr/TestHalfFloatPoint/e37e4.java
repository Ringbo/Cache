diff --git a/lucene/sandbox/src/test/org/apache/lucene/document/TestHalfFloatPoint.java b/lucene/sandbox/src/test/org/apache/lucene/document/TestHalfFloatPoint.java
index d280944..a24d992 100644
--- a/lucene/sandbox/src/test/org/apache/lucene/document/TestHalfFloatPoint.java
+++ b/lucene/sandbox/src/test/org/apache/lucene/document/TestHalfFloatPoint.java
@@ -105,7 +105,7 @@
         assertEquals(Float.floatToIntBits(f), Float.floatToIntBits(rounded), 0f);
       } else if (Float.isFinite(rounded) == false) {
         assertFalse(Float.isNaN(rounded));
-        assertTrue(Math.abs(f) > 65520);
+        assertTrue(Math.abs(f) >= 65520);
       } else {
         int index = Arrays.binarySearch(values, f);
         float closest;
