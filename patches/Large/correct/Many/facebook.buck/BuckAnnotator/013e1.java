diff --git a/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/annotator/BuckAnnotator.java b/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/annotator/BuckAnnotator.java
index 19d5a23..43725b3 100644
--- a/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/annotator/BuckAnnotator.java
+++ b/tools/ideabuck/src/com/facebook/buck/intellij/ideabuck/annotator/BuckAnnotator.java
@@ -173,7 +173,7 @@
           buckTargetLocator.resolve(sourceFile, buckTargetPattern).orElse(null);
       if (absolutePattern == null) {
         Annotation annotation =
-            annotationHolder.createErrorAnnotation(expression, "Cannot resolve target pattern");
+            annotationHolder.createWarningAnnotation(expression, "Cannot resolve target pattern");
         annotation.setTextAttributes(BuckSyntaxHighlighter.BUCK_INVALID_TARGET);
         return true;
       }
@@ -200,7 +200,7 @@
               .map(path -> "Cannot find file at " + path.toString())
               .orElse("Cannot resolve path from target pattern");
       annotationHolder
-          .createErrorAnnotation(expression, message)
+          .createWarningAnnotation(expression, message)
           .setTextAttributes(BuckSyntaxHighlighter.BUCK_INVALID_TARGET);
       return true;
     }
