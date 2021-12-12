diff --git a/source/com/intellij/codeInsight/actions/ReformatCodeAction.java b/source/com/intellij/codeInsight/actions/ReformatCodeAction.java
index f9fa1fa..34d4523 100644
--- a/source/com/intellij/codeInsight/actions/ReformatCodeAction.java
+++ b/source/com/intellij/codeInsight/actions/ReformatCodeAction.java
@@ -124,7 +124,7 @@
       }
 
       if (file.getLanguage().getFormattingModelBuilder() != null) {
-        presentation.setEnabled(false);
+        presentation.setEnabled(true);
         return;
       }
     }
