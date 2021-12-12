diff --git a/deeplearning4j-scaleout/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/word2vec/WordVectorSerializerTest.java b/deeplearning4j-scaleout/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/word2vec/WordVectorSerializerTest.java
index 6d3401c..aa4bbee 100755
--- a/deeplearning4j-scaleout/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/word2vec/WordVectorSerializerTest.java
+++ b/deeplearning4j-scaleout/deeplearning4j-nlp/src/test/java/org/deeplearning4j/models/word2vec/WordVectorSerializerTest.java
@@ -68,7 +68,7 @@
             textFile = new ClassPathResource("word2vecserialization/google_news_30.txt").getFile();
         }
         if(binaryFile == null) {
-            binaryFile = new ClassPathResource("word2vecserialization/google_news_30.bin.gz").getFile();
+            binaryFile = new ClassPathResource("word2vecserialization/google_news_30.bin.gz").getFile(".gz");
         }
         pathToWriteto =  new ClassPathResource("word2vecserialization/testing_word2vec_serialization.txt")
                 .getFile().getAbsolutePath();
