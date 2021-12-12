diff --git a/transport/src/main/java/io/netty/channel/socket/aio/AioSocketChannel.java b/transport/src/main/java/io/netty/channel/socket/aio/AioSocketChannel.java
index d31b753..ea6bc0c 100644
--- a/transport/src/main/java/io/netty/channel/socket/aio/AioSocketChannel.java
+++ b/transport/src/main/java/io/netty/channel/socket/aio/AioSocketChannel.java
@@ -190,7 +190,7 @@
 
             if (empty) {
                 // Reset reader/writerIndex to 0 if the buffer is empty.
-                buf.clear();
+                buf.discardReadBytes();
             }
 
             channel.notifyFlushFutures(writtenBytes);
@@ -274,7 +274,6 @@
                     channel.unsafe().close(channel.unsafe().voidFuture());
                 } else {
                     // start the next read
-                    //channel.readTask.run();
                     channel.eventLoop().execute(channel.readTask);
                 }
             }
