diff --git a/services/core/java/com/android/server/net/watchlist/NetworkWatchlistService.java b/services/core/java/com/android/server/net/watchlist/NetworkWatchlistService.java
index 5f4e471..e5fc6e5 100644
--- a/services/core/java/com/android/server/net/watchlist/NetworkWatchlistService.java
+++ b/services/core/java/com/android/server/net/watchlist/NetworkWatchlistService.java
@@ -63,7 +63,7 @@
         @Override
         public void onStart() {
             if (Settings.Global.getInt(getContext().getContentResolver(),
-                    Settings.Global.NETWORK_WATCHLIST_ENABLED, 0) == 0) {
+                    Settings.Global.NETWORK_WATCHLIST_ENABLED, 1) == 0) {
                 // Watchlist service is disabled
                 Slog.i(TAG, "Network Watchlist service is disabled");
                 return;
@@ -76,7 +76,7 @@
         public void onBootPhase(int phase) {
             if (phase == SystemService.PHASE_ACTIVITY_MANAGER_READY) {
                 if (Settings.Global.getInt(getContext().getContentResolver(),
-                        Settings.Global.NETWORK_WATCHLIST_ENABLED, 0) == 0) {
+                        Settings.Global.NETWORK_WATCHLIST_ENABLED, 1) == 0) {
                     // Watchlist service is disabled
                     Slog.i(TAG, "Network Watchlist service is disabled");
                     return;
