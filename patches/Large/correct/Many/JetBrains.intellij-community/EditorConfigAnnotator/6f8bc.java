diff --git a/plugins/editorconfig/src/org/editorconfig/annotations/EditorConfigAnnotator.java b/plugins/editorconfig/src/org/editorconfig/annotations/EditorConfigAnnotator.java
index c4c9eab..7df4618 100644
--- a/plugins/editorconfig/src/org/editorconfig/annotations/EditorConfigAnnotator.java
+++ b/plugins/editorconfig/src/org/editorconfig/annotations/EditorConfigAnnotator.java
@@ -89,7 +89,7 @@
 
         @Override
         public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
-          return false;
+          return true;
         }
 
         @Override
