diff --git a/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMAggregateFactory.java b/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMAggregateFactory.java
index 5a2b172..8c3b351 100644
--- a/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMAggregateFactory.java
+++ b/projects/com.oracle.truffle.llvm.parser.factories/src/com/oracle/truffle/llvm/parser/factories/LLVMAggregateFactory.java
@@ -105,9 +105,9 @@
                     LLVMBaseType llvmType) {
         switch (llvmType) {
             case FLOAT:
-                return new LLVMInsertFloatValueNode(resultAggregate, sourceAggregate, size, offset, (LLVMFloatNode) valueToInsert);
+                return new LLVMInsertFloatValueNode(sourceAggregate, resultAggregate, size, offset, (LLVMFloatNode) valueToInsert);
             case DOUBLE:
-                return new LLVMInsertDoubleValueNode(resultAggregate, sourceAggregate, size, offset, (LLVMDoubleNode) valueToInsert);
+                return new LLVMInsertDoubleValueNode(sourceAggregate, resultAggregate, size, offset, (LLVMDoubleNode) valueToInsert);
             default:
                 throw new AssertionError(llvmType);
         }
