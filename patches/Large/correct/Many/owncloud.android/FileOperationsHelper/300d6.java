diff --git a/src/com/owncloud/android/files/FileOperationsHelper.java b/src/com/owncloud/android/files/FileOperationsHelper.java
index 532b99d..149abbf 100644
--- a/src/com/owncloud/android/files/FileOperationsHelper.java
+++ b/src/com/owncloud/android/files/FileOperationsHelper.java
@@ -130,7 +130,7 @@
             }
 
         } else {
-            Log_OC.wtf(TAG, "Trying to open a NULL OCFile");
+            Log_OC.e(TAG, "Trying to open a NULL OCFile");
         }
     }
 
@@ -169,7 +169,7 @@
                 mWaitingForOpId = mFileActivity.getOperationsServiceBinder().queueNewOperation(service);
 
             } else {
-                Log_OC.wtf(TAG, "Trying to share a NULL OCFile");
+                Log_OC.e(TAG, "Trying to share a NULL OCFile");
                 // TODO user-level error?
             }
 
@@ -196,7 +196,7 @@
                 mWaitingForOpId = mFileActivity.getOperationsServiceBinder().queueNewOperation(service);
 
             } else {
-                Log_OC.wtf(TAG, "Trying to share a NULL OCFile");
+                Log_OC.e(TAG, "Trying to share a NULL OCFile");
             }
         } else {
             // Show a Message
@@ -232,7 +232,7 @@
             mWaitingForOpId = mFileActivity.getOperationsServiceBinder().queueNewOperation(service);
 
         } else {
-            Log_OC.wtf(TAG, "Trying to share a NULL OCFile");
+            Log_OC.e(TAG, "Trying to share a NULL OCFile");
         }
     }
 
@@ -425,7 +425,7 @@
             chooserDialog.show(mFileActivity.getSupportFragmentManager(), FTAG_CHOOSER_DIALOG);
 
         } else {
-            Log_OC.wtf(TAG, "Trying to send a NULL OCFile");
+            Log_OC.e(TAG, "Trying to send a NULL OCFile");
         }
     }
 
