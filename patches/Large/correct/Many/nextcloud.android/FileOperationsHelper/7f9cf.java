diff --git a/src/com/owncloud/android/files/FileOperationsHelper.java b/src/com/owncloud/android/files/FileOperationsHelper.java
index 9c5583a..9cd9eb2 100644
--- a/src/com/owncloud/android/files/FileOperationsHelper.java
+++ b/src/com/owncloud/android/files/FileOperationsHelper.java
@@ -127,7 +127,7 @@
             }
 
         } else {
-            Log_OC.wtf(TAG, "Trying to open a NULL OCFile");
+            Log_OC.e(TAG, "Trying to open a NULL OCFile");
         }
     }
 
@@ -166,7 +166,7 @@
                 mWaitingForOpId = mFileActivity.getOperationsServiceBinder().queueNewOperation(service);
 
             } else {
-                Log_OC.wtf(TAG, "Trying to share a NULL OCFile");
+                Log_OC.e(TAG, "Trying to share a NULL OCFile");
                 // TODO user-level error?
             }
 
@@ -193,7 +193,7 @@
                 mWaitingForOpId = mFileActivity.getOperationsServiceBinder().queueNewOperation(service);
 
             } else {
-                Log_OC.wtf(TAG, "Trying to share a NULL OCFile");
+                Log_OC.e(TAG, "Trying to share a NULL OCFile");
             }
         } else {
             // Show a Message
@@ -229,7 +229,7 @@
             mWaitingForOpId = mFileActivity.getOperationsServiceBinder().queueNewOperation(service);
 
         } else {
-            Log_OC.wtf(TAG, "Trying to share a NULL OCFile");
+            Log_OC.e(TAG, "Trying to share a NULL OCFile");
         }
     }
 
@@ -422,7 +422,7 @@
             chooserDialog.show(mFileActivity.getSupportFragmentManager(), FTAG_CHOOSER_DIALOG);
 
         } else {
-            Log_OC.wtf(TAG, "Trying to send a NULL OCFile");
+            Log_OC.e(TAG, "Trying to send a NULL OCFile");
         }
     }
 
