diff --git a/rt/transports/websocket/src/test/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestinationTest.java b/rt/transports/websocket/src/test/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestinationTest.java
index 3c3efb3..7db0d3f 100644
--- a/rt/transports/websocket/src/test/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestinationTest.java
+++ b/rt/transports/websocket/src/test/java/org/apache/cxf/transport/websocket/jetty/JettyWebSocketDestinationTest.java
@@ -74,7 +74,7 @@
     }
     
     private static class TestJettyWebSocketDestination extends JettyWebSocketDestination {
-        public TestJettyWebSocketDestination(Bus bus, DestinationRegistry registry, EndpointInfo ei,
+        TestJettyWebSocketDestination(Bus bus, DestinationRegistry registry, EndpointInfo ei,
                                              JettyHTTPServerEngineFactory serverEngineFactory, 
                                              JettyHTTPServerEngine engine) throws IOException {
             super(bus, registry, ei, serverEngineFactory);
