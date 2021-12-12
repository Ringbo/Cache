diff --git a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java
index ce1c3f5..0466ef9 100644
--- a/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java
+++ b/websockets-jsr/src/main/java/io/undertow/websockets/jsr/annotated/AnnotatedEndpoint.java
@@ -105,7 +105,7 @@
     }
 
     private void addPartialHandler(final UndertowSession session, final BoundMethod method) {
-        session.addMessageHandler((Class) textMessage.getMessageType(), new MessageHandler.Partial<Object>() {
+        session.addMessageHandler((Class) method.getMessageType(), new MessageHandler.Partial<Object>() {
             @Override
             public void onMessage(Object partialMessage, boolean last) {
 
