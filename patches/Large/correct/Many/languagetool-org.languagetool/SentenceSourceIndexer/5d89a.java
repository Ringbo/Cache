diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/SentenceSourceIndexer.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/SentenceSourceIndexer.java
index 38cc380..5dc18ab 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/SentenceSourceIndexer.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/wikipedia/SentenceSourceIndexer.java
@@ -71,7 +71,7 @@
       }
       indexer.index(sentence.getSentence(), sentence.getSource(), true, sentenceCount);
       sentenceCount++;
-      if (sentenceCount > maxDocs) {
+      if (sentenceCount >= maxDocs) {
         throw new DocumentLimitReachedException(maxDocs);
       }
     }
