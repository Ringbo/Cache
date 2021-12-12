diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorInput.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorInput.java
index 25d3767..be3ea3a 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorInput.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/sql/SQLEditorInput.java
@@ -85,7 +85,7 @@
         return
             "Script: " + getFile().getName() + " \n" +
             "Connection: " + dataSourceContainer.getName() + " \n" +
-            "Type: " + (dataSourceContainer.getDriver() == null ? "Unknown" : dataSourceContainer.getDriver().getName()) + " \n" +
+            "Type: " + (dataSourceContainer.getDriver() == null ? "Unknown" : dataSourceContainer.getDriver().getFullName()) + " \n" +
             "URL: " + dataSourceContainer.getConnectionInfo().getUrl();
     }
 
