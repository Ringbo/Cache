diff --git a/languagetool-wikipedia/src/main/java/org/languagetool/dev/dumpcheck/SentenceSource.java b/languagetool-wikipedia/src/main/java/org/languagetool/dev/dumpcheck/SentenceSource.java
index 3bb5a23..0486c77 100644
--- a/languagetool-wikipedia/src/main/java/org/languagetool/dev/dumpcheck/SentenceSource.java
+++ b/languagetool-wikipedia/src/main/java/org/languagetool/dev/dumpcheck/SentenceSource.java
@@ -32,7 +32,7 @@
 abstract class SentenceSource implements Iterator<Sentence> {
 
   private static final int MIN_SENTENCE_SIZE = 10;
-  private static final int MIN_SENTENCE_TOKEN_COUNT = 3;
+  private static final int MIN_SENTENCE_TOKEN_COUNT = 4;
   private static final int MAX_SENTENCE_LENGTH = 300;
 
   private final Tokenizer wordTokenizer;
@@ -73,7 +73,7 @@
     int realTokens = 0;
     List<String> allTokens = wordTokenizer.tokenize(sentence);
     for (String token : allTokens) {
-      if (token.trim().isEmpty()) {
+      if (!token.trim().isEmpty()) {
         realTokens++;
       }
     }
