diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcServer.java b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcServer.java
index ac2f7eb..14d0cc9 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcServer.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcServer.java
@@ -30,5 +30,5 @@
 	 *
 	 * @return Future indicating when the rpc endpoint has been terminated
 	 */
-	CompletableFuture<Boolean> getTerminationFuture();
+	CompletableFuture<Void> getTerminationFuture();
 }
