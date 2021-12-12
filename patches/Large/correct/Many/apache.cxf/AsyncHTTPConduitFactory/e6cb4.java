diff --git a/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/AsyncHTTPConduitFactory.java b/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/AsyncHTTPConduitFactory.java
index 50418e2..c5dba97 100644
--- a/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/AsyncHTTPConduitFactory.java
+++ b/rt/transports/http-hc/src/main/java/org/apache/cxf/transport/http/asyncclient/AsyncHTTPConduitFactory.java
@@ -359,7 +359,7 @@
     }
 
     public CloseableHttpAsyncClient createClient(final AsyncHTTPConduit c) throws IOException {
-        if (connectionManager == null) {
+        if (client == null) {
             setupNIOClient(c.getClient());
         }
         return client;
