diff --git a/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java b/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java
index 281fb2b..da4b931 100644
--- a/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java
@@ -370,7 +370,8 @@
         CoreAnnotations.IndexAnnotation.class,
         CoreAnnotations.OriginalTextAnnotation.class,
         CoreAnnotations.ValueAnnotation.class,
-        CoreAnnotations.IsNewlineAnnotation.class
+        CoreAnnotations.IsNewlineAnnotation.class,
+        CoreAnnotations.TokenIndexAnnotation.class
     ));
   }
 
