diff --git a/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java b/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java
index 97afffc..d180ae3 100644
--- a/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java
+++ b/graal/com.oracle.graal.hotspot.amd64/src/com/oracle/graal/hotspot/amd64/AMD64HotSpotLIRGenerator.java
@@ -409,7 +409,7 @@
     public Variable emitLoad(Kind kind, Value address, DeoptimizingNode access) {
         AMD64AddressValue loadAddress = asAddressValue(address);
         Variable result = newVariable(kind);
-        assert access != null || access instanceof HeapAccess;
+        assert access == null || access instanceof HeapAccess;
         if (runtime().config.useCompressedOops && isCompressCandidate(access)) {
             assert kind == Kind.Object;
             Variable scratch = newVariable(Kind.Long);
