diff --git a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/EscapeAnalysisTest.java b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/EscapeAnalysisTest.java
index 9fe78e3..e2297b8 100644
--- a/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/EscapeAnalysisTest.java
+++ b/graal/com.oracle.graal.compiler.test/src/com/oracle/graal/compiler/test/ea/EscapeAnalysisTest.java
@@ -198,7 +198,7 @@
             Assumptions assumptions = new Assumptions(false);
             new InliningPhase(null, runtime(), null, assumptions, null, getDefaultPhasePlan(), OptimisticOptimizations.ALL).apply(graph);
             new DeadCodeEliminationPhase().apply(graph);
-            new PartialEscapeAnalysisPhase(null, runtime(), null, assumptions, iterativeEscapeAnalysis).apply(graph);
+            new PartialEscapeAnalysisPhase(null, runtime(), assumptions, iterativeEscapeAnalysis).apply(graph);
             Assert.assertEquals(1, graph.getNodes(ReturnNode.class).count());
             ReturnNode returnNode = graph.getNodes(ReturnNode.class).first();
             if (expectedConstantResult != null) {
