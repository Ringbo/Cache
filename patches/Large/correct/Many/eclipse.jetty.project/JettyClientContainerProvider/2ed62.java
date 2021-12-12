diff --git a/jetty-websocket/javax-websocket-client-impl/src/main/java/org/eclipse/jetty/websocket/jsr356/JettyClientContainerProvider.java b/jetty-websocket/javax-websocket-client-impl/src/main/java/org/eclipse/jetty/websocket/jsr356/JettyClientContainerProvider.java
index 69037a2..c1d7a6a 100644
--- a/jetty-websocket/javax-websocket-client-impl/src/main/java/org/eclipse/jetty/websocket/jsr356/JettyClientContainerProvider.java
+++ b/jetty-websocket/javax-websocket-client-impl/src/main/java/org/eclipse/jetty/websocket/jsr356/JettyClientContainerProvider.java
@@ -186,7 +186,7 @@
                 {
                     // Add as bean to contextHandler
                     // Allow startup to follow Jetty lifecycle
-                    ((ContainerLifeCycle) contextHandler).addBean(clientContainer);
+                    ((ContainerLifeCycle) contextHandler).addManaged(clientContainer);
                 }
                 else
                 {
