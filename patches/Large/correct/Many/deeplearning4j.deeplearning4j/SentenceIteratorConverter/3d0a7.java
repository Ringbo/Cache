diff --git a/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/sentenceiterator/interoperability/SentenceIteratorConverter.java b/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/sentenceiterator/interoperability/SentenceIteratorConverter.java
index 4e9d983..731e313 100644
--- a/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/sentenceiterator/interoperability/SentenceIteratorConverter.java
+++ b/deeplearning4j-nlp-parent/deeplearning4j-nlp/src/main/java/org/deeplearning4j/text/sentenceiterator/interoperability/SentenceIteratorConverter.java
@@ -50,7 +50,7 @@
                 }
             } else {
                 String label = ((LabelAwareSentenceIterator) backendIterator).currentLabel();
-                if (labels != null) {
+                if (label != null) {
                     document.addLabel(label);
                     generator.storeLabel(label);
                 }
