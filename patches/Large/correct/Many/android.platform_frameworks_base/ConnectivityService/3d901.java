diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 2435c27..8ccedc0 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -5065,7 +5065,7 @@
         if (newNetwork.getCurrentScore() != score) {
             Slog.wtf(TAG, String.format(
                     "BUG: %s changed score during rematch: %d -> %d",
-                    score, newNetwork.getCurrentScore()));
+                   newNetwork.name(), score, newNetwork.getCurrentScore()));
         }
 
         // Second pass: process all listens.
