diff --git a/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java b/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
index 3d4fec2..57f5eb4 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/MulticastProcessor.java
@@ -900,7 +900,7 @@
      * @param name  the suggested name for the background thread
      * @return the thread pool
      */
-    protected ExecutorService createAggregateExecutorService(String name) {
+    protected synchronized ExecutorService createAggregateExecutorService(String name) {
         return camelContext.getExecutorServiceStrategy().newThreadPool(this, name, 1, Integer.MAX_VALUE);
     }
 
