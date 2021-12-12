diff --git a/java/org/apache/tomcat/util/net/Nio2Endpoint.java b/java/org/apache/tomcat/util/net/Nio2Endpoint.java
index 3c40929..0162a81 100644
--- a/java/org/apache/tomcat/util/net/Nio2Endpoint.java
+++ b/java/org/apache/tomcat/util/net/Nio2Endpoint.java
@@ -1657,7 +1657,7 @@
                             log.debug(sm.getString("endpoint.err.handshake"), x);
                         }
                     }
-                    if (handshake == 0) {
+                    if (handshake == 0 || status == SocketStatus.ERROR) {
                         SocketState state = SocketState.OPEN;
                         // Process the request from this socket
                         if (status == null) {
