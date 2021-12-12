diff --git a/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderTest.java b/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderTest.java
index 57204a3..2fe4437 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderTest.java
@@ -31,7 +31,7 @@
 
     public void testRouteStartupOrder() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(0);
+        mock.expectedMessageCount(1);
 
         template.sendBody("direct:start", "Hello World");
 
