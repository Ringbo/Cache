diff --git a/src/com/maddyhome/idea/vim/ex/range/AbstractRange.java b/src/com/maddyhome/idea/vim/ex/range/AbstractRange.java
index 747dc29..07b7dcb 100644
--- a/src/com/maddyhome/idea/vim/ex/range/AbstractRange.java
+++ b/src/com/maddyhome/idea/vim/ex/range/AbstractRange.java
@@ -36,7 +36,7 @@
         }
         else if (str.equals("%"))
         {
-            return new Range[] { new LineNumberRange(1, 0, move), new LineNumberRange(true, offset, move) };
+            return new Range[] { new LineNumberRange(0, 0, move), new LineNumberRange(true, offset, move) };
         }
         else if (str.equals("$"))
         {
