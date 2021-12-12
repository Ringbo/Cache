diff --git a/platform/diff-impl/src/com/intellij/openapi/util/diff/impl/DiffRequestProcessor.java b/platform/diff-impl/src/com/intellij/openapi/util/diff/impl/DiffRequestProcessor.java
index 645b407..c3dac57 100644
--- a/platform/diff-impl/src/com/intellij/openapi/util/diff/impl/DiffRequestProcessor.java
+++ b/platform/diff-impl/src/com/intellij/openapi/util/diff/impl/DiffRequestProcessor.java
@@ -345,7 +345,7 @@
     @Override
     public void update(AnActionEvent e) {
       if (!ExternalDiffTool.isEnabled()) {
-        e.getPresentation().setVisible(false);
+        e.getPresentation().setEnabledAndVisible(false);
         return;
       }
       e.getPresentation().setEnabled(ExternalDiffTool.canShow(myActiveRequest));
@@ -556,7 +556,7 @@
     @Override
     public void update(@NotNull AnActionEvent e) {
       if (!isNavigationEnabled()) {
-        e.getPresentation().setVisible(false);
+        e.getPresentation().setEnabledAndVisible(false);
         return;
       }
 
@@ -574,7 +574,7 @@
     @Override
     public void update(@NotNull AnActionEvent e) {
       if (!isNavigationEnabled()) {
-        e.getPresentation().setVisible(false);
+        e.getPresentation().setEnabledAndVisible(false);
         return;
       }
 
