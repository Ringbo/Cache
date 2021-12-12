diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/AbstractFlashcardViewer.java b/AnkiDroid/src/main/java/com/ichi2/anki/AbstractFlashcardViewer.java
index 5998177..8d6017f 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/AbstractFlashcardViewer.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/AbstractFlashcardViewer.java
@@ -770,7 +770,7 @@
             sb.append(">\n</center>\n");
         } else {
             sb.append("<span id=typeans class=\"typePrompt");
-            if (mPrefWriteAnswers) {
+            if (!mPrefWriteAnswers) {
                 sb.append(" typeOff");
             }
             sb.append("\">........</span>");
