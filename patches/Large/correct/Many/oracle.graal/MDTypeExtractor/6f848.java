diff --git a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/MDTypeExtractor.java b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/MDTypeExtractor.java
index 13d5847..42f959b 100644
--- a/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/MDTypeExtractor.java
+++ b/projects/com.oracle.truffle.llvm.parser/src/com/oracle/truffle/llvm/parser/metadata/debuginfo/MDTypeExtractor.java
@@ -271,7 +271,7 @@
                     if (baseType == null) {
                         baseType = UNKNOWN_TYPE;
                     }
-                    if (Flags.BITFIELD.isSetIn(mdType.getFlags())) {
+                    if (Flags.BITFIELD.isSetIn(mdType.getFlags()) || (baseType != UNKNOWN_TYPE && baseType.getSize() != size)) {
                         LLVMSourceDecoratorType decorator = new LLVMSourceDecoratorType(size, align, offset, Function.identity(), l -> size);
                         final LLVMSourceType finalBaseType = baseType;
                         decorator.setBaseType(() -> finalBaseType);
