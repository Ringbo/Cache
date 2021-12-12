diff --git a/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/SimplePeekCallTraceInterpreter.java b/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/SimplePeekCallTraceInterpreter.java
index ac99fac..ed8dbc5 100644
--- a/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/SimplePeekCallTraceInterpreter.java
+++ b/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/SimplePeekCallTraceInterpreter.java
@@ -53,7 +53,7 @@
   }
 
   @NotNull
-  private Map<Integer, TraceElement> resolveTrace(@NotNull ArrayReference mapArray) {
+  private static Map<Integer, TraceElement> resolveTrace(@NotNull ArrayReference mapArray) {
     final Value keys = mapArray.getValue(0);
     final Value values = mapArray.getValue(1);
     if (keys instanceof ArrayReference && values instanceof ArrayReference) {
@@ -64,7 +64,7 @@
   }
 
   @NotNull
-  private Map<Integer, TraceElement> resolveTrace(@NotNull ArrayReference keysArray, @NotNull ArrayReference valuesArray) {
+  private static Map<Integer, TraceElement> resolveTrace(@NotNull ArrayReference keysArray, @NotNull ArrayReference valuesArray) {
     final LinkedHashMap<Integer, TraceElement> result = new LinkedHashMap<>();
     final List<Value> keyMirrors = keysArray.getValues();
     final List<Value> valueMirrors = valuesArray.getValues();
@@ -81,7 +81,7 @@
   }
 
   @NotNull
-  private TraceElement resolveTraceElement(@NotNull Value key, @Nullable Value value) {
+  private static TraceElement resolveTraceElement(@NotNull Value key, @Nullable Value value) {
     if (key instanceof IntegerValue) {
       return new TraceElementImpl(((IntegerValue)key).value(), value);
     }
