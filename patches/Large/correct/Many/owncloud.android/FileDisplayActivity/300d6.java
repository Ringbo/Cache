diff --git a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
index 0d29554..a9df751 100644
--- a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
@@ -365,12 +365,12 @@
             }
 
         } else {
-            Log_OC.wtf(TAG, "initFragments() called with invalid NULLs!");
+            Log_OC.e(TAG, "initFragments() called with invalid NULLs!");
             if (getAccount() == null) {
-                Log_OC.wtf(TAG, "\t account is NULL");
+                Log_OC.e(TAG, "\t account is NULL");
             }
             if (getFile() == null) {
-                Log_OC.wtf(TAG, "\t file is NULL");
+                Log_OC.e(TAG, "\t file is NULL");
             }
         }
     }
@@ -447,7 +447,7 @@
         if (listOfFiles != null) {
             return (OCFileListFragment) listOfFiles;
         }
-        Log_OC.wtf(TAG, "Access to unexisting list of files fragment!!");
+        Log_OC.e(TAG, "Access to unexisting list of files fragment!!");
         return null;
     }
 
