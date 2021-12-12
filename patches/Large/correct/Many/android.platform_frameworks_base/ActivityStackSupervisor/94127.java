diff --git a/services/core/java/com/android/server/am/ActivityStackSupervisor.java b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
index 83fb7c2..af6f185 100644
--- a/services/core/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/core/java/com/android/server/am/ActivityStackSupervisor.java
@@ -511,7 +511,8 @@
 
         mHomeStack.moveHomeStackTaskToTop(homeStackTaskType);
         ActivityRecord r = getHomeActivity();
-        if (r != null) {
+        // Only resume home activity if isn't finishing.
+        if (r != null && !r.finishing) {
             mService.setFocusedActivityLocked(r, reason);
             return resumeTopActivitiesLocked(mHomeStack, prev, null);
         }
