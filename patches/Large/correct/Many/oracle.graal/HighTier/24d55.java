diff --git a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/HighTier.java b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/HighTier.java
index 03bc19a..e9f79f0 100644
--- a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/HighTier.java
+++ b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/phases/HighTier.java
@@ -58,7 +58,7 @@
                 appendPhase(new IterativeInliningPhase(canonicalizer));
             } else {
                 appendPhase(new InliningPhase(canonicalizer));
-                appendPhase(new DeadCodeEliminationPhase(OPTIONAL));
+                appendPhase(new DeadCodeEliminationPhase(Optional));
 
                 boolean reduceOrEliminate = FlowSensitiveReduction.getValue() || ConditionalElimination.getValue();
                 if (reduceOrEliminate && OptCanonicalizer.getValue()) {
