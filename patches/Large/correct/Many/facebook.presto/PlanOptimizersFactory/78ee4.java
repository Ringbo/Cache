diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/PlanOptimizersFactory.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/PlanOptimizersFactory.java
index c74cb77..6d1467a 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/PlanOptimizersFactory.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/PlanOptimizersFactory.java
@@ -63,8 +63,8 @@
                 new MergeProjections(),
                 new SimplifyExpressions(metadata), // Re-run the SimplifyExpressions to simplify any recomposed expressions from other optimizations
                 new UnaliasSymbolReferences(), // Run again because predicate pushdown might add more projections
-                new PruneRedundantProjections(), // Run again because predicate pushdown might add more projections
-                new PruneUnreferencedOutputs()); // Make sure to run this last to help clean the plan for logging/execution and not remove info that other optimizers might need at an earlier point
+                new PruneUnreferencedOutputs(), // Make sure to run this at the end to help clean the plan for logging/execution and not remove info that other optimizers might need at an earlier point
+                new PruneRedundantProjections()); // This MUST run after PruneUnreferencedOutputs as it may introduce new redundant projections
         // TODO: consider adding a formal final plan sanitization optimizer that prepares the plan for transmission/execution/logging
         // TODO: figure out how to improve the set flattening optimizer so that it can run at any point
 
