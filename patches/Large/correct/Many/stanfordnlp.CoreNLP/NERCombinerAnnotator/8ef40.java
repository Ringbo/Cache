diff --git a/src/edu/stanford/nlp/pipeline/NERCombinerAnnotator.java b/src/edu/stanford/nlp/pipeline/NERCombinerAnnotator.java
index f524de8..7e4053e 100644
--- a/src/edu/stanford/nlp/pipeline/NERCombinerAnnotator.java
+++ b/src/edu/stanford/nlp/pipeline/NERCombinerAnnotator.java
@@ -363,7 +363,8 @@
           CoreAnnotations.IndexAnnotation.class,
           CoreAnnotations.OriginalTextAnnotation.class,
           CoreAnnotations.SentenceIndexAnnotation.class,
-          CoreAnnotations.IsNewlineAnnotation.class
+          CoreAnnotations.IsNewlineAnnotation.class,
+          CoreAnnotations.TokenIndexAnnotation.class
       )));
     } else {
       return Collections.unmodifiableSet(new HashSet<>(Arrays.asList(
@@ -379,7 +380,8 @@
           CoreAnnotations.IndexAnnotation.class,
           CoreAnnotations.OriginalTextAnnotation.class,
           CoreAnnotations.SentenceIndexAnnotation.class,
-          CoreAnnotations.IsNewlineAnnotation.class
+          CoreAnnotations.IsNewlineAnnotation.class,
+          CoreAnnotations.TokenIndexAnnotation.class
       )));
     }
   }
