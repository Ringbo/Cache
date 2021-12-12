diff --git a/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java b/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java
index 4c896cf..0bdec8b 100644
--- a/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java
+++ b/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java
@@ -83,7 +83,7 @@
             if (AArch64LIRFlagsVersioned.useLSE(masm.target.arch)) {
                 Register expected = asRegister(expectedValue);
                 masm.mov(size, result, expected);
-                masm.cas(size, expected, newVal, address, true /* acquire */, true /* release */);
+                masm.cas(size, result, newVal, address, true /* acquire */, true /* release */);
                 AArch64Compare.gpCompare(masm, resultValue, expectedValue);
             } else {
                 // We could avoid using a scratch register here, by reusing resultValue for the
