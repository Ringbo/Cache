diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/FencedAkkaInvocationHandler.java b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/FencedAkkaInvocationHandler.java
index 3ca75e2..564b1ef 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/FencedAkkaInvocationHandler.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/FencedAkkaInvocationHandler.java
@@ -60,7 +60,7 @@
 			ActorRef rpcEndpoint,
 			Time timeout,
 			long maximumFramesize,
-			@Nullable CompletableFuture<Boolean> terminationFuture,
+			@Nullable CompletableFuture<Void> terminationFuture,
 			Supplier<F> fencingTokenSupplier) {
 		super(address, hostname, rpcEndpoint, timeout, maximumFramesize, terminationFuture);
 
