diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java
index 697276c..ddf160e 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/navigator/project/ProjectExplorerView.java
@@ -192,7 +192,7 @@
                 return "";
             }
         }));
-        columnController.createColumns();
+        columnController.createColumns(false);
     }
 
     @Override
