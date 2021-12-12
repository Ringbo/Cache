diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index c2d9942..29b42b6 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -571,7 +571,7 @@
     @Override
     public int[] getProfileIds(int userId, boolean enabledOnly) {
         if (userId != UserHandle.getCallingUserId()) {
-            checkManageUsersPermission("getting profiles related to user " + userId);
+            checkManageOrCreateUsersPermission("getting profiles related to user " + userId);
         }
         final long ident = Binder.clearCallingIdentity();
         try {
