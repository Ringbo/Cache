diff --git a/java/org/apache/tomcat/websocket/WsRemoteEndpointBase.java b/java/org/apache/tomcat/websocket/WsRemoteEndpointBase.java
index 21ce784..1fe1da6 100644
--- a/java/org/apache/tomcat/websocket/WsRemoteEndpointBase.java
+++ b/java/org/apache/tomcat/websocket/WsRemoteEndpointBase.java
@@ -457,8 +457,8 @@
             if (fragmented) {
                 // Currently fragmented
                 if (text != isText) {
-                    // TODO i18n
-                    throw new IllegalStateException();
+                    throw new IllegalStateException(
+                            sm.getString("messageSendStateMachine.changeType"));
                 }
                 nextText = text;
                 nextFragmented = !isLast;
