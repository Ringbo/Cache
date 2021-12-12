diff --git a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
index c0d0d13..5c1878e 100644
--- a/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
+++ b/services/core/java/com/android/server/net/NetworkPolicyManagerService.java
@@ -1774,7 +1774,7 @@
         maybeRefreshTrustedTime();
         synchronized (mRulesLock) {
             mRestrictBackground = restrictBackground;
-            updateRulesForGlobalChangeLocked(false);
+            updateRulesForGlobalChangeLocked(true);
             updateNotificationsLocked();
             writePolicyLocked();
         }
