diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java
index d0973c7..4375e91 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java
@@ -201,7 +201,7 @@
         FixedNode next = deoptPred.next();
 
         if (!(next instanceof DeoptimizeNode)) {
-            DeoptimizeNode newDeoptNode = graph.add(new DeoptimizeNode(deoptAction, deoptReason));
+            DeoptimizeNode newDeoptNode = graph.add(new DeoptimizeNode(deoptAction, deoptReason, speculation));
             deoptPred.setNext(newDeoptNode);
             assert deoptPred == newDeoptNode.predecessor();
             GraphUtil.killCFG(next);
