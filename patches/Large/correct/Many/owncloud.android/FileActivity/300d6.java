diff --git a/src/com/owncloud/android/ui/activity/FileActivity.java b/src/com/owncloud/android/ui/activity/FileActivity.java
index d97bbcf..2db9557 100644
--- a/src/com/owncloud/android/ui/activity/FileActivity.java
+++ b/src/com/owncloud/android/ui/activity/FileActivity.java
@@ -716,7 +716,7 @@
             mCapabilities = mStorageManager.getCapability(mAccount.name);
 
         } else {
-            Log_OC.wtf(TAG, "onAccountChanged was called with NULL account associated!");
+            Log_OC.e(TAG, "onAccountChanged was called with NULL account associated!");
         }
     }
 
