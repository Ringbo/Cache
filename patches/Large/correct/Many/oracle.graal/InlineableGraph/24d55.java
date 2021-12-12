diff --git a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/elem/InlineableGraph.java b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/elem/InlineableGraph.java
index ae17294..b6554fb 100644
--- a/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/elem/InlineableGraph.java
+++ b/graal/com.oracle.graal.phases.common/src/com/oracle/graal/phases/common/inlining/info/elem/InlineableGraph.java
@@ -247,7 +247,7 @@
             }
             assert newGraph.start().next() != null : "graph needs to be populated by the GraphBuilderSuite";
 
-            new DeadCodeEliminationPhase(OPTIONAL).apply(newGraph);
+            new DeadCodeEliminationPhase(Optional).apply(newGraph);
 
             if (OptCanonicalizer.getValue()) {
                 canonicalizer.apply(newGraph, context);
