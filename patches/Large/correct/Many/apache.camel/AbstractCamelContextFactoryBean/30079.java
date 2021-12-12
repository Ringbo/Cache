diff --git a/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java b/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java
index 8d0cb46..23f1e29 100644
--- a/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java
+++ b/components/camel-core-xml/src/main/java/org/apache/camel/core/xml/AbstractCamelContextFactoryBean.java
@@ -368,7 +368,7 @@
         }
         // Route controller
         RouteController routeController = getBeanForType(RouteController.class);
-        if (clusterService != null) {
+        if (routeController != null) {
             LOG.info("Using RouteController: " + routeController);
             getContext().setRouteController(routeController);
         }
