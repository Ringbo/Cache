diff --git a/sharding-proxy-postgres/src/main/java/org/apache/shardingsphere/shardingproxy/transport/postgresql/codec/PostgreSQLPacketCodec.java b/sharding-proxy-postgres/src/main/java/org/apache/shardingsphere/shardingproxy/transport/postgresql/codec/PostgreSQLPacketCodec.java
index 364f793..05c6c6d 100644
--- a/sharding-proxy-postgres/src/main/java/org/apache/shardingsphere/shardingproxy/transport/postgresql/codec/PostgreSQLPacketCodec.java
+++ b/sharding-proxy-postgres/src/main/java/org/apache/shardingsphere/shardingproxy/transport/postgresql/codec/PostgreSQLPacketCodec.java
@@ -40,7 +40,7 @@
     @Override
     protected void doDecode(final ChannelHandlerContext context, final ByteBuf in, final List<Object> out, final int readableBytes) {
         int messageTyepLength = 0;
-        if ('\0' == in.markReaderIndex().readChar()) {
+        if ('\0' == in.markReaderIndex().readByte()) {
             in.resetReaderIndex();
         } else {
             messageTyepLength = PostgreSQLPacket.MESSAGE_TYPE_LENGTH;
