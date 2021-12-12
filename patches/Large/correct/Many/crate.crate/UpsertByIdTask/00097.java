diff --git a/sql/src/main/java/io/crate/executor/transport/task/UpsertByIdTask.java b/sql/src/main/java/io/crate/executor/transport/task/UpsertByIdTask.java
index 7eaba42..a297e26 100644
--- a/sql/src/main/java/io/crate/executor/transport/task/UpsertByIdTask.java
+++ b/sql/src/main/java/io/crate/executor/transport/task/UpsertByIdTask.java
@@ -156,7 +156,7 @@
     public ListenableFuture<List<Long>> executeBulk() {
         try {
             List<SettableFuture<Long>> resultList = executeBulkShardProcessor();
-            return Futures.successfulAsList(resultList);
+            return Futures.allAsList(resultList);
         } catch (Throwable throwable) {
             return Futures.immediateFailedFuture(throwable);
         }
