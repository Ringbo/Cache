diff --git a/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java b/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java
index 8ed4507..29f43e9 100644
--- a/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java
+++ b/deeplearning4j-scaleout/spark/dl4j-spark-nlp/src/test/java/org/deeplearning4j/spark/text/TextPipelineTest.java
@@ -170,19 +170,19 @@
 
 
         assertEquals(redVocab.getWord(), "red");
-        assertEquals(redVocab.getIndex(), 0);
+        assertEquals(redVocab.getIndex(), 1);
         assertEquals(redVocab.getWordFrequency(), 1, 0);
 
         assertEquals(flowerVocab.getWord(), "flowers");
-        assertEquals(flowerVocab.getIndex(), 1);
+        assertEquals(flowerVocab.getIndex(), 2);
         assertEquals(flowerVocab.getWordFrequency(), 1, 0);
 
         assertEquals(worldVocab.getWord(), "world");
-        assertEquals(worldVocab.getIndex(), 2);
+        assertEquals(worldVocab.getIndex(), 3);
         assertEquals(worldVocab.getWordFrequency(), 1, 0);
 
         assertEquals(strangeVocab.getWord(), "strange");
-        assertEquals(strangeVocab.getIndex(), 3);
+        assertEquals(strangeVocab.getIndex(), 0);
         assertEquals(strangeVocab.getWordFrequency(), 2, 0);
 
         sc.stop();
@@ -205,19 +205,19 @@
         VocabWord strangeVocab = vocabCache.tokenFor("strange");
 
         assertEquals(redVocab.getWord(), "red");
-        assertEquals(redVocab.getIndex(), 0);
+        assertEquals(redVocab.getIndex(), 1);
         assertEquals(redVocab.getWordFrequency(), 1, 0);
 
         assertEquals(flowerVocab.getWord(), "flowers");
-        assertEquals(flowerVocab.getIndex(), 1);
+        assertEquals(flowerVocab.getIndex(), 2);
         assertEquals(flowerVocab.getWordFrequency(), 1, 0);
 
         assertEquals(worldVocab.getWord(), "world");
-        assertEquals(worldVocab.getIndex(), 2);
+        assertEquals(worldVocab.getIndex(), 3);
         assertEquals(worldVocab.getWordFrequency(), 1, 0);
 
         assertEquals(strangeVocab.getWord(), "strange");
-        assertEquals(strangeVocab.getIndex(), 3);
+        assertEquals(strangeVocab.getIndex(), 0);
         assertEquals(strangeVocab.getWordFrequency(), 2, 0);
 
         sc.stop();
