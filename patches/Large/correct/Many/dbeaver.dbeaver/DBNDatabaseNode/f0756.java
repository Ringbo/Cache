diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java
index 7435bd2..79441f6 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/navigator/DBNDatabaseNode.java
@@ -370,7 +370,7 @@
             if (child instanceof DBXTreeItem) {
                 final DBXTreeItem item = (DBXTreeItem) child;
                 boolean isLoaded = loadTreeItems(monitor, item, oldList, toList);
-                if (!isLoaded && item.isOptional()) {
+                if (!isLoaded && item.isOptional() && item.getRecursiveLink() == null) {
                     // This may occur only if no child nodes was read
                     // Then we try to go on next DBX level
                     loadChildren(monitor, item, oldList, toList);
