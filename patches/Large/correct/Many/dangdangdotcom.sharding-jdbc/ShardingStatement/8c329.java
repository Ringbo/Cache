diff --git a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingStatement.java b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingStatement.java
index e8d5710..770538a 100644
--- a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingStatement.java
+++ b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingStatement.java
@@ -279,7 +279,7 @@
         generatedKeyContext = sqlRouteResult.getSqlParsedResult().getGeneratedKeyContext();
         sqlParsedResult = sqlRouteResult.getSqlParsedResult();
         for (SQLExecutionUnit each : sqlRouteResult.getExecutionUnits()) {
-            Statement statement = getStatement(shardingConnection.getConnection(each.getDataSource(), sqlRouteResult.getSqlParsedResult().getSqlType()), each.getSQL());
+            Statement statement = getStatement(shardingConnection.getConnection(each.getDataSource(), sqlRouteResult.getSqlParsedResult().getType()), each.getSQL());
             replayMethodsInvocation(statement);
             result.addStatement(new StatementExecutorWrapper(statement, each));
         }
