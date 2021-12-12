diff --git a/test/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotatorTest.java b/test/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotatorTest.java
index 3b0848a..b11f7ab 100644
--- a/test/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotatorTest.java
+++ b/test/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotatorTest.java
@@ -92,7 +92,7 @@
     // make sure that there are the correct # of tokens
     // (does NOT contain NL tokens)
     List<CoreLabel> tokens = document1.get(CoreAnnotations.TokensAnnotation.class);
-    assertEquals(15, tokens.size());
+    assertEquals(13, tokens.size());
   }
 
   @Test
@@ -128,7 +128,7 @@
 
     // make sure that there are the correct # of tokens (does contain NL tokens)
     List<CoreLabel> tokens = document1.get(CoreAnnotations.TokensAnnotation.class);
-    assertEquals(12, tokens.size());
+    assertEquals(9, tokens.size());
   }
 
   @Test
@@ -149,7 +149,7 @@
 
     // make sure that there are the correct # of tokens (does contain NL tokens)
     List<CoreLabel> tokens = document1.get(CoreAnnotations.TokensAnnotation.class);
-    assertEquals(12, tokens.size());
+    assertEquals(9, tokens.size());
 
     List<CoreLabel> sentenceTwoTokens = sentences.get(1).get(CoreAnnotations.TokensAnnotation.class);
     String sentenceTwo = SentenceUtils.listToString(sentenceTwoTokens);
@@ -173,7 +173,7 @@
 
     // make sure that there are the correct # of tokens (count does contain NL tokens)
     List<CoreLabel> tokens = document1.get(CoreAnnotations.TokensAnnotation.class);
-    assertEquals(12, tokens.size());
+    assertEquals(9, tokens.size());
 
     for (int i = 0; i < Math.min(sents.length, sentences.size()); i++) {
       CoreMap sentence = sentences.get(i);
