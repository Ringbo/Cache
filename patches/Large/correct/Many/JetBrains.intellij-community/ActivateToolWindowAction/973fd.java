diff --git a/platform/platform-impl/src/com/intellij/ide/actions/ActivateToolWindowAction.java b/platform/platform-impl/src/com/intellij/ide/actions/ActivateToolWindowAction.java
index 5a409d8..fc05f1a 100644
--- a/platform/platform-impl/src/com/intellij/ide/actions/ActivateToolWindowAction.java
+++ b/platform/platform-impl/src/com/intellij/ide/actions/ActivateToolWindowAction.java
@@ -45,7 +45,7 @@
   public void update(AnActionEvent event){
     Presentation presentation = event.getPresentation();
     Project project = event.getData(CommonDataKeys.PROJECT);
-    if (project == null) {
+    if (project == null || project.isDisposed()) {
       presentation.setEnabled(false);
       presentation.setVisible(false);
       return;
