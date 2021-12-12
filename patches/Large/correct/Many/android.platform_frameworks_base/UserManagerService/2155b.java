diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index 0a385f3..e59244d 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -1443,7 +1443,7 @@
         }
         synchronized(mUsersLock) {
             UserInfo userInfo = getUserInfoLU(userId);
-            if (!userInfo.canHaveProfile()) {
+            if (userInfo == null || !userInfo.canHaveProfile()) {
                 return false;
             }
             int usersCountAfterRemoving = getAliveUsersExcludingGuestsCountLU()
