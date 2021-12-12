diff --git a/flink-runtime/src/test/java/org/apache/flink/runtime/rpc/akka/AkkaRpcActorTest.java b/flink-runtime/src/test/java/org/apache/flink/runtime/rpc/akka/AkkaRpcActorTest.java
index 1b45006..2a65cac 100644
--- a/flink-runtime/src/test/java/org/apache/flink/runtime/rpc/akka/AkkaRpcActorTest.java
+++ b/flink-runtime/src/test/java/org/apache/flink/runtime/rpc/akka/AkkaRpcActorTest.java
@@ -185,7 +185,7 @@
 		final DummyRpcEndpoint rpcEndpoint = new DummyRpcEndpoint(akkaRpcService);
 		rpcEndpoint.start();
 
-		CompletableFuture<Boolean> terminationFuture = rpcEndpoint.getTerminationFuture();
+		CompletableFuture<Void> terminationFuture = rpcEndpoint.getTerminationFuture();
 
 		assertFalse(terminationFuture.isDone());
 
@@ -246,7 +246,7 @@
 
 		rpcEndpoint.shutDown();
 
-		CompletableFuture<Boolean> terminationFuture = rpcEndpoint.getTerminationFuture();
+		CompletableFuture<Void> terminationFuture = rpcEndpoint.getTerminationFuture();
 
 		try {
 			terminationFuture.get();
@@ -265,7 +265,7 @@
 
 		simpleRpcEndpoint.shutDown();
 
-		CompletableFuture<Boolean> terminationFuture = simpleRpcEndpoint.getTerminationFuture();
+		CompletableFuture<Void> terminationFuture = simpleRpcEndpoint.getTerminationFuture();
 
 		// check that we executed the postStop method in the main thread, otherwise an exception
 		// would be thrown here.
@@ -285,7 +285,7 @@
 
 			rpcEndpoint.start();
 
-			CompletableFuture<Boolean> terminationFuture = rpcEndpoint.getTerminationFuture();
+			CompletableFuture<Void> terminationFuture = rpcEndpoint.getTerminationFuture();
 
 			rpcService.stopService();
 
