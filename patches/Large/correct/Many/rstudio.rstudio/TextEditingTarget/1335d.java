diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java
index 0fea8c5..7f8883d 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java
@@ -3291,7 +3291,7 @@
                isCommentAction = true;
          }
          
-         if (docDisplay_.getFileType().isRmd())
+         if (docDisplay_.getFileType().isR())
          {
             if (!looksLikeRoxygen)
             {
