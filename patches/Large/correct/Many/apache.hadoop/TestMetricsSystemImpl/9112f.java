diff --git a/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/metrics2/impl/TestMetricsSystemImpl.java b/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/metrics2/impl/TestMetricsSystemImpl.java
index d59e80b..4c2ebc8 100644
--- a/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/metrics2/impl/TestMetricsSystemImpl.java
+++ b/hadoop-common-project/hadoop-common/src/test/java/org/apache/hadoop/metrics2/impl/TestMetricsSystemImpl.java
@@ -190,7 +190,7 @@
       threads[i] = new Thread(new Runnable() {
         private boolean safeAwait(int mySource, CyclicBarrier barrier) {
           try {
-            barrier1.await(2, TimeUnit.SECONDS);
+            barrier.await(2, TimeUnit.SECONDS);
           } catch (InterruptedException e) {
             results[mySource] = "Interrupted";
             return false;
