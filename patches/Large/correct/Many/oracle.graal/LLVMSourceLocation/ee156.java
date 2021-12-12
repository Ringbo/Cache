diff --git a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/scope/LLVMSourceLocation.java b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/scope/LLVMSourceLocation.java
index 5879851..24b06eb 100644
--- a/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/scope/LLVMSourceLocation.java
+++ b/projects/com.oracle.truffle.llvm.runtime/src/com/oracle/truffle/llvm/runtime/debug/scope/LLVMSourceLocation.java
@@ -103,7 +103,7 @@
         this.sourceSection = sourceSection;
     }
 
-    public SourceSection getSourceSection() {
+    public synchronized SourceSection getSourceSection() {
         CompilerAsserts.neverPartOfCompilation();
         if (sourceSection == null && lazySourceSection != null) {
             sourceSection = lazySourceSection.get();
