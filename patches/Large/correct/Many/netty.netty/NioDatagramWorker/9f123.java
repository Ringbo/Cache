diff --git a/src/main/java/org/jboss/netty/channel/socket/nio/NioDatagramWorker.java b/src/main/java/org/jboss/netty/channel/socket/nio/NioDatagramWorker.java
index 3725e0b..c676c39 100644
--- a/src/main/java/org/jboss/netty/channel/socket/nio/NioDatagramWorker.java
+++ b/src/main/java/org/jboss/netty/channel/socket/nio/NioDatagramWorker.java
@@ -401,7 +401,7 @@
             // the channel is ready to receive.
             remoteAddress = nioChannel.receive(byteBuffer);
             failure = false;
-        } catch (AsynchronousCloseException e) {
+        } catch (ClosedChannelException e) {
             // Can happen, and does not need a user attention.
         } catch (Throwable t) {
             fireExceptionCaught(channel, t);
