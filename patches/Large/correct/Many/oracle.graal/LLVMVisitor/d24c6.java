diff --git a/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java b/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java
index 3ac74eb..29cc112 100644
--- a/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java
+++ b/projects/com.oracle.truffle.llvm.parser.impl/src/com/oracle/truffle/llvm/parser/impl/LLVMVisitor.java
@@ -205,7 +205,7 @@
         private final RootCallTarget staticDestructors;
         private final Map<LLVMFunctionDescriptor, RootCallTarget> parsedFunctions;
 
-        public ParserResult(RootCallTarget mainFunction, RootCallTarget staticInits, RootCallTarget staticDestructors, Map<LLVMFunctionDescriptor, RootCallTarget> parsedFunctions) {
+        ParserResult(RootCallTarget mainFunction, RootCallTarget staticInits, RootCallTarget staticDestructors, Map<LLVMFunctionDescriptor, RootCallTarget> parsedFunctions) {
             this.mainFunction = mainFunction;
             this.staticInits = staticInits;
             this.staticDestructors = staticDestructors;
