diff --git a/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
index c9b53c2..81417cd 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/aggregate/AggregateProcessor.java
@@ -1450,7 +1450,7 @@
         }
         
         if (timeoutCheckerExecutorService != null) {
-            camelContext.getExecutorServiceManager().shutdown(timeoutCheckerExecutorService);
+            camelContext.getExecutorServiceManager().shutdownNow(timeoutCheckerExecutorService);
         }
         
         ServiceHelper.stopServices(timeoutMap, processor, deadLetterProducerTemplate);
