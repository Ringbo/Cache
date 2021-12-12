diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index 8bec7f7..e465009 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -535,7 +535,8 @@
 
         mHomeStack.moveHomeStackTaskToTop(homeStackTaskType);
         ActivityRecord r = getHomeActivity();
-        if (r != null) {
+        // Only resume home activity if isn't finishing.
+        if (r != null && !r.finishing) {
             mService.setFocusedActivityLocked(r, reason);
             return resumeTopActivitiesLocked(mHomeStack, prev, null);
         }
