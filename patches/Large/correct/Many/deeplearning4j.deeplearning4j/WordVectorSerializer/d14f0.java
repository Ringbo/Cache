diff --git a/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/loader/WordVectorSerializer.java b/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/loader/WordVectorSerializer.java
index 92bbcf0..7a7c7ea 100755
--- a/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/loader/WordVectorSerializer.java
+++ b/deeplearning4j-scaleout/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/loader/WordVectorSerializer.java
@@ -469,7 +469,7 @@
         String line = null;
         boolean hasHeader = false;
         if (iter.hasNext()) {
-            line = iter.next();    // skip header line
+            line = iter.nextLine();    // skip header line
             //look for spaces
             if(!line.contains(" "))
                 hasHeader = true;
