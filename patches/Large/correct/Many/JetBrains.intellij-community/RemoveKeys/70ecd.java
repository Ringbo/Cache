diff --git a/plugins/stream-debugger/testData/streamex/src/filtering/RemoveKeys.java b/plugins/stream-debugger/testData/streamex/src/filtering/RemoveKeys.java
index 62deb26..0878d4c 100644
--- a/plugins/stream-debugger/testData/streamex/src/filtering/RemoveKeys.java
+++ b/plugins/stream-debugger/testData/streamex/src/filtering/RemoveKeys.java
@@ -5,7 +5,7 @@
 public class RemoveKeys {
   public static void main(String[] args) {
     // Breakpoint!
-    final long count = EntryStream.of(1, 1, 2, 4, 3, 9).removeKeys(x -> x < 7).count();
+    final long count = EntryStream.of(1, 1, 2, 4, 3, 9).removeKeys(x -> x < 3).count();
     System.out.println(count);
   }
 }
