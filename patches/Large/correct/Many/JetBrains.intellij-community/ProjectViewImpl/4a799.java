diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java b/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
index c26ddfb..d48f60d 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
@@ -701,7 +701,7 @@
     collapseAllAction.getTemplatePresentation().setIcon(AllIcons.General.CollapseAll);
     collapseAllAction.getTemplatePresentation().setHoveredIcon(AllIcons.General.CollapseAllHover);
     titleActions.add(collapseAllAction);
-    getCurrentProjectViewPane().addToolbarActions(myActionGroup);
+    getProjectViewPaneById(myCurrentViewId == null ? ProjectViewPane.ID : myCurrentViewId).addToolbarActions(myActionGroup);
 
     ToolWindowEx window = (ToolWindowEx)ToolWindowManager.getInstance(myProject).getToolWindow(ToolWindowId.PROJECT_VIEW);
     if (window != null) {
