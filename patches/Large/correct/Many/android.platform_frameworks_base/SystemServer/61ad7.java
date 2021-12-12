diff --git a/services/java/com/android/server/SystemServer.java b/services/java/com/android/server/SystemServer.java
index 5975405..a03bdbe 100644
--- a/services/java/com/android/server/SystemServer.java
+++ b/services/java/com/android/server/SystemServer.java
@@ -1023,7 +1023,8 @@
                     mSystemServiceManager.startService(BACKUP_MANAGER_SERVICE_CLASS);
                 }
 
-                if (mPackageManager.hasSystemFeature(PackageManager.FEATURE_APP_WIDGETS)) {
+                if (mPackageManager.hasSystemFeature(PackageManager.FEATURE_APP_WIDGETS)
+                    || context.getResources().getBoolean(R.bool.config_enableAppWidgetService)) {
                     mSystemServiceManager.startService(APPWIDGET_SERVICE_CLASS);
                 }
 
