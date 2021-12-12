diff --git a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
index 7c1487e..6c60646 100644
--- a/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileDisplayActivity.java
@@ -352,12 +352,12 @@
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
@@ -434,7 +434,7 @@
         if (listOfFiles != null) {
             return (OCFileListFragment) listOfFiles;
         }
-        Log_OC.wtf(TAG, "Access to unexisting list of files fragment!!");
+        Log_OC.e(TAG, "Access to unexisting list of files fragment!!");
         return null;
     }
 
