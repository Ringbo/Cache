diff --git a/runners/google-cloud-dataflow-java/worker/src/test/java/org/apache/beam/runners/dataflow/worker/StreamingModeExecutionContextTest.java b/runners/google-cloud-dataflow-java/worker/src/test/java/org/apache/beam/runners/dataflow/worker/StreamingModeExecutionContextTest.java
index 7738f24..fb5c5c0 100644
--- a/runners/google-cloud-dataflow-java/worker/src/test/java/org/apache/beam/runners/dataflow/worker/StreamingModeExecutionContextTest.java
+++ b/runners/google-cloud-dataflow-java/worker/src/test/java/org/apache/beam/runners/dataflow/worker/StreamingModeExecutionContextTest.java
@@ -308,7 +308,11 @@
 
     StreamingModeExecutionState state =
         new StreamingModeExecutionState(
-            NameContextsForTests.nameContextForTest(), "testState", null, NoopProfileScope.NOOP);
+            NameContextsForTests.nameContextForTest(),
+            "testState",
+            null,
+            NoopProfileScope.NOOP,
+            null);
     ExecutorService executor = Executors.newFixedThreadPool(2);
     AtomicBoolean doneWriting = new AtomicBoolean(false);
 
@@ -347,7 +351,11 @@
     // reach the reading thread.
     StreamingModeExecutionState state =
         new StreamingModeExecutionState(
-            NameContextsForTests.nameContextForTest(), "testState", null, NoopProfileScope.NOOP);
+            NameContextsForTests.nameContextForTest(),
+            "testState",
+            null,
+            NoopProfileScope.NOOP,
+            null);
     ExecutionStateSampler sampler = ExecutionStateSampler.newForTest();
     try {
       sampler.start();
