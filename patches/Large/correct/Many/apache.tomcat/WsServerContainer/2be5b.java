diff --git a/java/org/apache/tomcat/websocket/server/WsServerContainer.java b/java/org/apache/tomcat/websocket/server/WsServerContainer.java
index c704d9f..d111cb4 100644
--- a/java/org/apache/tomcat/websocket/server/WsServerContainer.java
+++ b/java/org/apache/tomcat/websocket/server/WsServerContainer.java
@@ -347,7 +347,7 @@
     private void registerAuthenticatedSession(WsSession wsSession,
             String httpSessionId) {
         Set<WsSession> wsSessions = authenticatedSessions.get(httpSessionId);
-        if (wsSession == null) {
+        if (wsSessions == null) {
             wsSessions = Collections.newSetFromMap(
                      new ConcurrentHashMap<WsSession,Boolean>());
              authenticatedSessions.putIfAbsent(httpSessionId, wsSessions);
