diff --git a/src-ui/org/pentaho/di/ui/core/database/dialog/DatabaseDialog.java b/src-ui/org/pentaho/di/ui/core/database/dialog/DatabaseDialog.java
index 46aa59a..3e1c7b6 100644
--- a/src-ui/org/pentaho/di/ui/core/database/dialog/DatabaseDialog.java
+++ b/src-ui/org/pentaho/di/ui/core/database/dialog/DatabaseDialog.java
@@ -1527,7 +1527,7 @@
                 tableItem.setText(3, Const.NVL(meta.getPort(), "")); //$NON-NLS-1$
                 tableItem.setText(4, Const.NVL(meta.getDatabaseName(), "")); //$NON-NLS-1$
                 tableItem.setText(5, Const.NVL(meta.getUsername(), "")); //$NON-NLS-1$
-                tableItem.setText(5, Const.NVL(meta.getPassword(), "")); //$NON-NLS-1$
+                tableItem.setText(6, Const.NVL(meta.getPassword(), "")); //$NON-NLS-1$
             }
         }
         wCluster.removeEmptyRows();
