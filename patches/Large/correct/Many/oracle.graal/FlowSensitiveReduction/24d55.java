diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/cfs/FlowSensitiveReduction.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/cfs/FlowSensitiveReduction.java
index d80d885..3390736 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/cfs/FlowSensitiveReduction.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/cfs/FlowSensitiveReduction.java
@@ -151,7 +151,7 @@
             for (PostponedDeopt postponed : postponedDeopts) {
                 postponed.doRewrite(falseConstant);
             }
-            new DeadCodeEliminationPhase(OPTIONAL).apply(graph);
+            new DeadCodeEliminationPhase(Optional).apply(graph);
         }
         for (MethodCallTargetNode mcn : graph.getNodes().filter(MethodCallTargetNode.class)) {
             if (mcn.isAlive() && FlowUtil.lacksUsages(mcn)) {
