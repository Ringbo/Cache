diff --git a/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderWithDefaultTest.java b/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderWithDefaultTest.java
index 98d26b3..5c410c4 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderWithDefaultTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderWithDefaultTest.java
@@ -31,7 +31,7 @@
 
     public void testRouteStartupOrder() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(0);
+        mock.expectedMessageCount(1);
 
         template.sendBody("direct:start", "Hello World");
 
