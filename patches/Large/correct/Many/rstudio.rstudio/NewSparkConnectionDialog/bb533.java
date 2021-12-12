diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/connections/ui/NewSparkConnectionDialog.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/connections/ui/NewSparkConnectionDialog.java
index 805d811..5c63ed8 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/connections/ui/NewSparkConnectionDialog.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/connections/ui/NewSparkConnectionDialog.java
@@ -278,7 +278,7 @@
             builder.append("sc <- spark_connect(master = \"");
             builder.append(masterComponents[0]);
             builder.append("\"");
-            if (masterComponents.length > 0)
+            if (masterComponents.length > 1)
             {
                builder.append(", app_name = \"");
                builder.append(masterComponents[1]);
