diff --git a/services/core/java/com/android/server/ConnectivityService.java b/services/core/java/com/android/server/ConnectivityService.java
index a2ba7af..a2e74b6 100644
--- a/services/core/java/com/android/server/ConnectivityService.java
+++ b/services/core/java/com/android/server/ConnectivityService.java
@@ -4949,7 +4949,7 @@
         if (!newNetwork.networkCapabilities.equalRequestableCapabilities(nc)) {
             Slog.wtf(TAG, String.format(
                     "BUG: %s changed requestable capabilities during rematch: %s -> %s",
-                    nc, newNetwork.networkCapabilities));
+                    newNetwork.name(), nc, newNetwork.networkCapabilities));
         }
         if (newNetwork.getCurrentScore() != score) {
             Slog.wtf(TAG, String.format(
