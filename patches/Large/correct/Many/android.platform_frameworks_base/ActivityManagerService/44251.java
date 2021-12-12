diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 5722326..d2cd646 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -4575,7 +4575,7 @@
             int callingUid = Binder.getCallingUid();
             int origUserId = userId;
             userId = handleIncomingUser(Binder.getCallingPid(), callingUid, userId,
-                    type == ActivityManager.INTENT_SENDER_BROADCAST, true,
+                    type == ActivityManager.INTENT_SENDER_BROADCAST, false,
                     "getIntentSender", null);
             if (origUserId == UserHandle.USER_CURRENT) {
                 // We don't want to evaluate this until the pending intent is
