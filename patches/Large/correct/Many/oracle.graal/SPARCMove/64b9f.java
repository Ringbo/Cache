diff --git a/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCMove.java b/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCMove.java
index afa635a..91c7523 100644
--- a/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCMove.java
+++ b/graal/com.oracle.graal.lir.sparc/src/com/oracle/graal/lir/sparc/SPARCMove.java
@@ -635,13 +635,13 @@
                     JavaConstant constant) {
         if (constant.isDefaultForKind() || constant.isNull()) {
             SPARCAddress resultAddress = (SPARCAddress) crb.asAddress(result);
-            emitStore(g0.asValue(LIRKind.combine(input)), resultAddress, input.getPlatformKind(), delaySlotLir, null, crb, masm);
+            emitStore(g0.asValue(LIRKind.combine(input)), resultAddress, result.getPlatformKind(), delaySlotLir, null, crb, masm);
         } else {
             try (ScratchRegister sc = masm.getScratchRegister()) {
                 Value scratchRegisterValue = sc.getRegister().asValue(LIRKind.combine(constant));
                 const2reg(crb, masm, scratchRegisterValue, constantTableBase, constant, SPARCDelayedControlTransfer.DUMMY);
                 SPARCAddress resultAddress = (SPARCAddress) crb.asAddress(result);
-                emitStore(scratchRegisterValue, resultAddress, input.getPlatformKind(), delaySlotLir, null, crb, masm);
+                emitStore(scratchRegisterValue, resultAddress, result.getPlatformKind(), delaySlotLir, null, crb, masm);
             }
         }
     }
