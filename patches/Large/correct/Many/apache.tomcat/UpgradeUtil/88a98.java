diff --git a/java/org/apache/tomcat/websocket/server/UpgradeUtil.java b/java/org/apache/tomcat/websocket/server/UpgradeUtil.java
index 01018ce..b55906f 100644
--- a/java/org/apache/tomcat/websocket/server/UpgradeUtil.java
+++ b/java/org/apache/tomcat/websocket/server/UpgradeUtil.java
@@ -128,7 +128,8 @@
                 Constants.CONNECTION_HEADER_VALUE);
         resp.setHeader(HandshakeResponse.SEC_WEBSOCKET_ACCEPT,
                 getWebSocketAccept(key));
-        if (subProtocol != null) {
+        if (subProtocol != null && subProtocol.length() > 0) {
+            // RFC6455 4.2.2 explicitly states "" is not valid here
             resp.setHeader("Sec-WebSocket-Protocol", subProtocol);
         }
         if (!extensions.isEmpty()) {
