diff --git a/runners/java-fn-execution/src/main/java/org/apache/beam/runners/fnexecution/state/GrpcStateService.java b/runners/java-fn-execution/src/main/java/org/apache/beam/runners/fnexecution/state/GrpcStateService.java
index eee0305..88738f3 100644
--- a/runners/java-fn-execution/src/main/java/org/apache/beam/runners/fnexecution/state/GrpcStateService.java
+++ b/runners/java-fn-execution/src/main/java/org/apache/beam/runners/fnexecution/state/GrpcStateService.java
@@ -128,7 +128,7 @@
           requestHandlers.getOrDefault(request.getInstructionReference(), this::handlerNotFound);
       try {
         CompletionStage<StateResponse.Builder> result = handler.handle(request);
-        result.whenCompleteAsync(
+        result.whenComplete(
             (StateResponse.Builder responseBuilder, Throwable t) ->
                 // note that this is threadsafe if and only if outboundObserver is threadsafe.
                 outboundObserver.onNext(
