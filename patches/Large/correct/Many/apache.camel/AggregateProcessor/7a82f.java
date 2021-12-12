diff --git a/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
index 81417cd..c9b53c2 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
@@ -1450,7 +1450,7 @@
         }
         
         if (timeoutCheckerExecutorService != null) {
-            camelContext.getExecutorServiceManager().shutdownNow(timeoutCheckerExecutorService);
+            camelContext.getExecutorServiceManager().shutdown(timeoutCheckerExecutorService);
         }
         
         ServiceHelper.stopServices(timeoutMap, processor, deadLetterProducerTemplate);
