diff --git a/flink-queryable-state/flink-queryable-state-client-java/src/main/java/org/apache/flink/queryablestate/network/AbstractServerHandler.java b/flink-queryable-state/flink-queryable-state-client-java/src/main/java/org/apache/flink/queryablestate/network/AbstractServerHandler.java
index b2f7a47..fb835e3 100644
--- a/flink-queryable-state/flink-queryable-state-client-java/src/main/java/org/apache/flink/queryablestate/network/AbstractServerHandler.java
+++ b/flink-queryable-state/flink-queryable-state-client-java/src/main/java/org/apache/flink/queryablestate/network/AbstractServerHandler.java
@@ -165,7 +165,7 @@
 	@Override
 	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
 		final String msg = "Exception in server pipeline. Caused by: " + ExceptionUtils.stringifyException(cause);
-		final ByteBuf err = serializer.serializeServerFailure(ctx.alloc(), new RuntimeException(msg));
+		final ByteBuf err = MessageSerializer.serializeServerFailure(ctx.alloc(), new RuntimeException(msg));
 
 		LOG.debug(msg);
 		ctx.writeAndFlush(err).addListener(ChannelFutureListener.CLOSE);
