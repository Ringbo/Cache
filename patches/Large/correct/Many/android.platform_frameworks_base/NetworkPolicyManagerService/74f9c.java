diff --git a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
index 0b1ece5..30aab8c 100644
--- a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -465,7 +465,7 @@
                 continue;
             }
             for (int j = 0; j < numberUsers; j++) {
-                final UserInfo user = users.get(i);
+                final UserInfo user = users.get(j);
                 final int uid = UserHandle.getUid(user.id, app.uid);
                 mDefaultRestrictBackgroundWhitelistUids.append(uid, true);
                 if (LOGD) Slog.d(TAG, "revoked whistelist status for uid " + uid + ": "
