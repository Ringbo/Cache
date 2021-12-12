diff --git a/core/src/main/java/org/apache/calcite/rel/metadata/RelMdPredicates.java b/core/src/main/java/org/apache/calcite/rel/metadata/RelMdPredicates.java
index d256e9b..4572296 100644
--- a/core/src/main/java/org/apache/calcite/rel/metadata/RelMdPredicates.java
+++ b/core/src/main/java/org/apache/calcite/rel/metadata/RelMdPredicates.java
@@ -352,7 +352,7 @@
 
     List<RexNode> preds = new ArrayList<>(finalPreds.values());
     RexNode disjPred = RexUtil.composeDisjunction(rB, finalResidualPreds, false);
-    if (!disjPred.isAlwaysFalse()) {
+    if (!disjPred.isAlwaysTrue()) {
       preds.add(disjPred);
     }
     return RelOptPredicateList.of(preds);
