diff --git a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerGoogleAsynchronousTest.java b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerGoogleAsynchronousTest.java
index aa741e0..d3207fc 100644
--- a/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerGoogleAsynchronousTest.java
+++ b/components/camel-jetty/src/test/java/org/apache/camel/component/jetty/jettyproducer/JettyHttpProducerGoogleAsynchronousTest.java
@@ -30,7 +30,7 @@
     public void testGoogleFrontPageAsync() throws Exception {
         MockEndpoint mock = getMockEndpoint("mock:result");
         mock.expectedMessageCount(1);
-        mock.message(0).outBody(String.class).contains("google");
+        mock.message(0).body(String.class).contains("google");
 
         template.sendBody("direct:start", null);
 
