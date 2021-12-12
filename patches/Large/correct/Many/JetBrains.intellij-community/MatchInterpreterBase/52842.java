diff --git a/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/MatchInterpreterBase.java b/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/MatchInterpreterBase.java
index a6a16b6..fdb34b7 100644
--- a/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/MatchInterpreterBase.java
+++ b/plugins/stream-debugger/src/com/intellij/debugger/streams/trace/impl/interpret/MatchInterpreterBase.java
@@ -81,12 +81,12 @@
   }
 
   @NotNull
-  private Map<Integer, TraceElement> onlyFiltered(@NotNull Collection<TraceElement> afterFilter) {
+  private static Map<Integer, TraceElement> onlyFiltered(@NotNull Collection<TraceElement> afterFilter) {
     return makeIndexByTime(afterFilter.stream());
   }
 
   @NotNull
-  private Map<Integer, TraceElement> difference(@NotNull Collection<TraceElement> before, @NotNull Set<Integer> timesAfter) {
+  private static Map<Integer, TraceElement> difference(@NotNull Collection<TraceElement> before, @NotNull Set<Integer> timesAfter) {
     return makeIndexByTime(before.stream().filter(x -> !timesAfter.contains(x.getTime())));
   }
 
