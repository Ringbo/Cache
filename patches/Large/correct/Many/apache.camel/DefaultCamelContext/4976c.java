diff --git a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
index 7dd681d..ee204ad 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
@@ -653,7 +653,7 @@
         return routeStartupOrder;
     }
 
-    public List<Route> getRoutes() {
+    public synchronized List<Route> getRoutes() {
         // lets return a copy of the collection as objects are removed later when services are stopped
         if (routes.isEmpty()) {
             return Collections.emptyList();
