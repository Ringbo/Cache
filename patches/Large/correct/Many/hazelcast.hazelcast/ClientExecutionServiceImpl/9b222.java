diff --git a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientExecutionServiceImpl.java b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientExecutionServiceImpl.java
index 9ccbcf8..7b3281b 100644
--- a/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientExecutionServiceImpl.java
+++ b/hazelcast-client/src/main/java/com/hazelcast/client/spi/impl/ClientExecutionServiceImpl.java
@@ -75,7 +75,7 @@
     @Override
     public <T> ICompletableFuture<T> submitInternal(final Callable<T> command) {
         CompletableFutureTask futureTask = new CompletableFutureTask(command, internalExecutor);
-        internalExecutor.submit(command);
+        internalExecutor.submit(futureTask);
         return futureTask;
     }
 
