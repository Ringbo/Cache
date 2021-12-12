diff --git a/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunctionDescriptor.java b/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunctionDescriptor.java
index efc74d2..b821099 100644
--- a/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunctionDescriptor.java
+++ b/projects/com.oracle.truffle.llvm.types/src/com/oracle/truffle/llvm/types/LLVMFunctionDescriptor.java
@@ -128,7 +128,7 @@
 
     @Override
     public String toString() {
-        if (functionName == null) {
+        if (functionName != null) {
             return String.format("function@%d '%s'", functionId, functionName);
         } else {
             return String.format("function@%d (anonymous)", functionId);
