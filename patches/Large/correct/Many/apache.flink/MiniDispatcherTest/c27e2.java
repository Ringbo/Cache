diff --git a/flink-runtime/src/test/java/org/apache/flink/runtime/dispatcher/MiniDispatcherTest.java b/flink-runtime/src/test/java/org/apache/flink/runtime/dispatcher/MiniDispatcherTest.java
index 4291ef2..2b98939 100644
--- a/flink-runtime/src/test/java/org/apache/flink/runtime/dispatcher/MiniDispatcherTest.java
+++ b/flink-runtime/src/test/java/org/apache/flink/runtime/dispatcher/MiniDispatcherTest.java
@@ -222,7 +222,7 @@
 
 			resultFuture.complete(archivedExecutionGraph);
 
-			final CompletableFuture<Boolean> terminationFuture = miniDispatcher.getTerminationFuture();
+			final CompletableFuture<Void> terminationFuture = miniDispatcher.getTerminationFuture();
 
 			assertThat(terminationFuture.isDone(), is(false));
 
