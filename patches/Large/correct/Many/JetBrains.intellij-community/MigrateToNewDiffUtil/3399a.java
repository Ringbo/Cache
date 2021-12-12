diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/migrate/MigrateToNewDiffUtil.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/migrate/MigrateToNewDiffUtil.java
index 65a1686..87d2d40 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/migrate/MigrateToNewDiffUtil.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/changes/actions/migrate/MigrateToNewDiffUtil.java
@@ -274,7 +274,7 @@
 
     @Override
     public void update(AnActionEvent e) {
-      if (ApplicationManager.getApplication().isInternal()) {
+      if (!ApplicationManager.getApplication().isInternal()) {
         e.getPresentation().setEnabledAndVisible(false);
         return;
       }
