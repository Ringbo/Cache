diff --git a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
index c3a65df..a1ac7fc 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
@@ -1604,7 +1604,8 @@
 
         // shutdown default error handler thread pool
         if (errorHandlerExecutorService != null) {
-            getExecutorServiceManager().shutdown(errorHandlerExecutorService);
+            // force shutting down the thread pool
+            getExecutorServiceManager().shutdownNow(errorHandlerExecutorService);
             errorHandlerExecutorService = null;
         }
 
