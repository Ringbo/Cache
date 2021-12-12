diff --git a/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java b/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
index 42a1820..ea5ee10 100644
--- a/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
+++ b/platform/lang-impl/src/com/intellij/ide/projectView/impl/ProjectViewImpl.java
@@ -1921,7 +1921,7 @@
   @Override
   public void setManualOrder(@NotNull String paneId, final boolean enabled) {
     if (isGlobalOptions()) {
-      getGlobalOptions().setAutoscrollToSource(enabled);
+      getGlobalOptions().setManualOrder(enabled);
     }
     setPaneOption(myManualOrder, enabled, paneId, false);
     final AbstractProjectViewPane pane = getProjectViewPaneById(paneId);
