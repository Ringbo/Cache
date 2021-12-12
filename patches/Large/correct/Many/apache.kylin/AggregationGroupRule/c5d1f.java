diff --git a/core-cube/src/main/java/org/apache/kylin/cube/model/validation/rule/AggregationGroupRule.java b/core-cube/src/main/java/org/apache/kylin/cube/model/validation/rule/AggregationGroupRule.java
index 33fc390..2b0358d 100644
--- a/core-cube/src/main/java/org/apache/kylin/cube/model/validation/rule/AggregationGroupRule.java
+++ b/core-cube/src/main/java/org/apache/kylin/cube/model/validation/rule/AggregationGroupRule.java
@@ -55,7 +55,7 @@
             return;
         }
 
-        int index = 0;
+        int index = 1;
         for (AggregationGroup agg : cube.getAggregationGroups()) {
             if (agg.getIncludes() == null) {
                 context.addResult(ResultLevel.ERROR, "Aggregation group " + index + " 'includes' field not set");
