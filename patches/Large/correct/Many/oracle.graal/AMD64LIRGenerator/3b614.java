diff --git a/graal/com.oracle.graal.compiler.amd64/src/com/oracle/graal/compiler/amd64/AMD64LIRGenerator.java b/graal/com.oracle.graal.compiler.amd64/src/com/oracle/graal/compiler/amd64/AMD64LIRGenerator.java
index 3b45fb3..8a29228 100644
--- a/graal/com.oracle.graal.compiler.amd64/src/com/oracle/graal/compiler/amd64/AMD64LIRGenerator.java
+++ b/graal/com.oracle.graal.compiler.amd64/src/com/oracle/graal/compiler/amd64/AMD64LIRGenerator.java
@@ -998,7 +998,7 @@
     }
 
     @Override
-    public Value emitBitCount(Value value) {
+    public Variable emitBitCount(Value value) {
         Variable result = newVariable(LIRKind.derive(value).changeType(Kind.Int));
         if (value.getKind().getStackKind() == Kind.Int) {
             append(new AMD64BitManipulationOp(IPOPCNT, result, asAllocatable(value)));
@@ -1009,14 +1009,14 @@
     }
 
     @Override
-    public Value emitBitScanForward(Value value) {
+    public Variable emitBitScanForward(Value value) {
         Variable result = newVariable(LIRKind.derive(value).changeType(Kind.Int));
         append(new AMD64BitManipulationOp(BSF, result, asAllocatable(value)));
         return result;
     }
 
     @Override
-    public Value emitBitScanReverse(Value value) {
+    public Variable emitBitScanReverse(Value value) {
         Variable result = newVariable(LIRKind.derive(value).changeType(Kind.Int));
         if (value.getKind().getStackKind() == Kind.Int) {
             append(new AMD64BitManipulationOp(IBSR, result, asAllocatable(value)));
@@ -1098,14 +1098,14 @@
     }
 
     @Override
-    public Value emitByteSwap(Value input) {
+    public Variable emitByteSwap(Value input) {
         Variable result = newVariable(LIRKind.derive(input));
         append(new AMD64ByteSwapOp(result, input));
         return result;
     }
 
     @Override
-    public Value emitArrayEquals(Kind kind, Value array1, Value array2, Value length) {
+    public Variable emitArrayEquals(Kind kind, Value array1, Value array2, Value length) {
         Variable result = newVariable(LIRKind.value(Kind.Int));
         append(new AMD64ArrayEqualsOp(this, kind, result, array1, array2, asAllocatable(length)));
         return result;
