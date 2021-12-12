diff --git a/src/edu/stanford/nlp/pipeline/ChineseSegmenterAnnotator.java b/src/edu/stanford/nlp/pipeline/ChineseSegmenterAnnotator.java
index 163ec3f..ccef653 100644
--- a/src/edu/stanford/nlp/pipeline/ChineseSegmenterAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/ChineseSegmenterAnnotator.java
@@ -138,7 +138,7 @@
       String wordString = new String(ca);
 
       // if this word is a whitespace or a control character, set 'seg' to true for next word, and break
-      if (Character.isSpaceChar(origText.charAt(i)) || Character.isISOControl(origText.charAt(i))) {
+      if (Character.isWhitespace(origText.charAt(i)) || Character.isISOControl(origText.charAt(i))) {
         seg = true;
       } else {
         // if this word is a word, put it as a feature label and set seg to false for next word
