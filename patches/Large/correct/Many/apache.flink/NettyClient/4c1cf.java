diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/netty/NettyClient.java b/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/netty/NettyClient.java
index fd6d980..6cab15d 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/netty/NettyClient.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/io/network/netty/NettyClient.java
@@ -147,7 +147,7 @@
 		// multiple clients running on the same host.
 		String name = NettyConfig.CLIENT_THREAD_GROUP_NAME + " (" + config.getServerPort() + ")";
 
-		EpollEventLoopGroup epollGroup = new EpollEventLoopGroup(config.getServerNumThreads(), NettyServer.getNamedThreadFactory(name));
+		EpollEventLoopGroup epollGroup = new EpollEventLoopGroup(config.getClientNumThreads(), NettyServer.getNamedThreadFactory(name));
 		bootstrap.group(epollGroup).channel(EpollSocketChannel.class);
 	}
 
