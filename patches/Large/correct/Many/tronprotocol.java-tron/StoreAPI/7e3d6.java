diff --git a/src/main/java/org/tron/core/db/api/StoreAPI.java b/src/main/java/org/tron/core/db/api/StoreAPI.java
index de65f36..2e05a66 100644
--- a/src/main/java/org/tron/core/db/api/StoreAPI.java
+++ b/src/main/java/org/tron/core/db/api/StoreAPI.java
@@ -256,10 +256,7 @@
     Index.Iface<Transaction> index = indexHelper.getTransactionIndex();
     try (ResultSet<Transaction> resultSet =
         index.retrieve(
-            between(TransactionIndex.TIMESTAMP, beginInMilliseconds, endInMilliseconds),
-            queryOptions(
-                orderBy(descending(TransactionIndex.TIMESTAMP)),
-                applyThresholds(threshold(INDEX_ORDERING_SELECTIVITY, 1.0))))) {
+            between(TransactionIndex.TIMESTAMP, beginInMilliseconds, endInMilliseconds))) {
       return ImmutableList.copyOf(resultSet);
     }
   }
