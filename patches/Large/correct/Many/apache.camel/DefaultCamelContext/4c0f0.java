diff --git a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
index 5016aa0..a0f0a43 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/DefaultCamelContext.java
@@ -1080,11 +1080,11 @@
         this.lifecycleStrategies.add(lifecycleStrategy);
     }
 
-    public List<RouteDefinition> getRouteDefinitions() {
+    public synchronized List<RouteDefinition> getRouteDefinitions() {
         return routeDefinitions;
     }
 
-    public RouteDefinition getRouteDefinition(String id) {
+    public synchronized RouteDefinition getRouteDefinition(String id) {
         for (RouteDefinition route : routeDefinitions) {
             if (route.getId().equals(id)) {
                 return route;
