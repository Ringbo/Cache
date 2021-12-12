diff --git a/components/camel-spring/src/main/java/org/apache/camel/spring/spi/SpringTransactionPolicy.java b/components/camel-spring/src/main/java/org/apache/camel/spring/spi/SpringTransactionPolicy.java
index d1ae61b..879325a 100644
--- a/components/camel-spring/src/main/java/org/apache/camel/spring/spi/SpringTransactionPolicy.java
+++ b/components/camel-spring/src/main/java/org/apache/camel/spring/spi/SpringTransactionPolicy.java
@@ -67,7 +67,7 @@
         // if we should not support this we do not need to wrap the processor as we only need one transacted error handler
 
         // find the existing error handler builder
-        ErrorHandlerFactory builder = routeContext.getRoute().getErrorHandlerBuilder();
+        ErrorHandlerBuilder builder = (ErrorHandlerBuilder)routeContext.getRoute().getErrorHandlerBuilder();
 
         // check if its a ref if so then do a lookup
         if (builder instanceof ErrorHandlerBuilderRef) {
@@ -79,7 +79,7 @@
             // and if so then we can safely replace that with our transacted error handler
             if (ErrorHandlerBuilderRef.isErrorHandlerBuilderConfigured(ref)) {
                 LOG.debug("Looking up ErrorHandlerBuilder with ref: {}", ref);
-                builder = ErrorHandlerBuilderRef.lookupErrorHandlerBuilder(routeContext, ref);
+                builder = (ErrorHandlerBuilder)ErrorHandlerBuilderRef.lookupErrorHandlerBuilder(routeContext, ref);
             }
         }
 
