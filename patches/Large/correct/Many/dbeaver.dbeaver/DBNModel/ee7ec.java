diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/navigator/DBNModel.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/navigator/DBNModel.java
index 89c0356..5c6a55a 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/navigator/DBNModel.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/navigator/DBNModel.java
@@ -187,7 +187,7 @@
 */
     }
 
-    public DBNDatabaseNode getNodeByObject(DBRProgressMonitor monitor, DBSObject object)
+    public DBNDatabaseNode getNodeByObject(DBRProgressMonitor monitor, DBSObject object, boolean addFiltered)
     {
         DBNDatabaseNode node = getNodeByObject(object);
         if (node != null) {
@@ -206,7 +206,7 @@
                 return null;
             }
             try {
-                cacheNodeChildren(monitor, node, nextItem);
+                cacheNodeChildren(monitor, node, nextItem, addFiltered);
             } catch (DBException e) {
                 log.error(e.getMessage());
                 return null;
@@ -250,7 +250,7 @@
         return curNode;
     }
 
-    private boolean cacheNodeChildren(DBRProgressMonitor monitor, DBNDatabaseNode node, DBSObject objectToCache) throws DBException
+    private boolean cacheNodeChildren(DBRProgressMonitor monitor, DBNDatabaseNode node, DBSObject objectToCache, boolean addFiltered) throws DBException
     {
         List<? extends DBNDatabaseNode> children = node.getChildren(monitor);
         boolean cached = false;
@@ -259,7 +259,7 @@
                 if (child instanceof DBNDatabaseFolder) {
                     Class<?> itemsClass = ((DBNDatabaseFolder) child).getChildrenClass();
                     if (itemsClass != null && itemsClass.isAssignableFrom(objectToCache.getClass())) {
-                        cached = cacheNodeChildren(monitor, child, objectToCache);
+                        cached = cacheNodeChildren(monitor, child, objectToCache, addFiltered);
                         if (cached) {
                             break;
                         }
@@ -267,7 +267,7 @@
                 }
             }
         }
-        if (!cached && node.isFiltered()) {
+        if (!cached && addFiltered && node.isFiltered()) {
             // It seems this object was filtered out
             // As it was requested explicitly - let's add new node
             node.addChildItem(objectToCache);
