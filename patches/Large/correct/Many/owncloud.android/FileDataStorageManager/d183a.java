diff --git a/src/com/owncloud/android/datamodel/FileDataStorageManager.java b/src/com/owncloud/android/datamodel/FileDataStorageManager.java
index f359c77..ddac316 100644
--- a/src/com/owncloud/android/datamodel/FileDataStorageManager.java
+++ b/src/com/owncloud/android/datamodel/FileDataStorageManager.java
@@ -1704,7 +1704,7 @@
         return publicShares;
     }
 
-    public void triggerMediaScan(String path) {
+    public static void triggerMediaScan(String path) {
         if (path != null) {
             Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
             intent.setData(Uri.fromFile(new File(path)));
