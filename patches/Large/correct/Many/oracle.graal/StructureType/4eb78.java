diff --git a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/types/StructureType.java b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/types/StructureType.java
index cbeb04c..8abe0cb 100644
--- a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/types/StructureType.java
+++ b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/types/StructureType.java
@@ -91,7 +91,7 @@
 
     @Override
     public int getAlignment(DataSpecConverter targetDataLayout) {
-        return getLargestAlignment(targetDataLayout);
+        return isPacked ? 1 : getLargestAlignment(targetDataLayout);
     }
 
     @Override
@@ -106,7 +106,7 @@
 
         int padding = 0;
         if (!isPacked && sumByte != 0) {
-            padding = Type.getPadding(sumByte, getLargestAlignment(targetDataLayout));
+            padding = Type.getPadding(sumByte, getAlignment(targetDataLayout));
         }
 
         return sumByte + padding;
