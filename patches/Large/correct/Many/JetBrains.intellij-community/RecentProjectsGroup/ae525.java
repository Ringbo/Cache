diff --git a/source/com/intellij/ide/actions/RecentProjectsGroup.java b/source/com/intellij/ide/actions/RecentProjectsGroup.java
index 41b639d..b6e6f9c 100644
--- a/source/com/intellij/ide/actions/RecentProjectsGroup.java
+++ b/source/com/intellij/ide/actions/RecentProjectsGroup.java
@@ -8,11 +8,11 @@
 
 public class RecentProjectsGroup extends ActionGroup {
   public AnAction[] getChildren(AnActionEvent e) {
-    return RecentProjectsManager.getInstance().getRecentProjectsActions();
+    return RecentProjectsManager.getInstance().getRecentProjectsActions(true);
   }
 
   public void update(AnActionEvent event) {
     Presentation presentation = event.getPresentation();
-    presentation.setEnabled(RecentProjectsManager.getInstance().getRecentProjectsActions().length > 0);
+    presentation.setEnabled(RecentProjectsManager.getInstance().getRecentProjectsActions(true).length > 0);
   }
 }
