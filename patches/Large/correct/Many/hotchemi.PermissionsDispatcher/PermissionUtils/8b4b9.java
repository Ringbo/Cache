diff --git a/library/src/main/android/permissions/dispatcher/PermissionUtils.java b/library/src/main/android/permissions/dispatcher/PermissionUtils.java
index a43975b..781aca3 100644
--- a/library/src/main/android/permissions/dispatcher/PermissionUtils.java
+++ b/library/src/main/android/permissions/dispatcher/PermissionUtils.java
@@ -101,7 +101,8 @@
      */
     @TargetApi(Build.VERSION_CODES.DONUT)
     public static synchronized int getTargetSdkVersion(Context context) {
-        if (targetSdkVersion == -1) {
+        if (targetSdkVersion != -1) {
+            // target sdk version is already set
             return targetSdkVersion;
         }
         try {
