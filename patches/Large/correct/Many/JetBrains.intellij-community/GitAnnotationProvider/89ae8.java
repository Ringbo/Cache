diff --git a/plugins/git4idea/src/git4idea/annotate/GitAnnotationProvider.java b/plugins/git4idea/src/git4idea/annotate/GitAnnotationProvider.java
index 2e1f073..e849b8d 100644
--- a/plugins/git4idea/src/git4idea/annotate/GitAnnotationProvider.java
+++ b/plugins/git4idea/src/git4idea/annotate/GitAnnotationProvider.java
@@ -198,7 +198,7 @@
         if (revisions == null) return;
         ApplicationManager.getApplication().invokeLater(() -> {
           GitFileAnnotation newFileAnnotation = new GitFileAnnotation(fileAnnotation);
-          fileAnnotation.setRevisions(revisions);
+          newFileAnnotation.setRevisions(revisions);
           fileAnnotation.reload(newFileAnnotation);
         });
       },
