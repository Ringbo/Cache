diff --git a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettySteveIssueTest.java b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettySteveIssueTest.java
index 954777e..a40f351 100644
--- a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettySteveIssueTest.java
+++ b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettySteveIssueTest.java
@@ -34,7 +34,7 @@
 
         template.sendBody(serverUri + "?x=foo", "Hello World");
 
-        assertMockEndpointsSatisifed();
+        assertMockEndpointsSatisfied();
     }
 
     protected RouteBuilder createRouteBuilder() throws Exception {
