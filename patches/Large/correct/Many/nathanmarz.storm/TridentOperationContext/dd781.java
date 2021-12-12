diff --git a/src/jvm/storm/trident/operation/TridentOperationContext.java b/src/jvm/storm/trident/operation/TridentOperationContext.java
index 75251a5..506347f 100644
--- a/src/jvm/storm/trident/operation/TridentOperationContext.java
+++ b/src/jvm/storm/trident/operation/TridentOperationContext.java
@@ -31,13 +31,13 @@
         return _topoContext.getThisTaskIndex();
     }
 
-    public IMetric registerMetric(String name, IMetric metric, int timeBucketSizeInSecs) {
+    public <T extends IMetric> T registerMetric(String name, T metric, int timeBucketSizeInSecs) {
         return _topoContext.registerMetric(name, metric, timeBucketSizeInSecs);
     }
-    public IMetric registerMetric(String name, IReducer reducer, int timeBucketSizeInSecs) {
+    public ReducedMetric registerMetric(String name, IReducer reducer, int timeBucketSizeInSecs) {
         return _topoContext.registerMetric(name, new ReducedMetric(reducer), timeBucketSizeInSecs);
     }
-    public IMetric registerMetric(String name, ICombiner combiner, int timeBucketSizeInSecs) {
+    public CombinedMetric registerMetric(String name, ICombiner combiner, int timeBucketSizeInSecs) {
         return _topoContext.registerMetric(name, new CombinedMetric(combiner), timeBucketSizeInSecs);
     }
 }
