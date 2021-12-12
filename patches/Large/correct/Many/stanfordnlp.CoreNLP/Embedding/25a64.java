diff --git a/src/edu/stanford/nlp/neural/Embedding.java b/src/edu/stanford/nlp/neural/Embedding.java
index 33b6a42..deab3e6 100644
--- a/src/edu/stanford/nlp/neural/Embedding.java
+++ b/src/edu/stanford/nlp/neural/Embedding.java
@@ -100,7 +100,7 @@
       }
       // check for end token
       if(word.equals("</s>")){
-        word = START_WORD;
+        word = END_WORD;
       }
 
       int dimOfWords = lineSplit.length - 1;
@@ -152,6 +152,7 @@
       String word = wordIterator.next();
 
       // check for unknown token
+      // FIXME cut and paste code
     if(word.equals("UNKNOWN") || word.equals("UUUNKKK") || word.equals("UNK") || word.equals("*UNKNOWN*") || word.equals("<unk>")){
         word = UNKNOWN_WORD;
       }
@@ -161,7 +162,7 @@
       }
       // check for end token
       if(word.equals("</s>")){
-        word = START_WORD;
+        word = END_WORD;
       }
 
       int dimOfWords = lineSplit.length;
