diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 072feb5..3427699 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -2626,7 +2626,7 @@
             Intent[] intents, String[] resolvedTypes, IBinder resultTo, Bundle options,
             int userId) {
         enforceNotIsolatedCaller("startActivities");
-        userId = handleIncomingUserLocked(Binder.getCallingPid(), Binder.getCallingUid(), userId,
+        userId = handleIncomingUser(Binder.getCallingPid(), Binder.getCallingUid(), userId,
                 false, true, "startActivity", null);
         int ret = mMainStack.startActivities(caller, -1, intents, resolvedTypes, resultTo,
                 options, userId);
