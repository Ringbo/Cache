diff --git a/services/core/java/com/android/server/stats/StatsCompanionService.java b/services/core/java/com/android/server/stats/StatsCompanionService.java
index d1b48480..8214aad 100644
--- a/services/core/java/com/android/server/stats/StatsCompanionService.java
+++ b/services/core/java/com/android/server/stats/StatsCompanionService.java
@@ -426,7 +426,7 @@
                     return;
                 }
                 try {
-                  sStatsd.informDeviceShutdown(true);
+                  sStatsd.informDeviceShutdown();
                 } catch (Exception e) {
                     Slog.w(TAG, "Failed to inform statsd of a shutdown event.", e);
                 }
