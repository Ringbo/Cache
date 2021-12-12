diff --git a/src/com/owncloud/android/ui/activity/FolderPickerActivity.java b/src/com/owncloud/android/ui/activity/FolderPickerActivity.java
index 11f515c..7e87365 100644
--- a/src/com/owncloud/android/ui/activity/FolderPickerActivity.java
+++ b/src/com/owncloud/android/ui/activity/FolderPickerActivity.java
@@ -178,7 +178,7 @@
         if (listOfFiles != null) {
             return (OCFileListFragment)listOfFiles;
         }
-        Log_OC.wtf(TAG, "Access to unexisting list of files fragment!!");
+        Log_OC.e(TAG, "Access to unexisting list of files fragment!!");
         return null;
     }
 
