diff --git a/services/core/java/com/android/server/notification/NotificationRecord.java b/services/core/java/com/android/server/notification/NotificationRecord.java
index 12c70a3..2ca5534 100644
--- a/services/core/java/com/android/server/notification/NotificationRecord.java
+++ b/services/core/java/com/android/server/notification/NotificationRecord.java
@@ -149,8 +149,9 @@
         }
 
         try {
-            final ApplicationInfo applicationInfo = mContext.getPackageManager().getApplicationInfo(
-                    sbn.getPackageName(), 0);
+            final ApplicationInfo applicationInfo =
+                    mContext.getPackageManager().getApplicationInfoAsUser(sbn.getPackageName(),
+                            0, sbn.getUser().getIdentifier());
             if (applicationInfo.targetSdkVersion < Build.VERSION_CODES.N) {
                 if (isNoisy) {
                     if (importance >= IMPORTANCE_HIGH) {
