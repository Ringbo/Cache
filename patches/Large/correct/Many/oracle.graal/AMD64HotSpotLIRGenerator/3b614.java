diff --git a/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java b/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java
index f9e9aa4..37a62bb 100644
--- a/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java
+++ b/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java
@@ -527,7 +527,7 @@
         }
     }
 
-    public Value emitCompareAndSwap(Value address, Value expectedValue, Value newValue, Value trueValue, Value falseValue) {
+    public Variable emitCompareAndSwap(Value address, Value expectedValue, Value newValue, Value trueValue, Value falseValue) {
         LIRKind kind = newValue.getLIRKind();
         assert kind.equals(expectedValue.getLIRKind());
         Kind memKind = (Kind) kind.getPlatformKind();
