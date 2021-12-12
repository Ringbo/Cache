diff --git a/services/java/com/android/server/am/ActivityStackSupervisor.java b/services/java/com/android/server/am/ActivityStackSupervisor.java
index b4de258..d758cd4 100644
--- a/services/java/com/android/server/am/ActivityStackSupervisor.java
+++ b/services/java/com/android/server/am/ActivityStackSupervisor.java
@@ -285,7 +285,7 @@
         }
         mHomeStack.moveHomeTaskToTop();
         ActivityRecord r = mHomeStack.topRunningActivityLocked(null);
-        if (r != null) {
+        if (r != null && r.isHomeActivity()) {
             mService.setFocusedActivityLocked(r);
             return resumeTopActivitiesLocked(mHomeStack, prev, null);
         }
