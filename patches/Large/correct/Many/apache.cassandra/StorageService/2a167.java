diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 3112864..cce0ac1 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -1938,7 +1938,7 @@
 
         if (names.isEmpty())
         {
-            logger_.info("No column family to repair for keyspace " + tableName);
+            logger.info("No column family to repair for keyspace " + tableName);
             return null;
         }
 
