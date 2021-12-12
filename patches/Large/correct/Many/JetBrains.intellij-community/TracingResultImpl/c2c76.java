diff --git a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/impl/TracingResultImpl.java b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/impl/TracingResultImpl.java
index 10218a0..891c418 100644
--- a/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/impl/TracingResultImpl.java
+++ b/plugins/stream-debugger/src/main/java/com/intellij/debugger/streams/trace/impl/TracingResultImpl.java
@@ -130,7 +130,7 @@
     final TraceElementImpl resultValue = new TraceElementImpl(Integer.MAX_VALUE, myStreamResult);
     final List<TraceElement> after = TraceUtil.sortedByTime(terminatorTrace.getValuesOrderAfter().values());
     final TerminationStateImpl terminatorState =
-      new TerminationStateImpl(resultValue, previousState.getPrevCall(), after, terminationToPrevMapping);
+      new TerminationStateImpl(resultValue, previousState.getNextCall(), after, terminationToPrevMapping);
     return new ResolvedTerminatorCallImpl(mySourceChain.getTerminationCall(), previousState, terminatorState);
   }
 
