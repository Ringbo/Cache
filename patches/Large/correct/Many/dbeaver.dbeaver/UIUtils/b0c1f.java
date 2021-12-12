diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java
index 7129ce4..cb3a165 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/UIUtils.java
@@ -249,7 +249,7 @@
                 column.pack();
                 totalWidth += column.getWidth();
             }
-            Rectangle clientArea = tree.getClientArea();
+            Rectangle clientArea = tree.getBounds();
             if (clientArea.isEmpty()) {
                 return;
             }
