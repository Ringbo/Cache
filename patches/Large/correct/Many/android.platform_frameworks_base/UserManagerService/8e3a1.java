diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index dd34ebc..56c383a 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -2265,7 +2265,7 @@
      */
     @Override
     public UserInfo createRestrictedProfile(String name, int parentUserId) {
-        checkManageUsersPermission("setupRestrictedProfile");
+        checkManageOrCreateUsersPermission("setupRestrictedProfile");
         final UserInfo user = createProfileForUser(name, UserInfo.FLAG_RESTRICTED, parentUserId);
         if (user == null) {
             return null;
