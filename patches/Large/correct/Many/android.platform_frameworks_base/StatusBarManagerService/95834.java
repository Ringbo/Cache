diff --git a/services/java/com/android/server/StatusBarManagerService.java b/services/java/com/android/server/StatusBarManagerService.java
index 439eebe..1fe98af 100644
--- a/services/java/com/android/server/StatusBarManagerService.java
+++ b/services/java/com/android/server/StatusBarManagerService.java
@@ -170,7 +170,9 @@
         // so they are paired correctly.  The messages on the handler will be
         // handled in the order they were enqueued, but will be outside the lock.
         manageDisableListLocked(userId, what, token, pkg);
-        final int net = gatherDisableActionsLocked(userId);
+
+        // Ensure state for the current user is applied, even if passed a non-current user.
+        final int net = gatherDisableActionsLocked(mCurrentUserId);
         if (net != mDisabled) {
             mDisabled = net;
             mHandler.post(new Runnable() {
