diff --git a/transport/src/test/java/io/netty/channel/ChannelOutboundBufferTest.java b/transport/src/test/java/io/netty/channel/ChannelOutboundBufferTest.java
index e283a10..e9dae04 100644
--- a/transport/src/test/java/io/netty/channel/ChannelOutboundBufferTest.java
+++ b/transport/src/test/java/io/netty/channel/ChannelOutboundBufferTest.java
@@ -209,7 +209,7 @@
     @Test
     public void testWritability() {
         final StringBuilder buf = new StringBuilder();
-        EmbeddedChannel ch = new EmbeddedChannel(new ChannelHandlerAdapter() {
+        EmbeddedChannel ch = new EmbeddedChannel(new ChannelInboundHandlerAdapter() {
             @Override
             public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
                 buf.append(ctx.channel().isWritable());
@@ -241,7 +241,7 @@
     @Test
     public void testUserDefinedWritability() {
         final StringBuilder buf = new StringBuilder();
-        EmbeddedChannel ch = new EmbeddedChannel(new ChannelHandlerAdapter() {
+        EmbeddedChannel ch = new EmbeddedChannel(new ChannelInboundHandlerAdapter() {
             @Override
             public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
                 buf.append(ctx.channel().isWritable());
@@ -273,7 +273,7 @@
     @Test
     public void testUserDefinedWritability2() {
         final StringBuilder buf = new StringBuilder();
-        EmbeddedChannel ch = new EmbeddedChannel(new ChannelHandlerAdapter() {
+        EmbeddedChannel ch = new EmbeddedChannel(new ChannelInboundHandlerAdapter() {
             @Override
             public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
                 buf.append(ctx.channel().isWritable());
@@ -309,7 +309,7 @@
     @Test
     public void testMixedWritability() {
         final StringBuilder buf = new StringBuilder();
-        EmbeddedChannel ch = new EmbeddedChannel(new ChannelHandlerAdapter() {
+        EmbeddedChannel ch = new EmbeddedChannel(new ChannelInboundHandlerAdapter() {
             @Override
             public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
                 buf.append(ctx.channel().isWritable());
