diff --git a/redisson/src/main/java/org/redisson/client/handler/PingConnectionHandler.java b/redisson/src/main/java/org/redisson/client/handler/PingConnectionHandler.java
index 563ad82..d59b5e7 100644
--- a/redisson/src/main/java/org/redisson/client/handler/PingConnectionHandler.java
+++ b/redisson/src/main/java/org/redisson/client/handler/PingConnectionHandler.java
@@ -61,7 +61,7 @@
     }
 
     protected void sendPing(final ChannelHandlerContext ctx) {
-        RedisConnection connection = RedisConnection.getFrom(ctx.channel());
+        final RedisConnection connection = RedisConnection.getFrom(ctx.channel());
         final RFuture<String> future = connection.async(StringCodec.INSTANCE, RedisCommands.PING);
         
         config.getTimer().newTimeout(new TimerTask() {
