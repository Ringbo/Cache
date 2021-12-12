diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java
index d2ea4de..d486641 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/perspective/DataSourceManagementToolbar.java
@@ -757,7 +757,7 @@
 
         Composite comboGroup = new Composite(parent, SWT.NONE);
         GridLayout gl = new GridLayout(3, false);
-        gl.marginWidth = 0;
+        gl.marginWidth = 5;
         gl.marginHeight = 0;
         comboGroup.setLayout(gl);
 
