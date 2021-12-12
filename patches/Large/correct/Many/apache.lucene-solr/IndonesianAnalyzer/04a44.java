diff --git a/modules/analysis/common/src/java/org/apache/lucene/analysis/id/IndonesianAnalyzer.java b/modules/analysis/common/src/java/org/apache/lucene/analysis/id/IndonesianAnalyzer.java
index e4b78e8..210f9ae 100644
--- a/modules/analysis/common/src/java/org/apache/lucene/analysis/id/IndonesianAnalyzer.java
+++ b/modules/analysis/common/src/java/org/apache/lucene/analysis/id/IndonesianAnalyzer.java
@@ -120,7 +120,7 @@
       Reader reader) {
     final Tokenizer source = new StandardTokenizer(matchVersion, reader);
     TokenStream result = new StandardFilter(matchVersion, source);
-    result = new LowerCaseFilter(matchVersion, source);
+    result = new LowerCaseFilter(matchVersion, result);
     result = new StopFilter(matchVersion, result, stopwords);
     if (!stemExclusionSet.isEmpty()) {
       result = new KeywordMarkerFilter(result, stemExclusionSet);
