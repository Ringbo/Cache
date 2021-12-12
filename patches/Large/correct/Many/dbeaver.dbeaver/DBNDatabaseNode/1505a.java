diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java
index 372bd28..fb24591 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java
@@ -184,7 +184,7 @@
     }
 
     @Override
-    public DBNDatabaseNode[] getChildren(DBRProgressMonitor monitor)
+    public synchronized DBNDatabaseNode[] getChildren(DBRProgressMonitor monitor)
         throws DBException
     {
         if (childNodes == null && allowsChildren()) {
