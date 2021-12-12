diff --git a/src/com/owncloud/android/datamodel/FileDataStorageManager.java b/src/com/owncloud/android/datamodel/FileDataStorageManager.java
index ddac316..f359c77 100644
--- a/src/com/owncloud/android/datamodel/FileDataStorageManager.java
+++ b/src/com/owncloud/android/datamodel/FileDataStorageManager.java
@@ -1704,7 +1704,7 @@
         return publicShares;
     }
 
-    public static void triggerMediaScan(String path) {
+    public void triggerMediaScan(String path) {
         if (path != null) {
             Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
             intent.setData(Uri.fromFile(new File(path)));
