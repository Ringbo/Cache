diff --git a/spellchecker/src/com/intellij/spellchecker/tokenizer/EscapeSequenceTokenizer.java b/spellchecker/src/com/intellij/spellchecker/tokenizer/EscapeSequenceTokenizer.java
index b9ab653..5f6c9c2 100644
--- a/spellchecker/src/com/intellij/spellchecker/tokenizer/EscapeSequenceTokenizer.java
+++ b/spellchecker/src/com/intellij/spellchecker/tokenizer/EscapeSequenceTokenizer.java
@@ -28,7 +28,7 @@
     StringBuilder currentToken = new StringBuilder();
     int currentTokenStart = startOffset;
     for (int i = 0; i < unescapedText.length(); i++) {
-      if (offsets[i+1]-offsets[i] == 1) {
+      if (offsets[i+1]-offsets[i] == 1 || !Character.isWhitespace(unescapedText.charAt(i))) {
         if (currentToken.length() == 0) {
           currentTokenStart = offsets[i] + startOffset;
         }
