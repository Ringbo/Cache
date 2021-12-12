diff --git a/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/ClientTest.java b/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/ClientTest.java
index 8638efa..6aa4710 100644
--- a/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/ClientTest.java
+++ b/flink-queryable-state/flink-queryable-state-runtime/src/test/java/org/apache/flink/queryablestate/network/ClientTest.java
@@ -111,7 +111,8 @@
 	@After
 	public void tearDown() throws Exception {
 		if (nioGroup != null) {
-			nioGroup.shutdownGracefully();
+			// note: no "quiet period" to not trigger Netty#4357
+			nioGroup.shutdownGracefully(0, 10, TimeUnit.SECONDS);
 		}
 	}
 
