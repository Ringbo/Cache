diff --git a/core/java/android/content/pm/PackageManager.java b/core/java/android/content/pm/PackageManager.java
index bf0d4de..ab14d4f 100644
--- a/core/java/android/content/pm/PackageManager.java
+++ b/core/java/android/content/pm/PackageManager.java
@@ -3167,7 +3167,7 @@
      */
     public Intent buildRequestPermissionsIntent(@NonNull String[] permissions) {
         if (ArrayUtils.isEmpty(permissions)) {
-           throw new NullPointerException("permission cannot be null or empty");
+           throw new IllegalArgumentException("permission cannot be null or empty");
         }
         Intent intent = new Intent(ACTION_REQUEST_PERMISSIONS);
         intent.putExtra(EXTRA_REQUEST_PERMISSIONS_NAMES, permissions);
