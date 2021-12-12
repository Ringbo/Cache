diff --git a/services/core/java/com/android/server/MountService.java b/services/core/java/com/android/server/MountService.java
index c6a1dce..9dc3ac1 100644
--- a/services/core/java/com/android/server/MountService.java
+++ b/services/core/java/com/android/server/MountService.java
@@ -2354,7 +2354,7 @@
         }
 
         try {
-            NativeDaemonEvent event = mConnector.execute(
+            NativeDaemonEvent event = mCryptConnector.execute(
                 "cryptfs", "createnewuserdir", userHandle, path);
             if (!"0".equals(event.getMessage())) {
                 String error = "createnewuserdir sent unexpected message: "
@@ -2383,7 +2383,7 @@
         }
 
         try {
-            NativeDaemonEvent event = mConnector.execute(
+            NativeDaemonEvent event = mCryptConnector.execute(
                 "cryptfs", "deleteuserkey", userHandle);
             if (!"0".equals(event.getMessage())) {
                 String error = "deleteuserkey sent unexpected message: "
