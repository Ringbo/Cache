diff --git a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamTest.java b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamTest.java
index af724e9..67a5eff 100644
--- a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamTest.java
+++ b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamTest.java
@@ -41,7 +41,7 @@
 
         template.sendBody(serverUri + "?one=uno&two=dos", "Hello World");
 
-        assertMockEndpointsSatisifed();
+        assertMockEndpointsSatisfied();
     }
 
     public void testHttpGetWithParamsViaHeader() throws Exception {
@@ -52,7 +52,7 @@
 
         template.sendBodyAndHeader(serverUri, "Hello World", HttpProducer.QUERY, "one=uno&two=dos");
 
-        assertMockEndpointsSatisifed();
+        assertMockEndpointsSatisfied();
     }
 
     protected RouteBuilder createRouteBuilder() throws Exception {
