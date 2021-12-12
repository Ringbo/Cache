diff --git a/plugins/stream-debugger/testData/streamex/src/filtering/NonNullValues.java b/plugins/stream-debugger/testData/streamex/src/filtering/NonNullValues.java
index 3a68c45..b8d1c23 100644
--- a/plugins/stream-debugger/testData/streamex/src/filtering/NonNullValues.java
+++ b/plugins/stream-debugger/testData/streamex/src/filtering/NonNullValues.java
@@ -5,7 +5,7 @@
 public class NonNullValues {
   public static void main(String[] args) {
     // Breakpoint!
-    final long count = EntryStream.of(1, 1, 2, null, 3, null).nonNullKeys().count();
+    final long count = EntryStream.of(1, 1, 2, null, 3, null).nonNullValues().count();
     System.out.println(count);
   }
 }
