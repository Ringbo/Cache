diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index bed2d33..536d525 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -573,7 +573,7 @@
     @Override
     public int[] getProfileIds(int userId, boolean enabledOnly) {
         if (userId != UserHandle.getCallingUserId()) {
-            checkManageUsersPermission("getting profiles related to user " + userId);
+            checkManageOrCreateUsersPermission("getting profiles related to user " + userId);
         }
         final long ident = Binder.clearCallingIdentity();
         try {
