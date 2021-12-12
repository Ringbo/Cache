diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java
index e8035e4..f9413f0 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/ConvertDeoptimizeToGuardPhase.java
@@ -103,7 +103,7 @@
             }
         }
 
-        new DeadCodeEliminationPhase(OPTIONAL).apply(graph);
+        new DeadCodeEliminationPhase(Optional).apply(graph);
     }
 
     private void visitDeoptBegin(BeginNode deoptBegin, DeoptimizationAction deoptAction, DeoptimizationReason deoptReason, StructuredGraph graph) {
