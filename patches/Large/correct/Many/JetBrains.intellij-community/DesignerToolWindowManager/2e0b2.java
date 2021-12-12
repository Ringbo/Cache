diff --git a/plugins/ui-designer-core/src/com/intellij/designer/DesignerToolWindowManager.java b/plugins/ui-designer-core/src/com/intellij/designer/DesignerToolWindowManager.java
index 81e8415..10d2aef 100644
--- a/plugins/ui-designer-core/src/com/intellij/designer/DesignerToolWindowManager.java
+++ b/plugins/ui-designer-core/src/com/intellij/designer/DesignerToolWindowManager.java
@@ -156,7 +156,7 @@
     });
 
     DesignerCustomizations customization = getCustomizations();
-    ToolWindowAnchor anchor = customization != null ? customization.getPaletteAnchor() : ToolWindowAnchor.LEFT;
+    ToolWindowAnchor anchor = customization != null ? customization.getStructureAnchor() : ToolWindowAnchor.LEFT;
 
     myToolWindow = ToolWindowManager.getInstance(myProject).registerToolWindow(DesignerBundle.message("designer.toolwindow.name"),
                                                                                false, anchor, myProject, true);
