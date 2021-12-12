diff --git a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/GraalCompiler.java b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/GraalCompiler.java
index 5415a78..729b2fe 100644
--- a/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/GraalCompiler.java
+++ b/graal/com.oracle.graal.compiler/src/com/oracle/graal/compiler/GraalCompiler.java
@@ -168,7 +168,7 @@
             HighTierContext highTierContext = new HighTierContext(providers, assumptions, cache, graphBuilderSuite, optimisticOpts);
             if (graph.start().next() == null) {
                 graphBuilderSuite.apply(graph, highTierContext);
-                new DeadCodeEliminationPhase(OPTIONAL).apply(graph);
+                new DeadCodeEliminationPhase(Optional).apply(graph);
             } else {
                 Debug.dump(graph, "initial state");
             }
