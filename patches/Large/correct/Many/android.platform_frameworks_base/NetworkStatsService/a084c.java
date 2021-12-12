diff --git a/services/java/com/android/server/net/NetworkStatsService.java b/services/java/com/android/server/net/NetworkStatsService.java
index 524dd40..4a79d17 100644
--- a/services/java/com/android/server/net/NetworkStatsService.java
+++ b/services/java/com/android/server/net/NetworkStatsService.java
@@ -1062,7 +1062,9 @@
                 Slog.w(TAG, "kernel does not support bandwidth control");
                 return false;
             }
-            return Settings.Secure.getInt(mResolver, NETSTATS_ENABLED, 1) != 0;
+            // TODO: once things stabilize, enable by default.
+            // For now: ./vendor/google/tools/override-gservices secure:netstats_enabled=1
+            return Settings.Secure.getInt(mResolver, NETSTATS_ENABLED, 0) != 0;
         }
         public long getPollInterval() {
             return getSecureLong(NETSTATS_POLL_INTERVAL, 15 * MINUTE_IN_MILLIS);
