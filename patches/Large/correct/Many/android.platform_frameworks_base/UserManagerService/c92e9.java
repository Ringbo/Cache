diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index 454723c..e3c8995 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -284,7 +284,7 @@
     @Override
     public List<UserInfo> getProfiles(int userId, boolean enabledOnly) {
         if (userId != UserHandle.getCallingUserId()) {
-            checkManageUsersPermission("getting profiles related to user " + userId);
+            checkManageOrCreateUsersPermission("getting profiles related to user " + userId);
         }
         final long ident = Binder.clearCallingIdentity();
         try {
