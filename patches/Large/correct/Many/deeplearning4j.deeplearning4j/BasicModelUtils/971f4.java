diff --git a/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/reader/impl/BasicModelUtils.java b/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/reader/impl/BasicModelUtils.java
index 92bcd37..e4d7d6d 100644
--- a/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/reader/impl/BasicModelUtils.java
+++ b/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/models/embeddings/reader/impl/BasicModelUtils.java
@@ -199,7 +199,7 @@
         List<String> realResults = new ArrayList<>();
 
         for (String word : tempRes) {
-            if (!positive.contains(word) && !negative.contains(negative) && realResults.size() < top)
+            if (!positive.contains(word) && !negative.contains(word) && realResults.size() < top)
                 realResults.add(word);
         }
 
