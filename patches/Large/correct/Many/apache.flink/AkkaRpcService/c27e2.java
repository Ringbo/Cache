diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaRpcService.java b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaRpcService.java
index a65fe46..8e96492 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaRpcService.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaRpcService.java
@@ -195,7 +195,7 @@
 	public <C extends RpcEndpoint & RpcGateway> RpcServer startServer(C rpcEndpoint) {
 		checkNotNull(rpcEndpoint, "rpc endpoint");
 
-		CompletableFuture<Boolean> terminationFuture = new CompletableFuture<>();
+		CompletableFuture<Void> terminationFuture = new CompletableFuture<>();
 		final Props akkaRpcActorProps;
 
 		if (rpcEndpoint instanceof FencedRpcEndpoint) {
