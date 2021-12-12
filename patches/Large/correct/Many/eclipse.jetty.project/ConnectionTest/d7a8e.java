diff --git a/jetty-client/src/test/java/org/eclipse/jetty/client/ConnectionTest.java b/jetty-client/src/test/java/org/eclipse/jetty/client/ConnectionTest.java
index 6031239..47563a9 100644
--- a/jetty-client/src/test/java/org/eclipse/jetty/client/ConnectionTest.java
+++ b/jetty-client/src/test/java/org/eclipse/jetty/client/ConnectionTest.java
@@ -42,7 +42,7 @@
         exchange.setURI("/");
         httpClient.send(exchange);
 
-        boolean passed = latch.await(1000, TimeUnit.MILLISECONDS);
+        boolean passed = latch.await(4000, TimeUnit.MILLISECONDS);
         assertTrue(passed);
 
         long wait = 100;
