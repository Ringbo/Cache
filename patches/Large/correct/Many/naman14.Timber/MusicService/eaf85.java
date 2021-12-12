diff --git a/app/src/main/java/com/naman14/timber/MusicService.java b/app/src/main/java/com/naman14/timber/MusicService.java
index 6835d26..633425f 100644
--- a/app/src/main/java/com/naman14/timber/MusicService.java
+++ b/app/src/main/java/com/naman14/timber/MusicService.java
@@ -447,7 +447,7 @@
             MediaButtonIntentReceiver.completeWakefulIntent(intent);
         }
 
-        return START_STICKY;
+        return START_NOT_STICKY; //no sense to use START_STICKY with using startForeground
     }
 
     private void releaseServiceUiAndStop() {
