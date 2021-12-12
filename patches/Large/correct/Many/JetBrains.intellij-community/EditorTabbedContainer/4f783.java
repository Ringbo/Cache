diff --git a/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java b/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
index 5252fd1..d3fd594 100644
--- a/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
+++ b/platform-impl/src/com/intellij/openapi/fileEditor/impl/EditorTabbedContainer.java
@@ -138,7 +138,7 @@
     myTabs.getComponent().setBorder(new EmptyBorder(1, 0, 0, 0));
     final List<String> rightIds =
         ((ToolWindowManagerEx)ToolWindowManager.getInstance(myProject)).getIdsOn(ToolWindowAnchor.RIGHT);
-     myTabs.getPresentation().setPaintBorder(0, -1, rightIds.size() > 0 ? 1 : 0, -1);
+     myTabs.getPresentation().setPaintBorder(1, -1, rightIds.size() > 0 ? 1 : 0, -1);
   }
 
   public Component getComponent() {
