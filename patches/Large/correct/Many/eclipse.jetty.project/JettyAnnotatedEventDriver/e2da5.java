diff --git a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/events/JettyAnnotatedEventDriver.java b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/events/JettyAnnotatedEventDriver.java
index a2bec04..e9b818d 100644
--- a/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/events/JettyAnnotatedEventDriver.java
+++ b/jetty-websocket/websocket-common/src/main/java/org/eclipse/jetty/websocket/common/events/JettyAnnotatedEventDriver.java
@@ -54,7 +54,7 @@
         }
         if (anno.maxBinaryMessageSize() > 0)
         {
-            this.policy.setMaxTextMessageSize(anno.maxBinaryMessageSize());
+            this.policy.setMaxBinaryMessageSize(anno.maxBinaryMessageSize());
         }
         if (anno.inputBufferSize() > 0)
         {
