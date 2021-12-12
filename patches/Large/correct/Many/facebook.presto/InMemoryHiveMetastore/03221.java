diff --git a/presto-hive/src/test/java/com/facebook/presto/hive/metastore/InMemoryHiveMetastore.java b/presto-hive/src/test/java/com/facebook/presto/hive/metastore/InMemoryHiveMetastore.java
index 1236792..1881cee 100644
--- a/presto-hive/src/test/java/com/facebook/presto/hive/metastore/InMemoryHiveMetastore.java
+++ b/presto-hive/src/test/java/com/facebook/presto/hive/metastore/InMemoryHiveMetastore.java
@@ -170,7 +170,7 @@
 
         // if the name did not change, this is a simple schema change
         if (oldName.equals(newName)) {
-            if (relations.replace(oldName, newTable) != null) {
+            if (relations.replace(oldName, newTable) == null) {
                 throw new TableNotFoundException(oldName);
             }
             return;
