diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/ConnectionPageNetwork.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/ConnectionPageNetwork.java
index 38a921b..ed12e46 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/ConnectionPageNetwork.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/ConnectionPageNetwork.java
@@ -156,7 +156,7 @@
             prevDataSource = dataSource;
             handlersFolder.layout();
             for (TabItem item : handlersFolder.getItems()) {
-                ((Composite)item.getControl()).layout();
+                ((Composite)item.getControl()).layout(false);
             }
         }
 
