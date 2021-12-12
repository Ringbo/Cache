diff --git a/camel-core/src/main/java/org/apache/camel/processor/RecipientList.java b/camel-core/src/main/java/org/apache/camel/processor/RecipientList.java
index f2a163f..6f4c5f6 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/RecipientList.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/RecipientList.java
@@ -111,7 +111,7 @@
         RecipientListProcessor rlp = new RecipientListProcessor(exchange.getContext(), producerCache, iter, getAggregationStrategy(),
                                                                 isParallelProcessing(), getExecutorService(), isStreaming(), isStopOnException(), getTimeout()) {
             @Override
-            protected ExecutorService createAggregateExecutorService(String name) {
+            protected synchronized ExecutorService createAggregateExecutorService(String name) {
                 // use a shared executor service to avoid creating new thread pools
                 if (aggregateExecutorService == null) {
                     aggregateExecutorService = super.createAggregateExecutorService("RecipientList-AggregateTask");
