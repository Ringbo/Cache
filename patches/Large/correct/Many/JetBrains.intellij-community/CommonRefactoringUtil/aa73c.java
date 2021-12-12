diff --git a/platform/lang-api/src/com/intellij/refactoring/util/CommonRefactoringUtil.java b/platform/lang-api/src/com/intellij/refactoring/util/CommonRefactoringUtil.java
index e442f94..7ae5549 100644
--- a/platform/lang-api/src/com/intellij/refactoring/util/CommonRefactoringUtil.java
+++ b/platform/lang-api/src/com/intellij/refactoring/util/CommonRefactoringUtil.java
@@ -84,7 +84,7 @@
     ApplicationManager.getApplication().invokeLater(new Runnable() {
       @Override
       public void run() {
-        if (editor == null) {
+        if (editor == null || editor.getComponent().getRootPane() == null) {
           showErrorMessage(title, message, helpId, project);
         }
         else {
