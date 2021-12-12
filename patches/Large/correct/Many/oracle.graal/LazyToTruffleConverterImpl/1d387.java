diff --git a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/LazyToTruffleConverterImpl.java b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/LazyToTruffleConverterImpl.java
index 97836cd..3cec342 100644
--- a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/LazyToTruffleConverterImpl.java
+++ b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/LazyToTruffleConverterImpl.java
@@ -96,10 +96,10 @@
 
         // setup the uniquesRegion
         UniquesRegion uniquesRegion = new UniquesRegion();
-        GetStackSpaceFactory getStackSpaceFactoy = GetStackSpaceFactory.createGetStackSpaceFactory(uniquesRegion);
+        GetStackSpaceFactory getStackSpaceFactory = GetStackSpaceFactory.createGetStackSpaceFactory(uniquesRegion);
 
         LLVMLivenessAnalysisResult liveness = LLVMLivenessAnalysis.computeLiveness(frame, runtime.getContext(), phis, method);
-        LLVMSymbolReadResolver symbols = new LLVMSymbolReadResolver(runtime, frame, getStackSpaceFactoy);
+        LLVMSymbolReadResolver symbols = new LLVMSymbolReadResolver(runtime, frame, getStackSpaceFactory);
         List<FrameSlot> notNullable = new ArrayList<>();
 
         LLVMRuntimeDebugInformation dbgInfoHandler = new LLVMRuntimeDebugInformation(frame, runtime.getNodeFactory(), runtime.getContext(), notNullable, symbols);
