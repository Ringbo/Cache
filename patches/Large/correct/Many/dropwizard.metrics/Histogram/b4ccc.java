diff --git a/metrics-core/src/main/java/com/yammer/metrics/core/Histogram.java b/metrics-core/src/main/java/com/yammer/metrics/core/Histogram.java
index a0734dc..e776e25 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/core/Histogram.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/core/Histogram.java
@@ -244,7 +244,7 @@
     private void setMax(long potentialMax) {
         boolean done = false;
         while (!done) {
-            long currentMax = _max.get();
+            final long currentMax = _max.get();
             done = currentMax >= potentialMax || _max.compareAndSet(currentMax, potentialMax);
         }
     }
@@ -252,7 +252,7 @@
     private void setMin(long potentialMin) {
         boolean done = false;
         while (!done) {
-            long currentMin = _min.get();
+            final long currentMin = _min.get();
             done = currentMin <= potentialMin || _min.compareAndSet(currentMin, potentialMin);
         }
     }
