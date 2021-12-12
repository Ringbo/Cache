diff --git a/components/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/ha/ClusteredRouteControllerAutoConfiguration.java b/components/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/ha/ClusteredRouteControllerAutoConfiguration.java
index 3be20a3..19a3959 100644
--- a/components/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/ha/ClusteredRouteControllerAutoConfiguration.java
+++ b/components/camel-spring-boot/src/main/java/org/apache/camel/spring/boot/ha/ClusteredRouteControllerAutoConfiguration.java
@@ -67,7 +67,7 @@
         controller.setFilters(filters);
         controller.addFilter(new ClusteredRouteFilters.IsAutoStartup());
 
-        if (ObjectHelper.isEmpty(configuration.getClusterService())) {
+        if (ObjectHelper.isNotEmpty(configuration.getClusterService())) {
             controller.setClusterService(configuration.getClusterService());
         }
 
