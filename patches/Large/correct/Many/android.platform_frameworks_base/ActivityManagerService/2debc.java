diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index c2c86ff..f6857ca 100755
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -8655,7 +8655,8 @@
 
     @Override
     public void startLockTaskModeOnCurrent() throws RemoteException {
-        checkCallingPermission(android.Manifest.permission.MANAGE_ACTIVITY_STACKS);
+        enforceCallingPermission(android.Manifest.permission.MANAGE_ACTIVITY_STACKS,
+                "startLockTaskModeOnCurrent");
         ActivityRecord r = null;
         synchronized (this) {
             r = mStackSupervisor.topRunningActivityLocked();
@@ -8697,7 +8698,8 @@
 
     @Override
     public void stopLockTaskModeOnCurrent() throws RemoteException {
-        checkCallingPermission(android.Manifest.permission.MANAGE_ACTIVITY_STACKS);
+        enforceCallingPermission(android.Manifest.permission.MANAGE_ACTIVITY_STACKS,
+                "stopLockTaskModeOnCurrent");
         long ident = Binder.clearCallingIdentity();
         try {
             stopLockTaskMode();
