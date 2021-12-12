diff --git a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/alloc/lsra/ssa/SSALinearScan.java b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/alloc/lsra/ssa/SSALinearScan.java
index 3b10d78..2013963 100644
--- a/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/alloc/lsra/ssa/SSALinearScan.java
+++ b/graal/com.oracle.graal.lir/src/com/oracle/graal/lir/alloc/lsra/ssa/SSALinearScan.java
@@ -58,7 +58,7 @@
 
     @Override
     protected LinearScanResolveDataFlowPhase createResolveDataFlowPhase() {
-        return new SSALinarScanResolveDataFlowPhase(this);
+        return new SSALinearScanResolveDataFlowPhase(this);
     }
 
     @Override
