diff --git a/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
index d4fd9de..2bc5fca 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
@@ -770,7 +770,7 @@
 
         // send this exchange
         // the call to schedule last if needed to ensure in-order processing of the aggregates
-        executorService.submit(() -> ReactiveHelper.scheduleLast(() -> processor.process(exchange, done -> {
+        executorService.submit(() -> ReactiveHelper.scheduleSync(() -> processor.process(exchange, done -> {
             // log exception if there was a problem
             if (exchange.getException() != null) {
                 // if there was an exception then let the exception handler handle it
