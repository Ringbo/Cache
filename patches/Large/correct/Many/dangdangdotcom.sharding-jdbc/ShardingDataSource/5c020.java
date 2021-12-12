diff --git a/sharding-jdbc/sharding-jdbc-core/src/main/java/io/shardingsphere/shardingjdbc/jdbc/core/datasource/ShardingDataSource.java b/sharding-jdbc/sharding-jdbc-core/src/main/java/io/shardingsphere/shardingjdbc/jdbc/core/datasource/ShardingDataSource.java
index f0962f5..f8d763e 100644
--- a/sharding-jdbc/sharding-jdbc-core/src/main/java/io/shardingsphere/shardingjdbc/jdbc/core/datasource/ShardingDataSource.java
+++ b/sharding-jdbc/sharding-jdbc-core/src/main/java/io/shardingsphere/shardingjdbc/jdbc/core/datasource/ShardingDataSource.java
@@ -103,7 +103,7 @@
             if (null == xaDataSourceMap) {
                 log.warn("XA transaction resource have not load, using Local transaction instead!");
             } else {
-                return new ShardingConnection(xaDataSourceMap, shardingContext);
+                return new ShardingConnection(xaDataSourceMap, shardingContext, TransactionType.XA);
             }
         }
         return new ShardingConnection(dataSourceMap, shardingContext);
