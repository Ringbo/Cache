diff --git a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/gen/LIRGeneratorTool.java b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/gen/LIRGeneratorTool.java
index 79c9bdd..d0620bc 100644
--- a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/gen/LIRGeneratorTool.java
+++ b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/gen/LIRGeneratorTool.java
@@ -54,13 +54,13 @@
 
     Value emitLoadConstant(LIRKind kind, Constant constant);
 
-    Value emitLoad(LIRKind kind, Value address, LIRFrameState state);
+    Variable emitLoad(LIRKind kind, Value address, LIRFrameState state);
 
     void emitStore(LIRKind kind, Value address, Value input, LIRFrameState state);
 
     void emitNullCheck(Value address, LIRFrameState state);
 
-    Value emitCompareAndSwap(Value address, Value expectedValue, Value newValue, Value trueValue, Value falseValue);
+    Variable emitCompareAndSwap(Value address, Value expectedValue, Value newValue, Value trueValue, Value falseValue);
 
     /**
      * Emit an atomic read-and-add instruction.
@@ -112,7 +112,7 @@
 
     Value emitAddress(Value base, long displacement, Value index, int scale);
 
-    Value emitAddress(StackSlotValue slot);
+    Variable emitAddress(StackSlotValue slot);
 
     void emitMembar(int barriers);
 
@@ -179,15 +179,15 @@
 
     CallingConvention getCallingConvention();
 
-    Value emitBitCount(Value operand);
+    Variable emitBitCount(Value operand);
 
-    Value emitBitScanForward(Value operand);
+    Variable emitBitScanForward(Value operand);
 
-    Value emitBitScanReverse(Value operand);
+    Variable emitBitScanReverse(Value operand);
 
-    Value emitByteSwap(Value operand);
+    Variable emitByteSwap(Value operand);
 
-    Value emitArrayEquals(Kind kind, Value array1, Value array2, Value length);
+    Variable emitArrayEquals(Kind kind, Value array1, Value array2, Value length);
 
     void emitBlackhole(Value operand);
 
