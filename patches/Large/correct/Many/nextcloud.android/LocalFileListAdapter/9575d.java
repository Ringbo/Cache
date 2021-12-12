diff --git a/src/main/java/com/owncloud/android/ui/adapter/LocalFileListAdapter.java b/src/main/java/com/owncloud/android/ui/adapter/LocalFileListAdapter.java
index 25835f0..0857765 100644
--- a/src/main/java/com/owncloud/android/ui/adapter/LocalFileListAdapter.java
+++ b/src/main/java/com/owncloud/android/ui/adapter/LocalFileListAdapter.java
@@ -139,7 +139,7 @@
     }
 
     public int getItemPosition(File file) {
-        return mFilesAll.indexOf(file);
+        return mFiles.indexOf(file);
     }
 
     public String[] getCheckedFilesPath() {
