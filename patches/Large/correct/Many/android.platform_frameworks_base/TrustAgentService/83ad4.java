diff --git a/core/java/android/service/trust/TrustAgentService.java b/core/java/android/service/trust/TrustAgentService.java
index 40e84b9..61277e2 100644
--- a/core/java/android/service/trust/TrustAgentService.java
+++ b/core/java/android/service/trust/TrustAgentService.java
@@ -545,7 +545,7 @@
      */
     public final void unlockUserWithToken(long handle, byte[] token, UserHandle user) {
         UserManager um = (UserManager) getSystemService(Context.USER_SERVICE);
-        if (um.isUserUnlocked()) {
+        if (um.isUserUnlocked(user)) {
             Slog.i(TAG, "User already unlocked");
             return;
         }
