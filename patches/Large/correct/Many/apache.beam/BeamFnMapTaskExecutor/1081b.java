diff --git a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/fn/control/BeamFnMapTaskExecutor.java b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/fn/control/BeamFnMapTaskExecutor.java
index 7a2b1fd..bff2d21 100644
--- a/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/fn/control/BeamFnMapTaskExecutor.java
+++ b/runners/google-cloud-dataflow-java/worker/src/main/java/org/apache/beam/runners/dataflow/worker/fn/control/BeamFnMapTaskExecutor.java
@@ -619,7 +619,7 @@
         T[] newYs = (T[]) new Object[ys.length];
         newXs[0] = xs[0];
         newYs[0] = ys[0];
-        double dx = (xs[numPoints - 1] - xs[0]) / (numPoints / 2);
+        double dx = (xs[numPoints - 1] - xs[0]) / (numPoints / 2.0);
         for (int i = 1; i < numPoints / 2; i++) {
           double x = xs[0] + i * dx;
           newXs[i] = x;
