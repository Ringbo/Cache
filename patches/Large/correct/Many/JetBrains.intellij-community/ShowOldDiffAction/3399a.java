diff --git a/platform/diff-impl/src/com/intellij/diff/actions/impl/ShowOldDiffAction.java b/platform/diff-impl/src/com/intellij/diff/actions/impl/ShowOldDiffAction.java
index 6fd8557..352b65d 100644
--- a/platform/diff-impl/src/com/intellij/diff/actions/impl/ShowOldDiffAction.java
+++ b/platform/diff-impl/src/com/intellij/diff/actions/impl/ShowOldDiffAction.java
@@ -42,7 +42,7 @@
 
   @Override
   public void update(AnActionEvent e) {
-    if (ApplicationManager.getApplication().isInternal()) {
+    if (!ApplicationManager.getApplication().isInternal()) {
       e.getPresentation().setEnabledAndVisible(false);
       return;
     }
