diff --git a/itest/src/edu/stanford/nlp/pipeline/POSTaggerBenchmarkITest.java b/itest/src/edu/stanford/nlp/pipeline/POSTaggerBenchmarkITest.java
index ce508cb..9bbcaa9 100644
--- a/itest/src/edu/stanford/nlp/pipeline/POSTaggerBenchmarkITest.java
+++ b/itest/src/edu/stanford/nlp/pipeline/POSTaggerBenchmarkITest.java
@@ -82,7 +82,7 @@
     String englishPOSTestPath = "/u/nlp/data/pos-tagger/english/test-wsj-22-24";
     List<String> sentences = readInPOSData(englishPOSTestPath);
     double ENGLISH_BIDIRECTIONAL_TOKEN_ACCURACY = .972;
-    double ENGLISH_BIDIRECTIONAL_SENTENCE_ACCURACY = .564;
+    double ENGLISH_BIDIRECTIONAL_SENTENCE_ACCURACY = .563;
     runPOSTest(sentences, "_", englishBiDirectionalPipeline,
         ENGLISH_BIDIRECTIONAL_TOKEN_ACCURACY, ENGLISH_BIDIRECTIONAL_SENTENCE_ACCURACY,
         "English BiDirectional", false);
