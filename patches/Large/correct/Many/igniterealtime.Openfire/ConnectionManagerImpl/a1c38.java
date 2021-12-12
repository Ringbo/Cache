diff --git a/src/java/org/jivesoftware/wildfire/spi/ConnectionManagerImpl.java b/src/java/org/jivesoftware/wildfire/spi/ConnectionManagerImpl.java
index e8e257b..3f2a067 100644
--- a/src/java/org/jivesoftware/wildfire/spi/ConnectionManagerImpl.java
+++ b/src/java/org/jivesoftware/wildfire/spi/ConnectionManagerImpl.java
@@ -424,7 +424,7 @@
         sessionManager = server.getSessionManager();
         // Check if we need to configure MINA to use Direct or Heap Buffers
         // Note: It has been reported that heap buffers are 50% faster than direct buffers
-        if (JiveGlobals.getBooleanProperty("xmpp.socket.directBuffer", false)) {
+        if (!JiveGlobals.getBooleanProperty("xmpp.socket.directBuffer", false)) {
             ByteBuffer.setUseDirectBuffers(false);
             ByteBuffer.setAllocator(new SimpleByteBufferAllocator());
         }
