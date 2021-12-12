diff --git a/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java b/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java
index ebdbe23..f064315 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java
@@ -210,7 +210,7 @@
         assertEquals(worldVocab.getWordFrequency(), 1, 0);
 
         assertEquals(strangeVocab.getWord(), "strange");
-        assertEquals(strangeVocab.getWordFrequency(), 2, 0);
+        assertEquals(strangeVocab.getElementFrequency(), 2, 0);
 
         sc.stop();
     }
@@ -348,7 +348,7 @@
         TextPipeline pipeline = new TextPipeline(corpusRDD, broadcastTokenizerVarMap);
         pipeline.buildVocabCache();
         pipeline.buildVocabWordListRDD();
-        VocabCache vocabCache = pipeline.getVocabCache();
+        VocabCache<VocabWord> vocabCache = pipeline.getVocabCache();
         Huffman huffman = new Huffman(vocabCache.vocabWords());
         huffman.build();
 
