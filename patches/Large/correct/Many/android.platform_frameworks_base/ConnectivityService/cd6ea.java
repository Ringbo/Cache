diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 98389a6..93b6ec7 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -4941,7 +4941,7 @@
         if (newNetwork.getCurrentScore() != score) {
             Slog.wtf(TAG, String.format(
                     "BUG: %s changed score during rematch: %d -> %d",
-                    score, newNetwork.getCurrentScore()));
+                   newNetwork.name(), score, newNetwork.getCurrentScore()));
         }
 
         // Second pass: process all listens.
