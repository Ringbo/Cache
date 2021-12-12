diff --git a/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/TraceResultInterpreterImpl.java b/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/TraceResultInterpreterImpl.java
index f0cf523..705d7a8 100644
--- a/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/TraceResultInterpreterImpl.java
+++ b/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/TraceResultInterpreterImpl.java
@@ -73,7 +73,7 @@
     return result;
   }
 
-  private void logTime(@NotNull Value elapsedTimeArray) {
+  private static void logTime(@NotNull Value elapsedTimeArray) {
     final Value elapsedTime = ((ArrayReference)elapsedTimeArray).getValue(0);
     final long elapsedNanoseconds = ((LongValue)elapsedTime).value();
     final long elapsedMillis = TimeUnit.NANOSECONDS.toMillis(elapsedNanoseconds);
