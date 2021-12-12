diff --git a/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/Function.java b/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/Function.java
index 1f5e586..ffcc6b8 100644
--- a/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/Function.java
+++ b/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/Function.java
@@ -250,7 +250,7 @@
         int target = getIndex(args[i++]);
         int[] arguments = new int[args.length - i];
         int j = 0;
-        while (i < arguments.length) {
+        while (j < arguments.length) {
             arguments[j++] = getIndex(args[i++]);
         }
 
