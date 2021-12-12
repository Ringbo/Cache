diff --git a/websockets/src/test/java/io/undertow/websockets/protocol/server/AutobahnWebSocketServer.java b/websockets/src/test/java/io/undertow/websockets/protocol/server/AutobahnWebSocketServer.java
index 2bb8409..945701c 100644
--- a/websockets/src/test/java/io/undertow/websockets/protocol/server/AutobahnWebSocketServer.java
+++ b/websockets/src/test/java/io/undertow/websockets/protocol/server/AutobahnWebSocketServer.java
@@ -76,7 +76,7 @@
                     .set(Options.TCP_NODELAY, true)
                     .set(Options.REUSE_ADDRESSES, true)
                     .getMap();
-            openListener = new HttpOpenListener(new ByteBufferSlicePool(BufferAllocator.DIRECT_BYTE_BUFFER_ALLOCATOR, 8192, 8192 * 8192));
+            openListener = new HttpOpenListener(new ByteBufferSlicePool(BufferAllocator.DIRECT_BYTE_BUFFER_ALLOCATOR, 8192, 8192 * 8192), 8192);
             ChannelListener acceptListener = ChannelListeners.openListenerAdapter(openListener);
             server = worker.createStreamServer(new InetSocketAddress(port), acceptListener, serverOptions);
 
