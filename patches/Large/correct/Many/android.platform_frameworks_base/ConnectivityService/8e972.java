diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 88bc54d..3cd740b 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -5009,7 +5009,7 @@
         if (newNetwork.getCurrentScore() != score) {
             Slog.wtf(TAG, String.format(
                     "BUG: %s changed score during rematch: %d -> %d",
-                    score, newNetwork.getCurrentScore()));
+                   newNetwork.name(), score, newNetwork.getCurrentScore()));
         }
 
         // Second pass: process all listens.
