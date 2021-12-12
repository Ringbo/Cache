diff --git a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java
index 1893b78..9eb2b01 100644
--- a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java
+++ b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/PartialEscapeAnalysisTest.java
@@ -154,7 +154,7 @@
             new InliningPhase(null, runtime(), null, assumptions, null, getDefaultPhasePlan(), OptimisticOptimizations.ALL).apply(graph);
             new DeadCodeEliminationPhase().apply(graph);
             new CanonicalizerPhase(null, runtime(), assumptions).apply(graph);
-            new PartialEscapeAnalysisPhase(null, runtime(), null, assumptions, false).apply(graph);
+            new PartialEscapeAnalysisPhase(null, runtime(), assumptions, false).apply(graph);
 
             new CullFrameStatesPhase().apply(graph);
             new DeadCodeEliminationPhase().apply(graph);
