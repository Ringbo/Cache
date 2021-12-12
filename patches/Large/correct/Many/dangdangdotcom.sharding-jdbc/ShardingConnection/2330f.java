diff --git a/sharding-jdbc-core/src/main/java/io/shardingjdbc/core/jdbc/core/connection/ShardingConnection.java b/sharding-jdbc-core/src/main/java/io/shardingjdbc/core/jdbc/core/connection/ShardingConnection.java
index 3c92a36..200dfcc 100644
--- a/sharding-jdbc-core/src/main/java/io/shardingjdbc/core/jdbc/core/connection/ShardingConnection.java
+++ b/sharding-jdbc-core/src/main/java/io/shardingjdbc/core/jdbc/core/connection/ShardingConnection.java
@@ -54,20 +54,22 @@
     private final ShardingContext shardingContext;
     
     /**
-     * Get all database connections via data source name. 
+     * Get database connections via data source name for DDL.
      *
-     * <p>Master-slave connection will return all actual connections</p>
+     * <p>Non-Master-slave connection will return actual connection</p>
+     * <p>Master-slave connection will return actual master connections</p>
      * 
      * @param dataSourceName data source name
-     * @return all database connections via data source name
+     * @return all database connections via data source name for DDL
      * @throws SQLException SQL exception
      */
-    public Collection<Connection> getAllConnections(final String dataSourceName) throws SQLException {
+    // TODO Return value is Connection because will support multiple master datasources in future.
+    public Collection<Connection> getConnectionsForDDL(final String dataSourceName) throws SQLException {
         DataSource dataSource = shardingContext.getShardingRule().getDataSourceMap().get(dataSourceName);
         Preconditions.checkState(null != dataSource, "Missing the rule of %s in DataSourceRule", dataSourceName);
         Map<String, DataSource> dataSources;
         if (dataSource instanceof MasterSlaveDataSource) {
-            dataSources = ((MasterSlaveDataSource) dataSource).getAllDataSources();
+            dataSources = ((MasterSlaveDataSource) dataSource).getMasterDataSource();
         } else {
             dataSources = new HashMap<>(1, 1);
             dataSources.put(dataSourceName, dataSource);
