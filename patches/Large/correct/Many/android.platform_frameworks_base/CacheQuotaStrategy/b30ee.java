diff --git a/services/core/java/com/android/server/storage/CacheQuotaStrategy.java b/services/core/java/com/android/server/storage/CacheQuotaStrategy.java
index 7720e24..e94dd0f 100644
--- a/services/core/java/com/android/server/storage/CacheQuotaStrategy.java
+++ b/services/core/java/com/android/server/storage/CacheQuotaStrategy.java
@@ -186,7 +186,8 @@
                 try {
                     // We need the app info to determine the uid and the uuid of the volume
                     // where the app is installed.
-                    ApplicationInfo appInfo = packageManager.getApplicationInfo(packageName, 0);
+                    ApplicationInfo appInfo = packageManager.getApplicationInfoAsUser(
+                            packageName, 0, info.id);
                     requests.add(
                             new CacheQuotaHint.Builder()
                                     .setVolumeUuid(appInfo.volumeUuid)
