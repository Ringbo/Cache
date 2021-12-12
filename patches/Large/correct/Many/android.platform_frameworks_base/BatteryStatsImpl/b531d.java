diff --git a/core/java/com/android/internal/os/BatteryStatsImpl.java b/core/java/com/android/internal/os/BatteryStatsImpl.java
index c484121..8de9c09 100644
--- a/core/java/com/android/internal/os/BatteryStatsImpl.java
+++ b/core/java/com/android/internal/os/BatteryStatsImpl.java
@@ -1953,7 +1953,7 @@
          */
         @Override
         public LongSamplingCounter getIdleTimeCounter() {
-            return mRxTimeMillis;
+            return mIdleTimeMillis;
         }
 
         /**
