diff --git a/plugins/stream-debugger/testData/debug/src/MapNullToValue.java b/plugins/stream-debugger/testData/debug/src/MapNullToValue.java
index 574c9de..2af34f0 100644
--- a/plugins/stream-debugger/testData/debug/src/MapNullToValue.java
+++ b/plugins/stream-debugger/testData/debug/src/MapNullToValue.java
@@ -4,6 +4,6 @@
 public class MapNullToValue {
   public static void main(String[] args) {
     // Breakpoint!
-    final Optional<Object> any = Stream.of(null).map(x -> new Object()).findAny();
+    final Optional<Object> any = Stream.of(null, null).map(x -> new Object()).findAny();
   }
 }
