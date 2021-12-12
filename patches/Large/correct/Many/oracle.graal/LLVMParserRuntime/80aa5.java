diff --git a/projects/com.oracle.truffle.llvm.parser.base/src/com/oracle/truffle/llvm/parser/base/util/LLVMParserRuntime.java b/projects/com.oracle.truffle.llvm.parser.base/src/com/oracle/truffle/llvm/parser/base/util/LLVMParserRuntime.java
index 02c059d..6cd0551 100644
--- a/projects/com.oracle.truffle.llvm.parser.base/src/com/oracle/truffle/llvm/parser/base/util/LLVMParserRuntime.java
+++ b/projects/com.oracle.truffle.llvm.parser.base/src/com/oracle/truffle/llvm/parser/base/util/LLVMParserRuntime.java
@@ -90,7 +90,7 @@
 
     LLVMTypeHelper getTypeHelper();
 
-    Map<String, ResolvedType> getVariableNameTypesMapping();
+    Map<String, Type> getVariableNameTypesMapping();
 
     NodeFactoryFacade getNodeFactoryFacade();
 
