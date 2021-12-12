diff --git a/jetty-client/src/test/java/org/eclipse/jetty/client/HttpClientTest.java b/jetty-client/src/test/java/org/eclipse/jetty/client/HttpClientTest.java
index 3205139..977a460 100644
--- a/jetty-client/src/test/java/org/eclipse/jetty/client/HttpClientTest.java
+++ b/jetty-client/src/test/java/org/eclipse/jetty/client/HttpClientTest.java
@@ -897,9 +897,9 @@
                     @Override
                     public void succeeded(List<InetSocketAddress> result)
                     {
-                        // Replace the first address with an invalid address so that we
-                        // test that the connect operation iterates over the addresses.
-                        result.set(0, new InetSocketAddress("idontexist", 80));
+                        // Add as first address an invalid address so that we test
+                        // that the connect operation iterates over the addresses.
+                        result.add(0, new InetSocketAddress("idontexist", 80));
                         promise.succeeded(result);
                     }
 
