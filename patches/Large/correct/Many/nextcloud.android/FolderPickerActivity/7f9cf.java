diff --git a/src/com/owncloud/android/ui/activity/FolderPickerActivity.java b/src/com/owncloud/android/ui/activity/FolderPickerActivity.java
index e594b69..9d9234d 100644
--- a/src/com/owncloud/android/ui/activity/FolderPickerActivity.java
+++ b/src/com/owncloud/android/ui/activity/FolderPickerActivity.java
@@ -171,7 +171,7 @@
         if (listOfFiles != null) {
             return (OCFileListFragment)listOfFiles;
         }
-        Log_OC.wtf(TAG, "Access to unexisting list of files fragment!!");
+        Log_OC.e(TAG, "Access to unexisting list of files fragment!!");
         return null;
     }
 
