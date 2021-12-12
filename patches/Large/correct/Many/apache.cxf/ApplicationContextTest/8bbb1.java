diff --git a/rt/transports/http-netty/netty-server/src/test/java/org/apache/cxf/transport/http/netty/server/spring/ApplicationContextTest.java b/rt/transports/http-netty/netty-server/src/test/java/org/apache/cxf/transport/http/netty/server/spring/ApplicationContextTest.java
index 2052295..dceef3d 100644
--- a/rt/transports/http-netty/netty-server/src/test/java/org/apache/cxf/transport/http/netty/server/spring/ApplicationContextTest.java
+++ b/rt/transports/http-netty/netty-server/src/test/java/org/apache/cxf/transport/http/netty/server/spring/ApplicationContextTest.java
@@ -108,7 +108,7 @@
         
         DestinationFactoryManager dfm = bus.getExtension(DestinationFactoryManager.class);
         DestinationFactory factory = dfm.getDestinationFactory("http://cxf.apache.org/transports/http");
-        Destination d = factory.getDestination(info);
+        Destination d = factory.getDestination(info, bus);
         assertTrue(d instanceof NettyHttpDestination);
         NettyHttpDestination jd = (NettyHttpDestination) d;        
         assertEquals("foobar", jd.getServer().getContentEncoding());   
@@ -119,16 +119,16 @@
         
         ConduitInitiatorManager cim = bus.getExtension(ConduitInitiatorManager.class);
         ConduitInitiator ci = cim.getConduitInitiator("http://cxf.apache.org/transports/http");
-        HTTPConduit conduit = (HTTPConduit) ci.getConduit(info);
+        HTTPConduit conduit = (HTTPConduit) ci.getConduit(info, bus);
         assertEquals(97, conduit.getClient().getConnectionTimeout());
         
         info.setName(new QName("urn:test:ns", "Bar"));
-        conduit = (HTTPConduit) ci.getConduit(info);
+        conduit = (HTTPConduit) ci.getConduit(info, bus);
         assertEquals(79, conduit.getClient().getConnectionTimeout());
 
         NettyHttpDestination jd2 = 
             (NettyHttpDestination)factory.getDestination(
-                getEndpointInfo("foo", "bar", "http://localhost:9001"));
+                getEndpointInfo("foo", "bar", "http://localhost:9001"), bus);
         
         engine = (NettyHttpServerEngine)jd2.getEngine();
         //assertEquals(40000, engine.getMaxIdleTime());
@@ -136,7 +136,7 @@
         
         NettyHttpDestination jd3 = 
             (NettyHttpDestination)factory.getDestination(
-                getEndpointInfo("sna", "foo", "https://localhost:9002"));
+                getEndpointInfo("sna", "foo", "https://localhost:9002"), bus);
         
         engine = (NettyHttpServerEngine)jd3.getEngine();
         assertEquals(engine.getTlsServerParameters().getClientAuthentication().isWant(), true);
@@ -144,7 +144,7 @@
         
         NettyHttpDestination jd4 = 
             (NettyHttpDestination)factory.getDestination(
-                getEndpointInfo("sna", "foo2", "https://localhost:9003"));
+                getEndpointInfo("sna", "foo2", "https://localhost:9003"), bus);
         
         engine = (NettyHttpServerEngine)jd4.getEngine();
         assertEquals(engine.getTlsServerParameters().getClientAuthentication().isWant(), false);
