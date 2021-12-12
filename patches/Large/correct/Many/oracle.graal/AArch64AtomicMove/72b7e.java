diff --git a/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java b/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java
index a6316936..24e122f 100644
--- a/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java
+++ b/compiler/src/org.graalvm.compiler.lir.aarch64/src/org/graalvm/compiler/lir/aarch64/AArch64AtomicMove.java
@@ -115,11 +115,11 @@
 
         @Def protected AllocatableValue resultValue;
         @Alive protected AllocatableValue addressValue;
-        @Alive protected Value deltaValue;
+        @Alive protected AllocatableValue deltaValue;
         @Temp protected AllocatableValue scratchValue1;
         @Temp protected AllocatableValue scratchValue2;
 
-        public AtomicReadAndAddOp(AArch64Kind kind, AllocatableValue result, AllocatableValue address, Value delta, AllocatableValue scratch1, AllocatableValue scratch2) {
+        public AtomicReadAndAddOp(AArch64Kind kind, AllocatableValue result, AllocatableValue address, AllocatableValue delta, AllocatableValue scratch1, AllocatableValue scratch2) {
             super(TYPE);
             this.accessKind = kind;
             this.resultValue = result;
@@ -146,7 +146,7 @@
                 Label retry = new Label();
                 masm.bind(retry);
                 masm.ldaxr(size, result, address);
-                masm.add(size, scratch1, result, delta, ShiftType.LSL, 0);
+                masm.add(size, scratch1, result, delta);
                 masm.stlxr(size, scratch2, scratch1, address);
                 // if scratch2 == 0 then write successful, else retry
                 masm.cbnz(32, scratch2, retry);
