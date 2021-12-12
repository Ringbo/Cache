diff --git a/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java b/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java
index 2f4730c..315ec48 100644
--- a/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java
+++ b/rt/transports/http/src/main/java/org/apache/cxf/transport/servlet/AbstractHTTPServlet.java
@@ -480,7 +480,7 @@
                                            String originalPort) {
             super(request);
             this.newProtocol = originalProto;
-            if (newRemoteAddr != null) {
+            if (originalRemoteAddr != null) {
                 newRemoteAddr = (originalRemoteAddr.split(",")[0]).trim();
             }
             newRequestUri = calculateNewRequestUri(request, originalPrefix);
