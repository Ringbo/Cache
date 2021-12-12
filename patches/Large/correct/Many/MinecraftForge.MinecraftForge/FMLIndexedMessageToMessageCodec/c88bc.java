diff --git a/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java b/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java
index 62ff2dd..c168081 100644
--- a/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java
+++ b/src/main/java/net/minecraftforge/fml/common/network/FMLIndexedMessageToMessageCodec.java
@@ -69,7 +69,7 @@
     protected final void decode(ChannelHandlerContext ctx, FMLProxyPacket msg, List<Object> out) throws Exception
     {
         testMessageValidity(msg);
-        ByteBuf payload = msg.payload().copy();
+        ByteBuf payload = msg.payload().duplicate();
         if (payload.readableBytes() < 1)
         {
             FMLLog.log(Level.ERROR, "The FMLIndexedCodec has received an empty buffer on channel %s, likely a result of a LAN server issue. Pipeline parts : %s", ctx.channel().attr(NetworkRegistry.FML_CHANNEL), ctx.pipeline().toString());
