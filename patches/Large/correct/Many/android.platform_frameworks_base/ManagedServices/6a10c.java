diff --git a/services/core/java/com/android/server/notification/ManagedServices.java b/services/core/java/com/android/server/notification/ManagedServices.java
index 11cc52d..0774779 100644
--- a/services/core/java/com/android/server/notification/ManagedServices.java
+++ b/services/core/java/com/android/server/notification/ManagedServices.java
@@ -583,7 +583,7 @@
                     ServiceInfo info = mPm.getServiceInfo(component,
                             PackageManager.MATCH_DIRECT_BOOT_AWARE
                                     | PackageManager.MATCH_DIRECT_BOOT_UNAWARE, userIds[i]);
-                    if (!mConfig.bindPermission.equals(info.permission)) {
+                    if (info == null || !mConfig.bindPermission.equals(info.permission)) {
                         Slog.w(TAG, "Skipping " + getCaption() + " service " + component
                                 + ": it does not require the permission " + mConfig.bindPermission);
                         continue;
