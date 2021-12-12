diff --git a/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java b/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java
index 6ad98a7..b904da5 100644
--- a/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/TokenizerAnnotator.java
@@ -358,7 +358,8 @@
         CoreAnnotations.PositionAnnotation.class,
         CoreAnnotations.IndexAnnotation.class,
         CoreAnnotations.OriginalTextAnnotation.class,
-        CoreAnnotations.ValueAnnotation.class
+        CoreAnnotations.ValueAnnotation.class,
+        CoreAnnotations.IsNewlineAnnotation.class
     ));
   }
 
