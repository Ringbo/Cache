diff --git a/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java b/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java
index 2b36224..337aa43 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java
@@ -51,14 +51,14 @@
 
     @Override
     public void clear() {
-	lockForRegularUsage();
+        lockForRescale();
         try {
            values.clear();
            count.set(0);
            this.startTime = tick();
            nextScaleTime.set(System.nanoTime() + RESCALE_THRESHOLD);
         } finally {
-            unlockForRegularUsage();
+            lockForRescale();
 	}
     }
 
