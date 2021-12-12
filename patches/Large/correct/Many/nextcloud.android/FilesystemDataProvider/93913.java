diff --git a/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java b/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java
index f1cf283..30fb753 100644
--- a/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java
+++ b/src/main/java/com/owncloud/android/datamodel/FilesystemDataProvider.java
@@ -209,7 +209,7 @@
         return dataSet;
     }
 
-    private static long getFileChecksum(String filepath) {
+    private long getFileChecksum(String filepath) {
 
         InputStream inputStream = null;
         try {
