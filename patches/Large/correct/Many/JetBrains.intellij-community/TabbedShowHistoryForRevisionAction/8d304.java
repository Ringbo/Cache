diff --git a/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/TabbedShowHistoryForRevisionAction.java b/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/TabbedShowHistoryForRevisionAction.java
index 0c29ac6..8c108c1 100644
--- a/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/TabbedShowHistoryForRevisionAction.java
+++ b/platform/vcs-impl/src/com/intellij/openapi/vcs/actions/TabbedShowHistoryForRevisionAction.java
@@ -74,7 +74,7 @@
 
   private static boolean isVisible(@NotNull AnActionEvent event) {
     Project project = event.getProject();
-    if (project == null) return false;
+    if (project == null || project.isDisposed()) return false;
     if (getVcsHelper(project) == null) return false;
     AbstractVcs vcs = getVcs(project, event.getData(VcsDataKeys.VCS));
     if (vcs == null) return false;
