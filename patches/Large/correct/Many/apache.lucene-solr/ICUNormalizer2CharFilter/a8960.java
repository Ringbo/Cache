diff --git a/lucene/analysis/icu/src/java/org/apache/lucene/analysis/icu/ICUNormalizer2CharFilter.java b/lucene/analysis/icu/src/java/org/apache/lucene/analysis/icu/ICUNormalizer2CharFilter.java
index 13d1c95..e7f6516 100644
--- a/lucene/analysis/icu/src/java/org/apache/lucene/analysis/icu/ICUNormalizer2CharFilter.java
+++ b/lucene/analysis/icu/src/java/org/apache/lucene/analysis/icu/ICUNormalizer2CharFilter.java
@@ -104,7 +104,9 @@
 
     // if checkedInputBoundary was at the end of a buffer, we need to check that char again
     checkedInputBoundary = Math.max(checkedInputBoundary - 1, 0);
-    if (normalizer.isInert(tmpBuffer[len - 1]) && !Character.isHighSurrogate(tmpBuffer[len-1])) {
+    // this loop depends on 'isInert' (changes under normalization) but looks only at characters.
+    // so we treat all surrogates as non-inert for simplicity
+    if (normalizer.isInert(tmpBuffer[len - 1]) && !Character.isSurrogate(tmpBuffer[len-1])) {
       return len;
     } else return len + readInputToBuffer();
   }
