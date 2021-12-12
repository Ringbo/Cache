diff --git a/services/core/java/com/android/server/am/ActivityManagerService.java b/services/core/java/com/android/server/am/ActivityManagerService.java
index 79cb60e..a435de7 100755
--- a/services/core/java/com/android/server/am/ActivityManagerService.java
+++ b/services/core/java/com/android/server/am/ActivityManagerService.java
@@ -8054,7 +8054,7 @@
                 checkedGrants = true;
             }
             userId = handleIncomingUser(callingPid, callingUid, userId,
-                    false, ALLOW_NON_FULL_IN_PROFILE,
+                    false, ALLOW_NON_FULL,
                     "checkContentProviderPermissionLocked " + cpi.authority, null);
             if (userId != tmpTargetUserId) {
                 // When we actually went to determine the final targer user ID, this ended
