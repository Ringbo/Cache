diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index d8a1c77..632a98e 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -548,7 +548,7 @@
     public List<UserInfo> getProfiles(int userId, boolean enabledOnly) {
         boolean returnFullInfo = true;
         if (userId != UserHandle.getCallingUserId()) {
-            checkManageUsersPermission("getting profiles related to user " + userId);
+            checkManageOrCreateUsersPermission("getting profiles related to user " + userId);
         } else {
             returnFullInfo = hasManageUsersPermission();
         }
