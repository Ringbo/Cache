diff --git a/core/src/main/java/com/google/zxing/oned/Code39Reader.java b/core/src/main/java/com/google/zxing/oned/Code39Reader.java
index f0ec83d..685354d 100644
--- a/core/src/main/java/com/google/zxing/oned/Code39Reader.java
+++ b/core/src/main/java/com/google/zxing/oned/Code39Reader.java
@@ -136,7 +136,7 @@
     int whiteSpaceAfterEnd = nextStart - lastStart - lastPatternSize;
     // If 50% of last pattern size, following last pattern, is not whitespace, fail
     // (but if it's whitespace to the very end of the image, that's OK)
-    if (nextStart != end && (whiteSpaceAfterEnd >> 1) < lastPatternSize) {
+    if (nextStart != end && (whiteSpaceAfterEnd << 1) < lastPatternSize) {
       throw NotFoundException.getNotFoundInstance();
     }
 
