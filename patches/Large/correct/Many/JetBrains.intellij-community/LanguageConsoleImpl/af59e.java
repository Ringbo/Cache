diff --git a/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java b/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
index e12c24e..af25959 100644
--- a/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
+++ b/platform/lang-impl/src/com/intellij/execution/console/LanguageConsoleImpl.java
@@ -497,7 +497,7 @@
         if (file != myFile.getVirtualFile()) return;
         if (myConsoleEditor != null) {
           queueUiUpdate(false);
-          for (FileEditor fileEditor : source.getAllEditors()) {
+          for (FileEditor fileEditor : source.getAllEditors(file)) {
             if (!(fileEditor instanceof TextEditor)) continue;
             final Editor editor = ((TextEditor)fileEditor).getEditor();
             registerActionShortcuts(editor.getComponent());
