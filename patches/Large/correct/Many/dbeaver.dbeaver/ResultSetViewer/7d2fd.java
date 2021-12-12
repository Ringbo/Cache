diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index b7bb791..c1e52b3 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -368,7 +368,7 @@
                         }
                     }
 
-                    if (container.isReadyToRun() && !model.isUpdateInProgress()) {
+                    if (model.hasData() && container.isReadyToRun() && !model.isUpdateInProgress()) {
                         enableFilters = true;
                     }
                 }
