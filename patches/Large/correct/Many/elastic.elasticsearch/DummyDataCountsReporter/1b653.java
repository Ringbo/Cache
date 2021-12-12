diff --git a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/process/DummyDataCountsReporter.java b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/process/DummyDataCountsReporter.java
index 9be269f..28d91a3 100644
--- a/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/process/DummyDataCountsReporter.java
+++ b/elasticsearch/src/test/java/org/elasticsearch/xpack/ml/job/process/DummyDataCountsReporter.java
@@ -19,7 +19,7 @@
 
     int logStatusCallCount = 0;
 
-    public DummyDataCountsReporter() {
+    DummyDataCountsReporter() {
         super(mock(ThreadPool.class), Settings.EMPTY, "DummyJobId", new DataCounts("DummyJobId"),
                 mock(JobDataCountsPersister.class));
     }
