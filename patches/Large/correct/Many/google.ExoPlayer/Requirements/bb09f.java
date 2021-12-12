diff --git a/library/core/src/main/java/com/google/android/exoplayer2/scheduler/Requirements.java b/library/core/src/main/java/com/google/android/exoplayer2/scheduler/Requirements.java
index 4d6dbd8..5acd31e 100644
--- a/library/core/src/main/java/com/google/android/exoplayer2/scheduler/Requirements.java
+++ b/library/core/src/main/java/com/google/android/exoplayer2/scheduler/Requirements.java
@@ -187,7 +187,7 @@
     }
     PowerManager powerManager = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
     return Util.SDK_INT >= 23
-        ? !powerManager.isDeviceIdleMode()
+        ? powerManager.isDeviceIdleMode()
         : Util.SDK_INT >= 20 ? !powerManager.isInteractive() : !powerManager.isScreenOn();
   }
 
