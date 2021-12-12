diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java
index 077c159..4acc236 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/DominatorConditionalEliminationPhase.java
@@ -472,7 +472,7 @@
                 if (result != node.isNegated()) {
                     node.replaceAndDelete(guard);
                 } else {
-                    DeoptimizeNode deopt = node.graph().add(new DeoptimizeNode(node.action(), node.reason()));
+                    DeoptimizeNode deopt = node.graph().add(new DeoptimizeNode(node.action(), node.reason(), node.getSpeculation()));
                     AbstractBeginNode beginNode = (AbstractBeginNode) node.getAnchor();
                     FixedNode next = beginNode.next();
                     beginNode.setNext(deopt);
