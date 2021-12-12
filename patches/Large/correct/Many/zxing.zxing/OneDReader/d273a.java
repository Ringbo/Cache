diff --git a/core/src/com/google/zxing/oned/OneDReader.java b/core/src/com/google/zxing/oned/OneDReader.java
index fc8bd8d..0717c5d 100644
--- a/core/src/com/google/zxing/oned/OneDReader.java
+++ b/core/src/com/google/zxing/oned/OneDReader.java
@@ -103,7 +103,7 @@
 
     int middle = height >> 1;
     boolean tryHarder = hints != null && hints.containsKey(DecodeHintType.TRY_HARDER);
-    int rowStep = Math.max(1, height >> (tryHarder ? 7 : 4));
+    int rowStep = Math.max(1, height >> (tryHarder ? 8 : 4));
     int maxLines;
     if (tryHarder) {
       maxLines = height; // Look at the whole image, not just the center
