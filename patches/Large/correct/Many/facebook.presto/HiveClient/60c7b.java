diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java b/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java
index c0785e3..2785cd1 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/HiveClient.java
@@ -335,7 +335,8 @@
             try {
                 columns.put(tableName, getTableMetadata(tableName).getColumns());
             }
-            catch (RuntimeException e) {
+            catch (TableNotFoundException e) {
+                // table disappeared during listing operation
             }
         }
         return columns.build();
