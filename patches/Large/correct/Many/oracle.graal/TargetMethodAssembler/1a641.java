diff --git a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/asm/TargetMethodAssembler.java b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/asm/TargetMethodAssembler.java
index 2d11df1..31afb2c 100644
--- a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/asm/TargetMethodAssembler.java
+++ b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/asm/TargetMethodAssembler.java
@@ -163,14 +163,14 @@
         CiDebugInfo debugInfo = info != null ? info.debugInfo() : null;
         assert lastSafepointPos < posAfter;
         lastSafepointPos = posAfter;
-        targetMethod.recordCall(posBefore, target, debugInfo, true);
+        targetMethod.recordCall(posBefore, posAfter - posBefore, target, debugInfo, true);
     }
 
     public void recordIndirectCall(int posBefore, int posAfter, Object target, LIRDebugInfo info) {
         CiDebugInfo debugInfo = info != null ? info.debugInfo() : null;
         assert lastSafepointPos < posAfter;
         lastSafepointPos = posAfter;
-        targetMethod.recordCall(posBefore, target, debugInfo, false);
+        targetMethod.recordCall(posBefore, posAfter - posBefore, target, debugInfo, false);
     }
 
     public void recordSafepoint(int pos, LIRDebugInfo info) {
