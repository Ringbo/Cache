diff --git a/camel-core/src/main/java/org/apache/camel/processor/RoutingSlip.java b/camel-core/src/main/java/org/apache/camel/processor/RoutingSlip.java
index 641834c..d2d46af 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/RoutingSlip.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/RoutingSlip.java
@@ -80,9 +80,9 @@
      * <p/>
      * This is similar to how multicast processor does.
      */
-    static final class PreparedErrorHandler extends KeyValueHolder<RouteContext, Processor> {
+    static final class PreparedErrorHandler extends KeyValueHolder<String, Processor> {
 
-        PreparedErrorHandler(RouteContext key, Processor value) {
+        PreparedErrorHandler(String key, Processor value) {
             super(key, value);
         }
 
@@ -324,7 +324,7 @@
         return copy;
     }
 
-    protected AsyncProcessor createErrorHandler(RouteContext routeContext, Exchange exchange, AsyncProcessor processor) {
+    protected AsyncProcessor createErrorHandler(RouteContext routeContext, Exchange exchange, AsyncProcessor processor, Endpoint endpoint) {
         AsyncProcessor answer = processor;
 
         boolean tryBlock = exchange.getProperty(Exchange.TRY_ROUTE_BLOCK, false, boolean.class);
@@ -337,7 +337,7 @@
             // for the entire routingslip/dynamic-router block again which will start from scratch again
 
             // create key for cache
-            final PreparedErrorHandler key = new PreparedErrorHandler(routeContext, processor);
+            final PreparedErrorHandler key = new PreparedErrorHandler(endpoint.getEndpointUri(), processor);
 
             // lookup cached first to reuse and preserve memory
             answer = errorHandlers.get(key);
@@ -379,7 +379,7 @@
 
                 // rework error handling to support fine grained error handling
                 RouteContext routeContext = exchange.getUnitOfWork() != null ? exchange.getUnitOfWork().getRouteContext() : null;
-                asyncProducer = createErrorHandler(routeContext, exchange, asyncProducer);
+                asyncProducer = createErrorHandler(routeContext, exchange, asyncProducer, endpoint);
 
                 // set property which endpoint we send to
                 exchange.setProperty(Exchange.TO_ENDPOINT, endpoint.getEndpointUri());
