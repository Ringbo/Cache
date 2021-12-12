diff --git a/components/camel-bam/src/main/java/org/apache/camel/bam/rules/TemporalRule.java b/components/camel-bam/src/main/java/org/apache/camel/bam/rules/TemporalRule.java
index 6e0f707..b140bfe 100644
--- a/components/camel-bam/src/main/java/org/apache/camel/bam/rules/TemporalRule.java
+++ b/components/camel-bam/src/main/java/org/apache/camel/bam/rules/TemporalRule.java
@@ -93,7 +93,7 @@
             ArrayList<Route> list = new ArrayList<Route>();
             RouteDefinition route = new RouteDefinition();
             route.setCamelContext(first.getBuilder().getProcessBuilder().getContext());
-            RouteContext routeContext = new DefaultRouteContext(route, null, list);
+            RouteContext routeContext = new DefaultRouteContext(first.getBuilder().getProcessBuilder().getContext(), route, null, list);
 
             overdueAction = overdueProcessors.createOutputsProcessor(routeContext);
         }
