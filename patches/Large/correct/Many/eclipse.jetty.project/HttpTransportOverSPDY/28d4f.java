diff --git a/jetty-spdy/spdy-http-server/src/main/java/org/eclipse/jetty/spdy/server/http/HttpTransportOverSPDY.java b/jetty-spdy/spdy-http-server/src/main/java/org/eclipse/jetty/spdy/server/http/HttpTransportOverSPDY.java
index c98633d..11eecba 100644
--- a/jetty-spdy/spdy-http-server/src/main/java/org/eclipse/jetty/spdy/server/http/HttpTransportOverSPDY.java
+++ b/jetty-spdy/spdy-http-server/src/main/java/org/eclipse/jetty/spdy/server/http/HttpTransportOverSPDY.java
@@ -284,8 +284,8 @@
             Fields pushHeaders = createPushHeaders(scheme, host, pushResource);
             final Fields pushRequestHeaders = createRequestHeaders(scheme, host, uri, pushResource);
 
-            // TODO: handle the timeout better
-            stream.push(new PushInfo(0, TimeUnit.MILLISECONDS, pushHeaders, false), new Promise.Adapter<Stream>()
+            stream.push(new PushInfo(pushHeaders, false),
+                    new Promise.Adapter<Stream>()
             {
                 @Override
                 public void succeeded(Stream pushStream)
