diff --git a/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketHandshakeFilter.java b/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketHandshakeFilter.java
index 49bd0b0..bbaabcb 100644
--- a/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketHandshakeFilter.java
+++ b/modules/cpr/src/main/java/org/atmosphere/websocket/WebSocketHandshakeFilter.java
@@ -68,7 +68,7 @@
                         logger.error("Invalid WebSocket Specification {} with {} ",
                                 r.getHeader("Connection"), r.getIntHeader("Sec-WebSocket-Version"));
                         HttpServletResponse.class.cast(response).addHeader(X_ATMOSPHERE_ERROR, "Websocket protocol not supported");
-                        HttpServletResponse.class.cast(response).sendError(202, "Websocket protocol not supported");
+                        HttpServletResponse.class.cast(response).sendError(501, "Websocket protocol not supported");
                         return;
                     }
                 }
