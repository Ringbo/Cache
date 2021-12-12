diff --git a/src/main/java/org/jboss/netty/handler/timeout/IdleStateHandler.java b/src/main/java/org/jboss/netty/handler/timeout/IdleStateHandler.java
index 42752a1..9cf8fe5 100644
--- a/src/main/java/org/jboss/netty/handler/timeout/IdleStateHandler.java
+++ b/src/main/java/org/jboss/netty/handler/timeout/IdleStateHandler.java
@@ -237,7 +237,7 @@
                 writerIdleTimeout =
                     timer.newTimeout(this, writerIdleTimeMillis, TimeUnit.MILLISECONDS);
                 try {
-                    channelIdle(ctx, IdleState.WRITER_IDLE, lastReadTime);
+                    channelIdle(ctx, IdleState.WRITER_IDLE, lastWriteTime);
                 } catch (Throwable t) {
                     fireExceptionCaught(ctx, t);
                 }
@@ -271,7 +271,7 @@
                 allIdleTimeout =
                     timer.newTimeout(this, allIdleTimeMillis, TimeUnit.MILLISECONDS);
                 try {
-                    channelIdle(ctx, IdleState.ALL_IDLE, lastReadTime);
+                    channelIdle(ctx, IdleState.ALL_IDLE, lastIoTime);
                 } catch (Throwable t) {
                     fireExceptionCaught(ctx, t);
                 }
