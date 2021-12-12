diff --git a/interop-testing/src/test/java/io/grpc/testing/integration/ProxyTest.java b/interop-testing/src/test/java/io/grpc/testing/integration/ProxyTest.java
index 20e4fe0..e91a73a 100644
--- a/interop-testing/src/test/java/io/grpc/testing/integration/ProxyTest.java
+++ b/interop-testing/src/test/java/io/grpc/testing/integration/ProxyTest.java
@@ -144,7 +144,7 @@
     int serverPort = server.init();
     server.setMode("stream");
     executor.execute(server);
-    assertEquals(server.mode(), "stream");
+    assertEquals("stream", server.mode());
 
     int bandwidth = 64 * 1024;
     proxy = new TrafficControlProxy(serverPort, bandwidth, 200, TimeUnit.MILLISECONDS);
@@ -170,7 +170,7 @@
     int serverPort = server.init();
     server.setMode("stream");
     executor.execute(server);
-    assertEquals(server.mode(), "stream");
+    assertEquals("stream", server.mode());
     int bandwidth = 10 * 1024 * 1024;
     proxy = new TrafficControlProxy(serverPort, bandwidth, 200, TimeUnit.MILLISECONDS);
     startProxy(proxy).get();
