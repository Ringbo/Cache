diff --git a/sharding-transaction/sharding-transaction-xa/src/main/java/io/shardingsphere/transaction/xa/manager/XATransactionDataSourceWrapper.java b/sharding-transaction/sharding-transaction-xa/src/main/java/io/shardingsphere/transaction/xa/manager/XATransactionDataSourceWrapper.java
index aeea7f6..e48c04c 100644
--- a/sharding-transaction/sharding-transaction-xa/src/main/java/io/shardingsphere/transaction/xa/manager/XATransactionDataSourceWrapper.java
+++ b/sharding-transaction/sharding-transaction-xa/src/main/java/io/shardingsphere/transaction/xa/manager/XATransactionDataSourceWrapper.java
@@ -79,7 +79,7 @@
     private void registerRecoveryResource(final String dataSourceName, final XADataSource xaDataSource) {
         JdbcTransactionalResource transactionalResource = new JdbcTransactionalResource(dataSourceName, xaDataSource);
         synchronized (XATransactionDataSourceWrapper.class) {
-            if (null != Configuration.getResource(dataSourceName)) {
+            if (null == Configuration.getResource(dataSourceName)) {
                 Configuration.addResource(transactionalResource);
             }
         }
