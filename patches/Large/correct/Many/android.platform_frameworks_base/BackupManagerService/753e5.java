diff --git a/services/java/com/android/server/BackupManagerService.java b/services/java/com/android/server/BackupManagerService.java
index d67dde0..6e307a5 100644
--- a/services/java/com/android/server/BackupManagerService.java
+++ b/services/java/com/android/server/BackupManagerService.java
@@ -1313,7 +1313,7 @@
                 // If everything actually went through and this is the first time we've
                 // done a backup, we can now record what the current backup dataset token
                 // is.
-                if ((mCurrentToken == 0) && (status != BackupConstants.TRANSPORT_OK)) {
+                if ((mCurrentToken == 0) && (status == BackupConstants.TRANSPORT_OK)) {
                     try {
                         mCurrentToken = mTransport.getCurrentRestoreSet();
                     } catch (RemoteException e) { /* cannot happen */ }
