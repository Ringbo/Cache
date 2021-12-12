diff --git a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java
index 7e9843e..ce1c3f5 100644
--- a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java
+++ b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java
@@ -134,7 +134,7 @@
 
 
     private void addWholeHandler(final UndertowSession session, final BoundMethod method) {
-        session.addMessageHandler((Class) textMessage.getMessageType(), new MessageHandler.Whole<Object>() {
+        session.addMessageHandler((Class) method.getMessageType(), new MessageHandler.Whole<Object>() {
             @Override
             public void onMessage(Object partialMessage) {
 
