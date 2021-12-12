diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index 9f6e8c0..efd6f46 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -592,7 +592,7 @@
     @Override
     public int[] getProfileIds(int userId, boolean enabledOnly) {
         if (userId != UserHandle.getCallingUserId()) {
-            checkManageUsersPermission("getting profiles related to user " + userId);
+            checkManageOrCreateUsersPermission("getting profiles related to user " + userId);
         }
         final long ident = Binder.clearCallingIdentity();
         try {
