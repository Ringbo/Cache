diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaInvocationHandler.java b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaInvocationHandler.java
index 863b780..cc54f2e 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaInvocationHandler.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/rpc/akka/AkkaInvocationHandler.java
@@ -84,7 +84,7 @@
 
 	// null if gateway; otherwise non-null
 	@Nullable
-	private final CompletableFuture<Boolean> terminationFuture;
+	private final CompletableFuture<Void> terminationFuture;
 
 	AkkaInvocationHandler(
 			String address,
@@ -92,7 +92,7 @@
 			ActorRef rpcEndpoint,
 			Time timeout,
 			long maximumFramesize,
-			@Nullable CompletableFuture<Boolean> terminationFuture) {
+			@Nullable CompletableFuture<Void> terminationFuture) {
 
 		this.address = Preconditions.checkNotNull(address);
 		this.hostname = Preconditions.checkNotNull(hostname);
@@ -341,7 +341,7 @@
 	}
 
 	@Override
-	public CompletableFuture<Boolean> getTerminationFuture() {
+	public CompletableFuture<Void> getTerminationFuture() {
 		return terminationFuture;
 	}
 }
