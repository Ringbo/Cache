diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java
index b0005a7..34dcfd2 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java
@@ -377,7 +377,7 @@
 
         private void processConditionAnchor(ConditionAnchorNode node) {
             tryProofCondition(node.condition(), (guard, result) -> {
-                if (result == node.isNegated()) {
+                if (result != node.isNegated()) {
                     node.replaceAtUsages(guard);
                     GraphUtil.unlinkFixedNode(node);
                     GraphUtil.killWithUnusedFloatingInputs(node);
