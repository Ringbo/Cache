diff --git a/services/core/java/com/android/server/fingerprint/FingerprintService.java b/services/core/java/com/android/server/fingerprint/FingerprintService.java
index b0f67a8..aeec764 100644
--- a/services/core/java/com/android/server/fingerprint/FingerprintService.java
+++ b/services/core/java/com/android/server/fingerprint/FingerprintService.java
@@ -460,7 +460,7 @@
         UserManager um = UserManager.get(mContext);
 
         // Allow current user or profiles of the current user...
-        for (int profileId : um.getEnabledProfileIds(userId)) {
+        for (int profileId : um.getEnabledProfileIds(mCurrentUserId)) {
             if (profileId == userId) {
                 return true;
             }
