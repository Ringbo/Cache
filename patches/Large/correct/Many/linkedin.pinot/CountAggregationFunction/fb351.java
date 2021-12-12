diff --git a/pinot-core/src/main/java/com/linkedin/pinot/core/query/aggregation/function/CountAggregationFunction.java b/pinot-core/src/main/java/com/linkedin/pinot/core/query/aggregation/function/CountAggregationFunction.java
index c003625..8da546a 100644
--- a/pinot-core/src/main/java/com/linkedin/pinot/core/query/aggregation/function/CountAggregationFunction.java
+++ b/pinot-core/src/main/java/com/linkedin/pinot/core/query/aggregation/function/CountAggregationFunction.java
@@ -37,7 +37,7 @@
  * This function will take a column and do sum on that.
  *
  */
-public class CountAggregationFunction implements AggregationFunction<MutableLongValue, MutableLongValue> {
+public class CountAggregationFunction implements AggregationFunction<Number, Number> {
   private static final Logger LOGGER = LoggerFactory.getLogger(CountAggregationFunction.class);
 
   public CountAggregationFunction() {
@@ -55,19 +55,19 @@
   }
 
   @Override
-  public MutableLongValue aggregate(MutableLongValue mergedResult, int docId, Block[] block) {
+  public Number aggregate(Number mergedResult, int docId, Block[] block) {
     if (mergedResult == null) {
       return new MutableLongValue(1L);
     } else {
-      mergedResult.addToValue(1L);
+      ((MutableLongValue) mergedResult).addToValue(1L);
       return mergedResult;
     }
   }
 
   @Override
-  public List<MutableLongValue> combine(List<MutableLongValue> aggregationResultList, CombineLevel combineLevel) {
+  public List<Number> combine(List<Number> aggregationResultList, CombineLevel combineLevel) {
     long combinedValue = 0;
-    for (MutableLongValue value : aggregationResultList) {
+    for (Number value : aggregationResultList) {
       combinedValue += value.longValue();
     }
     aggregationResultList.clear();
@@ -76,7 +76,7 @@
   }
 
   @Override
-  public MutableLongValue combineTwoValues(MutableLongValue aggregationResult0, MutableLongValue aggregationResult1) {
+  public Number combineTwoValues(Number aggregationResult0, Number aggregationResult1) {
     if (aggregationResult0 == null) {
       return aggregationResult1;
     }
@@ -87,16 +87,16 @@
   }
 
   @Override
-  public MutableLongValue reduce(List<MutableLongValue> combinedResultList) {
+  public Number reduce(List<Number> combinedResultList) {
     long reducedValue = 0;
-    for (MutableLongValue value : combinedResultList) {
+    for (Number value : combinedResultList) {
       reducedValue += value.longValue();
     }
     return new MutableLongValue(reducedValue);
   }
 
   @Override
-  public JSONObject render(MutableLongValue reduceResult) {
+  public JSONObject render(Number reduceResult) {
     try {
       if (reduceResult == null) {
         reduceResult = new MutableLongValue(0L);
