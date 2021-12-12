diff --git a/compiler/src/org.graalvm.compiler.core.amd64/src/org/graalvm/compiler/core/amd64/AMD64ArithmeticLIRGenerator.java b/compiler/src/org.graalvm.compiler.core.amd64/src/org/graalvm/compiler/core/amd64/AMD64ArithmeticLIRGenerator.java
index 0971cf5..07a55d9 100644
--- a/compiler/src/org.graalvm.compiler.core.amd64/src/org/graalvm/compiler/core/amd64/AMD64ArithmeticLIRGenerator.java
+++ b/compiler/src/org.graalvm.compiler.core.amd64/src/org/graalvm/compiler/core/amd64/AMD64ArithmeticLIRGenerator.java
@@ -451,7 +451,7 @@
     protected Value emitZeroExtendMemory(AMD64Kind memoryKind, int resultBits, AMD64AddressValue address, LIRFrameState state) {
         // Issue a zero extending load of the proper bit size and set the result to
         // the proper kind.
-        Variable result = getLIRGen().newVariable(LIRKind.value(resultBits == 32 ? AMD64Kind.DWORD : AMD64Kind.QWORD));
+        Variable result = getLIRGen().newVariable(LIRKind.value(resultBits <= 32 ? AMD64Kind.DWORD : AMD64Kind.QWORD));
         switch (memoryKind) {
             case BYTE:
                 getLIRGen().append(new AMD64Unary.MemoryOp(MOVZXB, DWORD, result, address, state));
