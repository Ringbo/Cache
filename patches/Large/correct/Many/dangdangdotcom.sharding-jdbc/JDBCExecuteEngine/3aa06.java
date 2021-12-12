diff --git a/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/backend/communication/jdbc/execute/JDBCExecuteEngine.java b/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/backend/communication/jdbc/execute/JDBCExecuteEngine.java
index bd2c62d..bc0edc2 100644
--- a/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/backend/communication/jdbc/execute/JDBCExecuteEngine.java
+++ b/sharding-proxy-postgresql/src/main/java/org/apache/shardingsphere/shardingproxypg/backend/communication/jdbc/execute/JDBCExecuteEngine.java
@@ -96,7 +96,7 @@
         int maxConnectionsSizePerQuery = GlobalRegistry.getInstance().getShardingProperties().<Integer>getValue(ShardingPropertiesConstant.MAX_CONNECTIONS_SIZE_PER_QUERY);
         ShardingExecuteEngine executeEngine = BackendExecutorContext.getInstance().getExecuteEngine();
         sqlExecutePrepareTemplate = new SQLExecutePrepareTemplate(maxConnectionsSizePerQuery);
-        sqlExecuteTemplate = new SQLExecuteTemplate(executeEngine);
+        sqlExecuteTemplate = new SQLExecuteTemplate(executeEngine, backendConnection.isSerialExecute());
     }
     
     @SuppressWarnings("unchecked")
