diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcEndpoint.java b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcEndpoint.java
index 9c27c95..9c2ed83 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcEndpoint.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/RpcEndpoint.java
@@ -228,7 +228,7 @@
 	 *
 	 * @return Future which is completed when the rpc endpoint has been terminated.
 	 */
-	public CompletableFuture<Boolean> getTerminationFuture() {
+	public CompletableFuture<Void> getTerminationFuture() {
 		return rpcServer.getTerminationFuture();
 	}
 
