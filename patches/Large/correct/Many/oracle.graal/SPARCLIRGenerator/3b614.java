diff --git a/graal/com.oracle.graal.compiler.sparc/src/com/oracle/graal/compiler/sparc/SPARCLIRGenerator.java b/graal/com.oracle.graal.compiler.sparc/src/com/oracle/graal/compiler/sparc/SPARCLIRGenerator.java
index 1f1ce8c..1508975 100644
--- a/graal/com.oracle.graal.compiler.sparc/src/com/oracle/graal/compiler/sparc/SPARCLIRGenerator.java
+++ b/graal/com.oracle.graal.compiler.sparc/src/com/oracle/graal/compiler/sparc/SPARCLIRGenerator.java
@@ -189,7 +189,7 @@
     }
 
     @Override
-    public Value emitAddress(StackSlotValue address) {
+    public Variable emitAddress(StackSlotValue address) {
         Variable result = newVariable(LIRKind.value(target().wordKind));
         append(new StackLoadAddressOp(result, address));
         return result;
@@ -422,7 +422,7 @@
     }
 
     @Override
-    public Value emitBitCount(Value operand) {
+    public Variable emitBitCount(Value operand) {
         Variable result = newVariable(LIRKind.derive(operand).changeType(Kind.Int));
         if (operand.getKind().getStackKind() == Kind.Int) {
             append(new SPARCBitManipulationOp(IPOPCNT, result, asAllocatable(operand), this));
@@ -433,14 +433,14 @@
     }
 
     @Override
-    public Value emitBitScanForward(Value operand) {
+    public Variable emitBitScanForward(Value operand) {
         Variable result = newVariable(LIRKind.derive(operand).changeType(Kind.Int));
         append(new SPARCBitManipulationOp(BSF, result, asAllocatable(operand), this));
         return result;
     }
 
     @Override
-    public Value emitBitScanReverse(Value operand) {
+    public Variable emitBitScanReverse(Value operand) {
         Variable result = newVariable(LIRKind.derive(operand).changeType(Kind.Int));
         if (operand.getKind().getStackKind() == Kind.Int) {
             append(new SPARCBitManipulationOp(IBSR, result, asAllocatable(operand), this));
@@ -493,14 +493,14 @@
     }
 
     @Override
-    public Value emitByteSwap(Value input) {
+    public Variable emitByteSwap(Value input) {
         Variable result = newVariable(LIRKind.derive(input));
         append(new SPARCByteSwapOp(this, result, input));
         return result;
     }
 
     @Override
-    public Value emitArrayEquals(Kind kind, Value array1, Value array2, Value length) {
+    public Variable emitArrayEquals(Kind kind, Value array1, Value array2, Value length) {
         Variable result = newVariable(LIRKind.value(Kind.Int));
         append(new SPARCArrayEqualsOp(this, kind, result, load(array1), load(array2), asAllocatable(length)));
         return result;
