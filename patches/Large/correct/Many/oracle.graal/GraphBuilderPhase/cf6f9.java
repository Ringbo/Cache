diff --git a/graal/com.oracle.max.graal.java/src/com/oracle/max/graal/java/GraphBuilderPhase.java b/graal/com.oracle.max.graal.java/src/com/oracle/max/graal/java/GraphBuilderPhase.java
index c742f5b..69656be 100644
--- a/graal/com.oracle.max.graal.java/src/com/oracle/max/graal/java/GraphBuilderPhase.java
+++ b/graal/com.oracle.max.graal.java/src/com/oracle/max/graal/java/GraphBuilderPhase.java
@@ -557,7 +557,7 @@
         if (probability < 0) {
             assert probability == -1 : "invalid probability";
             Debug.log("missing probability in %s at bci %d", method, bci());
-            takenProbability = 0.5;
+            probability = 0.5;
         }
 
         CompareNode condition = currentGraph.unique(new CompareNode(x, cond, y));
