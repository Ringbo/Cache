diff --git a/vertx-testsuite/src/test/java/vertx/tests/core/dns/DnsTestClient.java b/vertx-testsuite/src/test/java/vertx/tests/core/dns/DnsTestClient.java
index cd3c756..7f2ada1 100644
--- a/vertx-testsuite/src/test/java/vertx/tests/core/dns/DnsTestClient.java
+++ b/vertx-testsuite/src/test/java/vertx/tests/core/dns/DnsTestClient.java
@@ -342,9 +342,9 @@
       }
     });
 
-    dns.lookup("vertx.io", new Handler<AsyncResult<InetAddress>>() {
+    dns.lookup4("vertx.io", new Handler<AsyncResult<Inet4Address>>() {
       @Override
-      public void handle(AsyncResult<InetAddress> event) {
+      public void handle(AsyncResult<Inet4Address> event) {
         InetAddress result = event.result();
         tu.azzert(result != null);
         tu.azzert("10.0.0.1".equals(result.getHostAddress()));
