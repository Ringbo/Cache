diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index 224845c..e49241c 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -4937,7 +4937,7 @@
         if (newNetwork.getCurrentScore() != score) {
             Slog.wtf(TAG, String.format(
                     "BUG: %s changed score during rematch: %d -> %d",
-                    score, newNetwork.getCurrentScore()));
+                   newNetwork.name(), score, newNetwork.getCurrentScore()));
         }
 
         // Second pass: process all listens.
