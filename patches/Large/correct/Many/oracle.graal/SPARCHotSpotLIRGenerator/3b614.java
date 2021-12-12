diff --git a/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java b/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java
index 64c64ad..ff4485e 100644
--- a/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java
+++ b/graal/com.oracle.graal.hotspot.sparc/src/com/oracle/graal/hotspot/sparc/SPARCHotSpotLIRGenerator.java
@@ -220,7 +220,7 @@
         append(new StoreOp((Kind) kind.getPlatformKind(), storeAddress, input, state));
     }
 
-    public Value emitCompareAndSwap(Value address, Value expectedValue, Value newValue, Value trueValue, Value falseValue) {
+    public Variable emitCompareAndSwap(Value address, Value expectedValue, Value newValue, Value trueValue, Value falseValue) {
         Variable newValueTemp = newVariable(newValue.getLIRKind());
         emitMove(newValueTemp, newValue);
 
