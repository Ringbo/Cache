diff --git a/services/core/java/com/android/server/pm/UserManagerService.java b/services/core/java/com/android/server/pm/UserManagerService.java
index 29b42b6..91ae098 100644
--- a/services/core/java/com/android/server/pm/UserManagerService.java
+++ b/services/core/java/com/android/server/pm/UserManagerService.java
@@ -1468,7 +1468,7 @@
         }
         synchronized(mUsersLock) {
             UserInfo userInfo = getUserInfoLU(userId);
-            if (!userInfo.canHaveProfile()) {
+            if (userInfo == null || !userInfo.canHaveProfile()) {
                 return false;
             }
             int usersCountAfterRemoving = getAliveUsersExcludingGuestsCountLU()
