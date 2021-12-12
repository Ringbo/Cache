diff --git a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
index 759aae7..21c216f 100644
--- a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
+++ b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
@@ -209,7 +209,7 @@
 
     for (String each : ids) {
       ToolWindow eachWnd = mgr.getToolWindow(each);
-      if (!eachWnd.isAvailable()) continue;
+      if (eachWnd == null || !eachWnd.isAvailable()) continue;
 
       if (eachWnd.isVisible() && eachWnd.getType() == ToolWindowType.DOCKED) {
         ToolWindowAnchor eachAnchor = eachWnd.getAnchor();
