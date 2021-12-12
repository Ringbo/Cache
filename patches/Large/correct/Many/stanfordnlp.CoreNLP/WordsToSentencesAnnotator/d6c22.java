diff --git a/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java b/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java
index b5123e5..65b62a4 100644
--- a/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/WordsToSentencesAnnotator.java
@@ -332,7 +332,8 @@
         CoreAnnotations.TextAnnotation.class,
         CoreAnnotations.TokensAnnotation.class,
         CoreAnnotations.CharacterOffsetBeginAnnotation.class,
-        CoreAnnotations.CharacterOffsetEndAnnotation.class
+        CoreAnnotations.CharacterOffsetEndAnnotation.class,
+        CoreAnnotations.IsNewlineAnnotation.class
     )));
   }
 
