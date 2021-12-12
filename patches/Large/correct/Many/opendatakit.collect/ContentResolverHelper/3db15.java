diff --git a/collect_app/src/main/java/org/odk/collect/android/dao/helpers/ContentResolverHelper.java b/collect_app/src/main/java/org/odk/collect/android/dao/helpers/ContentResolverHelper.java
index f228cc6..bb09937 100644
--- a/collect_app/src/main/java/org/odk/collect/android/dao/helpers/ContentResolverHelper.java
+++ b/collect_app/src/main/java/org/odk/collect/android/dao/helpers/ContentResolverHelper.java
@@ -80,7 +80,7 @@
      */
     public static String getFileExtensionFromUri(Uri fileUri) {
         try (Cursor returnCursor = getContentResolver().query(fileUri, null, null, null, null)) {
-            if (returnCursor != null) {
+            if (returnCursor != null && returnCursor.getCount() > 0) {
                 int nameIndex = returnCursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                 returnCursor.moveToFirst();
                 String filename = returnCursor.getString(nameIndex);
