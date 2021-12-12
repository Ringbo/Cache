diff --git a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
index 47df30b..7baa258 100644
--- a/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
+++ b/services/devicepolicy/java/com/android/server/devicepolicy/DevicePolicyManagerService.java
@@ -4769,7 +4769,8 @@
     }
 
     @Override
-    public void setBlockUninstall(ComponentName who, String packageName, boolean blockUninstall) {
+    public void setUninstallBlocked(ComponentName who, String packageName,
+            boolean uninstallBlocked) {
         final int userId = UserHandle.getCallingUserId();
 
         synchronized (this) {
@@ -4781,7 +4782,7 @@
             long id = Binder.clearCallingIdentity();
             try {
                 IPackageManager pm = AppGlobals.getPackageManager();
-                pm.setBlockUninstallForUser(packageName, blockUninstall, userId);
+                pm.setBlockUninstallForUser(packageName, uninstallBlocked, userId);
             } catch (RemoteException re) {
                 // Shouldn't happen.
                 Slog.e(LOG_TAG, "Failed to setBlockUninstallForUser", re);
@@ -4792,7 +4793,7 @@
     }
 
     @Override
-    public boolean getBlockUninstall(ComponentName who, String packageName) {
+    public boolean getUninstallBlocked(ComponentName who, String packageName) {
         final int userId = UserHandle.getCallingUserId();
 
         synchronized (this) {
