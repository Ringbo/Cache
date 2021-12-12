diff --git a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingPreparedStatement.java b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingPreparedStatement.java
index 240c29c..47f1665 100644
--- a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingPreparedStatement.java
+++ b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/ShardingPreparedStatement.java
@@ -163,7 +163,7 @@
         setGeneratedKeyContext(sqlRouteResult.getSqlParsedResult().getGeneratedKeyContext());
         for (SQLExecutionUnit each : sqlRouteResult.getExecutionUnits()) {
             PreparedStatement preparedStatement = (PreparedStatement) getStatement(
-                    getShardingConnection().getConnection(each.getDataSource(), sqlRouteResult.getSqlParsedResult().getSqlType()), each.getSQL());
+                    getShardingConnection().getConnection(each.getDataSource(), sqlRouteResult.getSqlParsedResult().getType()), each.getSQL());
             replayMethodsInvocation(preparedStatement);
             getParameters().replayMethodsInvocation(preparedStatement);
             result.add(wrap(preparedStatement, each));
