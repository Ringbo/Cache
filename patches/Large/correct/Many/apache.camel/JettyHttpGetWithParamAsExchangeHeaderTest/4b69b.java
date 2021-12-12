diff --git a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamAsExchangeHeaderTest.java b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamAsExchangeHeaderTest.java
index 5449371..2327468 100644
--- a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamAsExchangeHeaderTest.java
+++ b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/JettyHttpGetWithParamAsExchangeHeaderTest.java
@@ -38,7 +38,7 @@
 
         template.sendBody(serverUri + "?one=einz&two=twei", "Hello World");
 
-        assertMockEndpointsSatisifed();
+        assertMockEndpointsSatisfied();
     }
 
     public void testHttpGetWithParamsViaHeader() throws Exception {
@@ -50,7 +50,7 @@
 
         template.sendBodyAndHeader(serverUri, "Hello World", HttpProducer.QUERY, "one=uno&two=dos");
 
-        assertMockEndpointsSatisifed();
+        assertMockEndpointsSatisfied();
     }
 
     protected RouteBuilder createRouteBuilder() throws Exception {
