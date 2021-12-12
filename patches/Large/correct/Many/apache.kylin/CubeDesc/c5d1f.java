diff --git a/core-cube/src/main/java/org/apache/kylin/cube/model/CubeDesc.java b/core-cube/src/main/java/org/apache/kylin/cube/model/CubeDesc.java
index 79116a8..87a75da 100644
--- a/core-cube/src/main/java/org/apache/kylin/cube/model/CubeDesc.java
+++ b/core-cube/src/main/java/org/apache/kylin/cube/model/CubeDesc.java
@@ -701,7 +701,7 @@
     }
 
     public void validateAggregationGroupsCombination() {
-        int index = 0;
+        int index = 1;
 
         for (AggregationGroup agg : getAggregationGroups()) {
             try {
@@ -726,7 +726,7 @@
     }
 
     public void validateAggregationGroups() {
-        int index = 0;
+        int index = 1;
 
         for (AggregationGroup agg : getAggregationGroups()) {
             if (agg.getIncludes() == null) {
