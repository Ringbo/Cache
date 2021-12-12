diff --git a/services/java/com/android/server/VibratorService.java b/services/java/com/android/server/VibratorService.java
index b609867..72fde11 100755
--- a/services/java/com/android/server/VibratorService.java
+++ b/services/java/com/android/server/VibratorService.java
@@ -441,7 +441,7 @@
 
         private void delay(long duration) {
             if (duration > 0) {
-                long bedtime = SystemClock.uptimeMillis();
+                long bedtime = duration + SystemClock.uptimeMillis();
                 do {
                     try {
                         this.wait(duration);
@@ -451,8 +451,7 @@
                     if (mDone) {
                         break;
                     }
-                    duration = duration
-                            - SystemClock.uptimeMillis() - bedtime;
+                    duration = bedtime - SystemClock.uptimeMillis();
                 } while (duration > 0);
             }
         }
