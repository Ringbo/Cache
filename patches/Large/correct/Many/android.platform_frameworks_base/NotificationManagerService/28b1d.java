diff --git a/services/core/java/com/android/server/notification/NotificationManagerService.java b/services/core/java/com/android/server/notification/NotificationManagerService.java
index e411579..d6a6ca6 100644
--- a/services/core/java/com/android/server/notification/NotificationManagerService.java
+++ b/services/core/java/com/android/server/notification/NotificationManagerService.java
@@ -4099,7 +4099,7 @@
                     filter.stats = true;
                     if (ai < args.length-1) {
                         ai++;
-                        filter.since = Long.valueOf(args[ai]);
+                        filter.since = Long.parseLong(args[ai]);
                     } else {
                         filter.since = 0;
                     }
