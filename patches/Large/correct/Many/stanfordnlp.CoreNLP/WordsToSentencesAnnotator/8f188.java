diff --git a/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java b/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java
index f8e0c1d..a0d4c51 100644
--- a/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java
@@ -358,7 +358,10 @@
         CoreAnnotations.TokensAnnotation.class,
         CoreAnnotations.CharacterOffsetBeginAnnotation.class,
         CoreAnnotations.CharacterOffsetEndAnnotation.class,
-        CoreAnnotations.IsNewlineAnnotation.class
+        CoreAnnotations.IsNewlineAnnotation.class,
+        CoreAnnotations.TokenBeginAnnotation.class,
+        CoreAnnotations.TokenEndAnnotation.class,
+        CoreAnnotations.OriginalTextAnnotation.class
     )));
   }
 
