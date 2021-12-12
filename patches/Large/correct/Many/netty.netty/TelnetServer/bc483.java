diff --git a/example/src/main/java/io/netty/example/telnet/TelnetServer.java b/example/src/main/java/io/netty/example/telnet/TelnetServer.java
index 6d31936..d69da7a 100644
--- a/example/src/main/java/io/netty/example/telnet/TelnetServer.java
+++ b/example/src/main/java/io/netty/example/telnet/TelnetServer.java
@@ -38,7 +38,7 @@
             ServerBootstrap b = new ServerBootstrap();
             b.group(bossGroup, workerGroup)
              .channel(NioServerSocketChannel.class)
-             .childHandler(new TelnetServerPipelineFactory());
+             .childHandler(new TelnetServerInitializer());
 
             b.bind(port).sync().channel().closeFuture().sync();
         } finally {
