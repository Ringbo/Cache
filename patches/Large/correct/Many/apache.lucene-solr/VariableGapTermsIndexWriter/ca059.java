diff --git a/lucene/src/java/org/apache/lucene/index/codecs/VariableGapTermsIndexWriter.java b/lucene/src/java/org/apache/lucene/index/codecs/VariableGapTermsIndexWriter.java
index 059bf57..65c2651 100644
--- a/lucene/src/java/org/apache/lucene/index/codecs/VariableGapTermsIndexWriter.java
+++ b/lucene/src/java/org/apache/lucene/index/codecs/VariableGapTermsIndexWriter.java
@@ -76,7 +76,7 @@
     @Override
     public boolean isIndexTerm(BytesRef term, TermStats stats) {
       if (count >= interval) {
-        count = 0;
+        count = 1;
         return true;
       } else {
         count++;
@@ -101,7 +101,7 @@
     @Override
     public boolean isIndexTerm(BytesRef term, TermStats stats) {
       if (stats.docFreq >= docFreqThresh || count >= interval) {
-        count = 0;
+        count = 1;
         return true;
       } else {
         count++;
