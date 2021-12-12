diff --git a/core/java/android/service/oemlock/OemLockManager.java b/core/java/android/service/oemlock/OemLockManager.java
index 9e69362..644ca6c 100644
--- a/core/java/android/service/oemlock/OemLockManager.java
+++ b/core/java/android/service/oemlock/OemLockManager.java
@@ -147,7 +147,7 @@
      */
     public boolean isDeviceOemUnlocked() {
         try {
-            return mService.isOemUnlockAllowed();
+            return mService.isDeviceOemUnlocked();
         } catch (RemoteException e) {
             throw e.rethrowFromSystemServer();
         }
