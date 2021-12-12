diff --git a/rt/transports/http-jetty/src/test/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestinationTest.java b/rt/transports/http-jetty/src/test/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestinationTest.java
index 73f0d2a..4692c3a 100644
--- a/rt/transports/http-jetty/src/test/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestinationTest.java
+++ b/rt/transports/http-jetty/src/test/java/org/apache/cxf/transport/http_jetty/JettyHTTPDestinationTest.java
@@ -113,7 +113,7 @@
     private class EasyMockJettyHTTPDestination
         extends JettyHTTPDestination {
 
-        public EasyMockJettyHTTPDestination(Bus bus,
+        EasyMockJettyHTTPDestination(Bus bus,
                                             DestinationRegistry registry,
                                             EndpointInfo endpointInfo,
                                             JettyHTTPServerEngineFactory serverEngineFactory,
@@ -891,7 +891,7 @@
     }
     
     private static class TestJettyDestination extends JettyHTTPDestination {
-        public TestJettyDestination(Bus bus,
+        TestJettyDestination(Bus bus,
                                     DestinationRegistry registry,
                                     EndpointInfo endpointInfo,
                                     JettyHTTPServerEngineFactory serverEngineFactory) throws IOException {
