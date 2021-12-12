diff --git a/src/edu/stanford/nlp/pipeline/CoreDocument.java b/src/edu/stanford/nlp/pipeline/CoreDocument.java
index 036155d..ac5727b 100644
--- a/src/edu/stanford/nlp/pipeline/CoreDocument.java
+++ b/src/edu/stanford/nlp/pipeline/CoreDocument.java
@@ -34,7 +34,7 @@
     if (this.annotationDocument.get(CoreAnnotations.SentencesAnnotation.class) != null) {
       wrapSentences();
       // if there are entity mentions, build a document wide list
-      if (sentences.get(0).entityMentions() != null) {
+      if (sentences.size() > 0 && sentences.get(0).entityMentions() != null) {
         buildDocumentEntityMentionsList();
       }
       // if there are quotes, build a document wide list
