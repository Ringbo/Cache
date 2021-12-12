diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/data/editors/ContentPanelEditor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/data/editors/ContentPanelEditor.java
index 20b5c10..b439e4d 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/data/editors/ContentPanelEditor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/data/editors/ContentPanelEditor.java
@@ -262,7 +262,7 @@
                 ToolItem toolItem = (ToolItem) event.widget;
                 Menu menu = createMenu(toolItem);
                 Rectangle bounds = toolItem.getBounds();
-                Point point = toolItem.getControl().toDisplay(bounds.x, bounds.y + bounds.height);
+                Point point = toolItem.getParent().toDisplay(bounds.x, bounds.y + bounds.height);
                 menu.setLocation(point.x, point.y);
                 menu.setVisible(true);
             }
