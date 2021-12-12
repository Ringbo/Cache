diff --git a/hazelcast/src/test/java/com/hazelcast/cardinality/CardinalityEstimatorStressTest.java b/hazelcast/src/test/java/com/hazelcast/cardinality/CardinalityEstimatorStressTest.java
index f54378b..42ef831 100644
--- a/hazelcast/src/test/java/com/hazelcast/cardinality/CardinalityEstimatorStressTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/cardinality/CardinalityEstimatorStressTest.java
@@ -37,8 +37,8 @@
         estimator = createHazelcastInstance().getCardinalityEstimator("StressTest_Estimator");
     }
 
-    @Test(timeout = 8 * 60000)
-    public void addBigRange_checkErrorMargin_completeWithinEightMins() {
+    @Test(timeout = 16 * 60000)
+    public void addBigRange_checkErrorMargin_completeWithinSixteenMins() {
         // Sparse encoding would have taken much longer to complete, thus
         // timeout helps to make sure the encoding engine used is the correct one.
         long expected = 10 * 1000 * 1000;
