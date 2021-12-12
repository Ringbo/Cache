diff --git a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/IR.java b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/IR.java
index 7c5c9b3..5371743 100644
--- a/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/IR.java
+++ b/graal/com.oracle.max.graal.compiler/src/com/oracle/max/graal/compiler/graph/IR.java
@@ -84,7 +84,7 @@
 
         if (GraalOptions.OptCanonicalizer) {
             new CanonicalizerPhase().apply(graph);
-            verifyAndPrint("After Canonicalization");
+            printGraph("After Canonicalization", graph);
         }
 
         new SplitCriticalEdgesPhase().apply(graph);
