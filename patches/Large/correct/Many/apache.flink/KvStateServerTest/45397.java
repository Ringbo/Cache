diff --git a/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/KvStateServerTest.java b/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/KvStateServerTest.java
index 8af9cf5..79c23ad 100644
--- a/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/KvStateServerTest.java
+++ b/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/KvStateServerTest.java
@@ -79,7 +79,8 @@
 	@AfterClass
 	public static void tearDown() throws Exception {
 		if (NIO_GROUP != null) {
-			NIO_GROUP.shutdownGracefully();
+			// note: no "quiet period" to not trigger Netty#4357
+			NIO_GROUP.shutdownGracefully(0, 10, TimeUnit.SECONDS);
 		}
 	}
 
@@ -191,7 +192,8 @@
 			if (bootstrap != null) {
 				EventLoopGroup group = bootstrap.group();
 				if (group != null) {
-					group.shutdownGracefully();
+					// note: no "quiet period" to not trigger Netty#4357
+					group.shutdownGracefully(0, 10, TimeUnit.SECONDS);
 				}
 			}
 		}
