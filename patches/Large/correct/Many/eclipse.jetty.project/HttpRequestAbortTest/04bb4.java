diff --git a/jetty-client/src/test/java/org/eclipse/jetty/client/HttpRequestAbortTest.java b/jetty-client/src/test/java/org/eclipse/jetty/client/HttpRequestAbortTest.java
index d2a6ffd..1827a88 100644
--- a/jetty-client/src/test/java/org/eclipse/jetty/client/HttpRequestAbortTest.java
+++ b/jetty-client/src/test/java/org/eclipse/jetty/client/HttpRequestAbortTest.java
@@ -68,7 +68,7 @@
             Assert.assertSame(failure, x.getCause());
             // Make sure the pool is in a sane state.
             HttpDestinationOverHTTP destination = (HttpDestinationOverHTTP)client.getDestination(scheme, "localhost", connector.getLocalPort());
-            ConnectionPool connectionPool = destination.getConnectionPool();
+            DuplexConnectionPool connectionPool = destination.getConnectionPool();
             Assert.assertEquals(1, connectionPool.getConnectionCount());
             Assert.assertEquals(0, connectionPool.getActiveConnections().size());
             Assert.assertEquals(1, connectionPool.getIdleConnections().size());
