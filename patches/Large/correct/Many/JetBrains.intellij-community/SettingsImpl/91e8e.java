diff --git a/platform/platform-impl/src/com/intellij/openapi/editor/impl/SettingsImpl.java b/platform/platform-impl/src/com/intellij/openapi/editor/impl/SettingsImpl.java
index 9365636..9864763 100644
--- a/platform/platform-impl/src/com/intellij/openapi/editor/impl/SettingsImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/editor/impl/SettingsImpl.java
@@ -334,7 +334,7 @@
     PsiFile file = getPsiFile(project);
     return file != null
            ? CodeStyle.getIndentOptions(file).USE_TAB_CHARACTER
-           : CodeStyle.getSettings(project).getIndentOptions(null).USE_TAB_CHARACTER;
+           : CodeStyle.getProjectOrDefaultSettings(project).getIndentOptions(null).USE_TAB_CHARACTER;
   }
 
   @Override
