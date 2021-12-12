diff --git a/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/IterativeInliningPhase.java b/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/IterativeInliningPhase.java
index aefbbfa..5159c13 100644
--- a/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/IterativeInliningPhase.java
+++ b/graal/com.oracle.graal.virtual/src/com/oracle/graal/virtual/phases/ea/IterativeInliningPhase.java
@@ -71,7 +71,7 @@
                 inlining.apply(graph, context);
                 progress |= inlining.getInliningCount() > 0;
 
-                new DeadCodeEliminationPhase(OPTIONAL).apply(graph);
+                new DeadCodeEliminationPhase(Optional).apply(graph);
 
                 boolean reduceOrEliminate = FlowSensitiveReduction.getValue() || ConditionalElimination.getValue();
                 if (reduceOrEliminate && OptCanonicalizer.getValue()) {
