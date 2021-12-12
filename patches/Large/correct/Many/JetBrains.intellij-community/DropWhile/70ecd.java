diff --git a/plugins/stream-debugger/testData/streamex/src/filtering/DropWhile.java b/plugins/stream-debugger/testData/streamex/src/filtering/DropWhile.java
index c31e8b7..b2dbb5b 100644
--- a/plugins/stream-debugger/testData/streamex/src/filtering/DropWhile.java
+++ b/plugins/stream-debugger/testData/streamex/src/filtering/DropWhile.java
@@ -5,7 +5,7 @@
 public class DropWhile {
   public static void main(String[] args) {
     // Breakpoint!
-    final long count = StreamEx.of(1, 2, 3, 4).dropWhile(x -> x < 4).count();
+    final long count = StreamEx.of(1, 2, 3, 2).dropWhile(x -> x < 3).count();
     System.out.println(count);
   }
 }
