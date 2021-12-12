diff --git a/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/convert/swap/DataSourceSwapperRegistryTest.java b/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/convert/swap/DataSourceSwapperRegistryTest.java
index a63309e..f8e2ce5 100644
--- a/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/convert/swap/DataSourceSwapperRegistryTest.java
+++ b/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/convert/swap/DataSourceSwapperRegistryTest.java
@@ -80,7 +80,7 @@
         assertNull(actual.getUsername());
         assertNull(actual.getPassword());
         assertThat(actual.getMaximumPoolSize(), is(50));
-        assertThat(actual.getMinimumPoolSize(), is(5));
+        assertThat(actual.getMinimumPoolSize(), is(1));
         assertThat(actual.getConnectionTimeout(), is(30 * 1000L));
         assertThat(actual.getIdleTimeout(), is(60 * 1000L));
         assertThat(actual.getMaxLifetime(), is(0L));
