diff --git a/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java b/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java
index 3d55f6b..8bfcb77 100644
--- a/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java
+++ b/platform/lang-impl/src/com/intellij/refactoring/rename/inplace/VariableInplaceRenamer.java
@@ -836,7 +836,7 @@
             if (templateState != null) {
               final TextRange range = templateState.getCurrentVariableRange();
               if (range != null) {
-                myEditor.getDocument().replaceString(range.getStartOffset(), range.getEndOffset(), suggestion);
+                topLevelEditor.getDocument().replaceString(range.getStartOffset(), range.getEndOffset(), suggestion);
               }
             }
           }
