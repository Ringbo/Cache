diff --git a/subprojects/messaging/src/main/java/org/gradle/internal/remote/internal/hub/MessageHubBackedServer.java b/subprojects/messaging/src/main/java/org/gradle/internal/remote/internal/hub/MessageHubBackedServer.java
index e67c295..dc82ef5 100644
--- a/subprojects/messaging/src/main/java/org/gradle/internal/remote/internal/hub/MessageHubBackedServer.java
+++ b/subprojects/messaging/src/main/java/org/gradle/internal/remote/internal/hub/MessageHubBackedServer.java
@@ -34,7 +34,7 @@
     }
 
     public ConnectionAcceptor accept(Action<ObjectConnection> action) {
-        return connector.accept(new ConnectEventAction(action), false);
+        return connector.accept(new ConnectEventAction(action), true);
     }
 
     private class ConnectEventAction implements Action<ConnectCompletion> {
