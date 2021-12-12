diff --git a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/actions/CollapseOrExpandGraphAction.java b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/actions/CollapseOrExpandGraphAction.java
index 3506530..8b95bd6 100644
--- a/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/actions/CollapseOrExpandGraphAction.java
+++ b/platform/vcs-log/impl/src/com/intellij/vcs/log/ui/actions/CollapseOrExpandGraphAction.java
@@ -53,7 +53,7 @@
     VcsLogUi ui = e.getData(VcsLogDataKeys.VCS_LOG_UI);
     VcsLogUiProperties properties = e.getData(VcsLogInternalDataKeys.LOG_UI_PROPERTIES);
 
-    if (ui != null && ui.areGraphActionsEnabled() && properties != null && !properties.exists(MainVcsLogUiProperties.BEK_SORT_TYPE)) {
+    if (ui != null && ui.areGraphActionsEnabled() && properties != null && properties.exists(MainVcsLogUiProperties.BEK_SORT_TYPE)) {
       e.getPresentation().setEnabled(true);
       if (!ui.getFilterUi().getFilters().getDetailsFilters().isEmpty()) {
         e.getPresentation().setEnabled(false);
