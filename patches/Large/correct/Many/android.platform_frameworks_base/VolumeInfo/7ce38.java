diff --git a/core/java/android/os/storage/VolumeInfo.java b/core/java/android/os/storage/VolumeInfo.java
index 7399b7b..e399be0 100644
--- a/core/java/android/os/storage/VolumeInfo.java
+++ b/core/java/android/os/storage/VolumeInfo.java
@@ -437,7 +437,7 @@
 
         final Intent intent = new Intent(DocumentsContract.ACTION_BROWSE);
         intent.addCategory(Intent.CATEGORY_DEFAULT);
-        intent.setData(uri);
+        intent.setDataAndType(uri, DocumentsContract.Root.MIME_TYPE_ITEM);
 
         // note that docsui treats this as *force* show advanced. So sending
         // false permits advanced to be shown based on user preferences.
