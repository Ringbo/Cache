diff --git a/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/MergeLimitWithDistinct.java b/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/MergeLimitWithDistinct.java
index 3030658..40f39e4 100644
--- a/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/MergeLimitWithDistinct.java
+++ b/presto-main/src/main/java/com/facebook/presto/sql/planner/iterative/rule/MergeLimitWithDistinct.java
@@ -45,7 +45,7 @@
 
         AggregationNode child = (AggregationNode) input;
 
-        if (isDistinct(child)) {
+        if (!isDistinct(child)) {
             return Optional.empty();
         }
 
@@ -64,8 +64,8 @@
      */
     private boolean isDistinct(AggregationNode node)
     {
-        return !node.getAggregations().isEmpty() ||
-                node.getOutputSymbols().size() != node.getGroupingKeys().size() ||
-                !node.getOutputSymbols().containsAll(node.getGroupingKeys());
+        return node.getAggregations().isEmpty() &&
+                node.getOutputSymbols().size() == node.getGroupingKeys().size() &&
+                node.getOutputSymbols().containsAll(node.getGroupingKeys());
     }
 }
