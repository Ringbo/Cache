diff --git a/src/jvm/backtype/storm/task/TopologyContext.java b/src/jvm/backtype/storm/task/TopologyContext.java
index 872f8a9..b74e691 100644
--- a/src/jvm/backtype/storm/task/TopologyContext.java
+++ b/src/jvm/backtype/storm/task/TopologyContext.java
@@ -208,7 +208,7 @@
      * You must call this during IBolt::prepare or ISpout::open.
      * @return The IMetric argument unchanged.
      */
-    public IMetric registerMetric(String name, IMetric metric, int timeBucketSizeInSecs) {
+    public <T extends IMetric> T registerMetric(String name, T metric, int timeBucketSizeInSecs) {
         if((Boolean)_openOrPrepareWasCalled.deref() == true) {
             throw new RuntimeException("TopologyContext.registerMetric can only be called from within overridden " + 
                                        "IBolt::prepare() or ISpout::open() method.");
@@ -237,13 +237,13 @@
     /*
      * Convinience method for registering ReducedMetric.
      */
-    public IMetric registerMetric(String name, IReducer reducer, int timeBucketSizeInSecs) {
+    public ReducedMetric registerMetric(String name, IReducer reducer, int timeBucketSizeInSecs) {
         return registerMetric(name, new ReducedMetric(reducer), timeBucketSizeInSecs);
     }
     /*
      * Convinience method for registering CombinedMetric.
      */
-    public IMetric registerMetric(String name, ICombiner combiner, int timeBucketSizeInSecs) {
+    public CombinedMetric registerMetric(String name, ICombiner combiner, int timeBucketSizeInSecs) {
         return registerMetric(name, new CombinedMetric(combiner), timeBucketSizeInSecs);
     }
 }
\ No newline at end of file
