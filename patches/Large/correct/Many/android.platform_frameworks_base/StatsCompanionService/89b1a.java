diff --git a/services/core/java/com/android/server/stats/StatsCompanionService.java b/services/core/java/com/android/server/stats/StatsCompanionService.java
index 401f74c..d1b48480 100644
--- a/services/core/java/com/android/server/stats/StatsCompanionService.java
+++ b/services/core/java/com/android/server/stats/StatsCompanionService.java
@@ -426,7 +426,7 @@
                     return;
                 }
                 try {
-                    sStatsd.writeDataToDisk();
+                  sStatsd.informDeviceShutdown(true);
                 } catch (Exception e) {
                     Slog.w(TAG, "Failed to inform statsd of a shutdown event.", e);
                 }
