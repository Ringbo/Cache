diff --git a/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderSimpleTest.java b/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderSimpleTest.java
index b3241db..dbe41f6 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderSimpleTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/RouteStartupOrderSimpleTest.java
@@ -31,7 +31,7 @@
 
     public void testRouteStartupOrder() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
-        mock.expectedMessageCount(0);
+        mock.expectedMessageCount(1);
 
         template.sendBody("direct:start", "Hello World");
 
