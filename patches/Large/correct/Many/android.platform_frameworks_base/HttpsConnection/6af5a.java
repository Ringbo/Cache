diff --git a/core/java/android/net/http/HttpsConnection.java b/core/java/android/net/http/HttpsConnection.java
index 8a69d0d..0163482 100644
--- a/core/java/android/net/http/HttpsConnection.java
+++ b/core/java/android/net/http/HttpsConnection.java
@@ -202,10 +202,13 @@
                 BasicHttpRequest proxyReq = new BasicHttpRequest
                     ("CONNECT", mHost.toHostString());
 
-                // add all 'proxy' headers from the original request
+                // add all 'proxy' headers from the original request, we also need
+                // to add 'host' header unless we want proxy to answer us with a
+                // 400 Bad Request
                 for (Header h : req.mHttpRequest.getAllHeaders()) {
                     String headerName = h.getName().toLowerCase();
-                    if (headerName.startsWith("proxy") || headerName.equals("keep-alive")) {
+                    if (headerName.startsWith("proxy") || headerName.equals("keep-alive")
+                            || headerName.equals("host")) {
                         proxyReq.addHeader(h);
                     }
                 }
