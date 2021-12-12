diff --git a/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/manager/AtomikosTransactionManagerRecoveryTest.java b/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/manager/AtomikosTransactionManagerRecoveryTest.java
index 8bf19f6..dce8c40 100644
--- a/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/manager/AtomikosTransactionManagerRecoveryTest.java
+++ b/sharding-transaction/sharding-transaction-xa/src/test/java/io/shardingsphere/transaction/xa/manager/AtomikosTransactionManagerRecoveryTest.java
@@ -88,14 +88,14 @@
         assertOrderCount("ds1", 0L);
     }
     
-    @Test
+    @Test(expected = IllegalStateException.class)
     public void assertAccessFailedAfterPrepared() {
         atomikosTransactionManager.begin(beginEvent);
         insertOrder("ds1");
         insertOrder("ds2");
         coordinateOnlyExecutePrepare();
         try {
-            insertOrder("ds1");
+            assertOrderCount("ds1", 1L);
             // CHECKSTYLE:OFF
         } catch (Exception ex) {
             // CHECKSTYLE:ON
