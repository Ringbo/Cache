diff --git a/dl4j-examples/src/main/java/org/deeplearning4j/examples/nlp/word2vec/Word2VecUptrainingExample.java b/dl4j-examples/src/main/java/org/deeplearning4j/examples/nlp/word2vec/Word2VecUptrainingExample.java
index e4517a3..8067683 100644
--- a/dl4j-examples/src/main/java/org/deeplearning4j/examples/nlp/word2vec/Word2VecUptrainingExample.java
+++ b/dl4j-examples/src/main/java/org/deeplearning4j/examples/nlp/word2vec/Word2VecUptrainingExample.java
@@ -93,7 +93,7 @@
         tokenizerFactory.setTokenPreProcessor(new CommonPreprocessor());
 
         word2Vec.setTokenizerFactory(tokenizerFactory);
-        word2Vec.setSentenceIter(iterator);
+        word2Vec.setSentenceIterator(iterator);
 
 
         log.info("Word2vec uptraining...");
