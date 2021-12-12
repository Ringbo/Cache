diff --git a/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java b/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java
index 8d38ad4..98ffe2f 100644
--- a/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java
+++ b/metrics-core/src/main/java/com/yammer/metrics/stats/ExponentiallyDecayingSample.java
@@ -55,7 +55,7 @@
             this.startTime = tick();
             nextScaleTime.set(System.nanoTime() + RESCALE_THRESHOLD);
         } finally {
-            lockForRescale();
+            unlockForRescale();
         }
     }
 
