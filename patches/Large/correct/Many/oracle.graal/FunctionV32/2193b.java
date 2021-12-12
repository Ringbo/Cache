diff --git a/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/FunctionV32.java b/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/FunctionV32.java
index b5cf88f..14c2b6d 100644
--- a/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/FunctionV32.java
+++ b/projects/uk.ac.man.cs.llvm/src/uk/ac/man/cs/llvm/ir/module/FunctionV32.java
@@ -46,7 +46,7 @@
     @Override
     protected void createAllocation(long[] args) {
         int i = 0;
-        Type type = types.get(args[0]);
+        Type type = types.get(args[i++]);
         i++; // Unused parameter
         int count = getIndexV0(args[i++]);
         int align = getAlign(args[i++]);
@@ -62,7 +62,7 @@
         int target = getIndex(args[i++]);
         int[] arguments = new int[args.length - i];
         int j = 0;
-        while (i < arguments.length) {
+        while (j < arguments.length) {
             arguments[j++] = getIndex(args[i++]);
         }
 
