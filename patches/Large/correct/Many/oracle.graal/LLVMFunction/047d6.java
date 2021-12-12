diff --git a/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunction.java b/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunction.java
index f8a6cb7..e2641f8 100644
--- a/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunction.java
+++ b/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunction.java
@@ -188,7 +188,7 @@
 
     @Override
     public int hashCode() {
-        return getName().hashCode() + 11 * getLlvmParamTypes().hashCode();
+        return getName().hashCode() + 11 * getLlvmReturnType().hashCode();
     }
 
     @Override
