diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index 6cb6d3b..4cae8b1 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -778,7 +778,7 @@
         statusBar.setLayoutData(gd);
         GridLayout gl = new GridLayout(4, false);
         gl.marginWidth = 0;
-        gl.marginHeight = 3;
+        gl.marginHeight = 0;
         //gl.marginBottom = 5;
         statusBar.setLayout(gl);
         
