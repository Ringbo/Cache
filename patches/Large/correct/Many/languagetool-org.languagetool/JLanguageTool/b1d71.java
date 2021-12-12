diff --git a/trunk/JLanguageTool/src/java/org/languagetool/JLanguageTool.java b/trunk/JLanguageTool/src/java/org/languagetool/JLanguageTool.java
index db823ce..32bd9e1 100644
--- a/trunk/JLanguageTool/src/java/org/languagetool/JLanguageTool.java
+++ b/trunk/JLanguageTool/src/java/org/languagetool/JLanguageTool.java
@@ -637,7 +637,7 @@
     if (lastLineBreakPosInError == -1) {
       endColumn = sentencePartToEndOfError.length() + columnCount + 1;
     } else {
-      endColumn = sentencePartToEndOfError.length() - lastLineBreakPos;
+      endColumn = sentencePartToEndOfError.length() - lastLineBreakPosInError;
     }
     final int lineBreaksToError = countLineBreaks(sentencePartToError);
     final int lineBreaksToEndOfError = countLineBreaks(sentencePartToEndOfError);
