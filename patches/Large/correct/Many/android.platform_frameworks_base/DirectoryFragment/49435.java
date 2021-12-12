diff --git a/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java b/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java
index b2fd9c4..e55dd27 100644
--- a/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java
+++ b/packages/DocumentsUI/src/com/android/documentsui/dirlist/DirectoryFragment.java
@@ -1042,7 +1042,7 @@
         }
 
         // Can't copy folders to downloads, because we don't show folders there.
-        if (!root.isDownloads()) {
+        if (root.isDownloads()) {
             for (DocumentInfo docs : files) {
                 if (docs.isDirectory()) {
                     return false;
