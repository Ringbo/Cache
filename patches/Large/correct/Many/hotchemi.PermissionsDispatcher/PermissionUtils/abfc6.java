diff --git a/library/src/main/android/permissions/dispatcher/PermissionUtils.java b/library/src/main/android/permissions/dispatcher/PermissionUtils.java
index 07d3ee1..75f532e 100644
--- a/library/src/main/android/permissions/dispatcher/PermissionUtils.java
+++ b/library/src/main/android/permissions/dispatcher/PermissionUtils.java
@@ -96,7 +96,7 @@
      * @see #hasSelfPermissions(Context, String...)
      */
     private static boolean hasSelfPermission(Context context, String permission) {
-        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.M && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
+        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
             return hasSelfPermissionForXiaomi(context, permission);
         }
         try {
