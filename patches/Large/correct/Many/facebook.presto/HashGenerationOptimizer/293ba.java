diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/HashGenerationOptimizer.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/HashGenerationOptimizer.java
index 7e7d25f..01cb07d 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/HashGenerationOptimizer.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/optimizations/HashGenerationOptimizer.java
@@ -617,7 +617,7 @@
 
             // return only hash symbols that are passed through the new node
             Map<HashComputation, Symbol> hashSymbols = new HashMap<>(source.getHashSymbols());
-            hashSymbols.keySet().retainAll(result.getOutputSymbols());
+            hashSymbols.values().retainAll(result.getOutputSymbols());
 
             return new PlanWithProperties(result, hashSymbols);
         }
