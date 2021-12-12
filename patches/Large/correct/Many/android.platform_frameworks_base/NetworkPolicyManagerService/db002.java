diff --git a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
index a818bdd..3acd2ca 100644
--- a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -2543,7 +2543,7 @@
         final List<UserInfo> users = mUserManager.getUsers();
         for (int i = 0; i < users.size(); i++) {
             final UserInfo user = users.get(i);
-            for (int j = mPowerSaveTempWhitelistAppIds.size() - 1; j >= 0; i--) {
+            for (int j = mPowerSaveTempWhitelistAppIds.size() - 1; j >= 0; j--) {
                 int appId = mPowerSaveTempWhitelistAppIds.keyAt(j);
                 int uid = UserHandle.getUid(user.id, appId);
                 updateRuleForAppIdleLocked(uid);
