diff --git a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/core/statement/ShardingPreparedStatement.java b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/core/statement/ShardingPreparedStatement.java
index 6523eea..05c539a 100644
--- a/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/core/statement/ShardingPreparedStatement.java
+++ b/sharding-jdbc-core/src/main/java/com/dangdang/ddframe/rdb/sharding/jdbc/core/statement/ShardingPreparedStatement.java
@@ -130,7 +130,7 @@
     private PreparedStatement generatePreparedStatement(final SQLExecutionUnit sqlExecutionUnit) throws SQLException {
         Optional<GeneratedKey> generatedKey = getGeneratedKey();
         Connection connection = getShardingConnection().getConnection(sqlExecutionUnit.getDataSource(), getRouteResult().getSqlStatement().getType());
-        if (isReturnGeneratedKeys() && generatedKey.isPresent()) {
+        if (isReturnGeneratedKeys() || isReturnGeneratedKeys() && generatedKey.isPresent()) {
             return connection.prepareStatement(sqlExecutionUnit.getSql(), RETURN_GENERATED_KEYS);
         }
         return connection.prepareStatement(sqlExecutionUnit.getSql(), getResultSetType(), getResultSetConcurrency(), getResultSetHoldability());
