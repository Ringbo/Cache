diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index e646ffc..1eb8b94 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -1567,7 +1567,7 @@
         }
         synchronized(mUsersLock) {
             UserInfo userInfo = getUserInfoLU(userId);
-            if (!userInfo.canHaveProfile()) {
+            if (userInfo == null || !userInfo.canHaveProfile()) {
                 return false;
             }
             int usersCountAfterRemoving = getAliveUsersExcludingGuestsCountLU()
