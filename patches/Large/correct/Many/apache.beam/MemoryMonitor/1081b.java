diff --git a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/MemoryMonitor.java b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/MemoryMonitor.java
index bda6b75..85d4012 100644
--- a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/MemoryMonitor.java
+++ b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/util/MemoryMonitor.java
@@ -394,7 +394,7 @@
     // Compare the amount of time spent in GC thrashing to the given threshold;
     // if config.getSleepTimeMillis() is equal to 0 (should happen in tests only),
     // then we compare percentage-per-period to 100%
-    double gcPercentage = (inGC - timeInGC) * 100 / (now - lastTimeWokeUp);
+    double gcPercentage = (inGC - timeInGC) * 100.0 / (now - lastTimeWokeUp);
 
     lastMeasuredGCPercentage.set(gcPercentage);
     maxGCPercentage.set(Math.max(maxGCPercentage.get(), gcPercentage));
