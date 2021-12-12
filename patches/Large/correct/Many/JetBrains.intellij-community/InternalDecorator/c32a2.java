diff --git a/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java b/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java
index 87b1f19..ea2d1bc 100644
--- a/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java
+++ b/platform/platform-impl/src/com/intellij/openapi/wm/impl/InternalDecorator.java
@@ -436,7 +436,7 @@
       UISettings settings = UISettings.getInstance();
 
       ToolWindowManagerImpl mgr = ((ToolWindowImpl)myWindow).getToolWindowManager();
-      if (mgr.isToolWindowRegistered(((ToolWindowImpl)myWindow).getId())) return new Insets(0, 0, 0, 0);
+      if (!mgr.isToolWindowRegistered(((ToolWindowImpl)myWindow).getId())) return new Insets(0, 0, 0, 0);
 
       List<String> topIds = mgr.getIdsOn(ToolWindowAnchor.TOP);
       boolean topButtons = !settings.HIDE_TOOL_STRIPES && !topIds.isEmpty();
