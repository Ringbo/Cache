diff --git a/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/paragraphvectors/ParagraphVectorsTest.java b/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/paragraphvectors/ParagraphVectorsTest.java
index 40cf5cd..f116e9d 100644
--- a/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/paragraphvectors/ParagraphVectorsTest.java
+++ b/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/paragraphvectors/ParagraphVectorsTest.java
@@ -933,8 +933,7 @@
     @Ignore
     @Test
     public void testGoogleModelForInference() throws Exception {
-        WordVectors googleVectors = WordVectorSerializer.loadGoogleModelNonNormalized(
-                        new File("/ext/GoogleNews-vectors-negative300.bin.gz"), true, false);
+        WordVectors googleVectors = WordVectorSerializer.readWord2VecModel(new File("/ext/GoogleNews-vectors-negative300.bin.gz"));
 
         TokenizerFactory t = new DefaultTokenizerFactory();
         t.setTokenPreProcessor(new CommonPreprocessor());
