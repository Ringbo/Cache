diff --git a/components/camel-web/src/main/java/org/apache/camel/web/resources/RouteResource.java b/components/camel-web/src/main/java/org/apache/camel/web/resources/RouteResource.java
index 94ae2d2..a91a137 100644
--- a/components/camel-web/src/main/java/org/apache/camel/web/resources/RouteResource.java
+++ b/components/camel-web/src/main/java/org/apache/camel/web/resources/RouteResource.java
@@ -158,7 +158,7 @@
         DefaultCamelContext defaultCamelContext = (DefaultCamelContext)getCamelContext();
         // stop and remove the original route
         defaultCamelContext.stopRoute(id);
-        defaultCamelContext.removeRouteDefinition(id);
+        defaultCamelContext.removeRoute(id);
 
         // add the routes in a route builder
         defaultCamelContext.addRoutes(builder);
