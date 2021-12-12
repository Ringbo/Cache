diff --git a/services/core/java/com/android/server/am/ActiveServices.java b/services/core/java/com/android/server/am/ActiveServices.java
index b1cb2fe..fc047bc 100644
--- a/services/core/java/com/android/server/am/ActiveServices.java
+++ b/services/core/java/com/android/server/am/ActiveServices.java
@@ -793,7 +793,7 @@
                 // Asked to only stop if done with all work.  Note that
                 // to avoid leaks, we will take this as dropping all
                 // start items up to and including this one.
-                ServiceRecord.StartItem si = r.findDeliveredStart(startId, false);
+                ServiceRecord.StartItem si = r.findDeliveredStart(startId, false, false);
                 if (si != null) {
                     while (r.deliveredStarts.size() > 0) {
                         ServiceRecord.StartItem cur = r.deliveredStarts.remove(0);
@@ -2869,14 +2869,14 @@
                     case Service.START_STICKY_COMPATIBILITY:
                     case Service.START_STICKY: {
                         // We are done with the associated start arguments.
-                        r.findDeliveredStart(startId, true);
+                        r.findDeliveredStart(startId, false, true);
                         // Don't stop if killed.
                         r.stopIfKilled = false;
                         break;
                     }
                     case Service.START_NOT_STICKY: {
                         // We are done with the associated start arguments.
-                        r.findDeliveredStart(startId, true);
+                        r.findDeliveredStart(startId, false, true);
                         if (r.getLastStartId() == startId) {
                             // There is no more work, and this service
                             // doesn't want to hang around if killed.
@@ -2888,7 +2888,7 @@
                         // We'll keep this item until they explicitly
                         // call stop for it, but keep track of the fact
                         // that it was delivered.
-                        ServiceRecord.StartItem si = r.findDeliveredStart(startId, false);
+                        ServiceRecord.StartItem si = r.findDeliveredStart(startId, false, false);
                         if (si != null) {
                             si.deliveryCount = 0;
                             si.doneExecutingCount++;
@@ -2900,7 +2900,7 @@
                     case Service.START_TASK_REMOVED_COMPLETE: {
                         // Special processing for onTaskRemoved().  Don't
                         // impact normal onStartCommand() processing.
-                        r.findDeliveredStart(startId, true);
+                        r.findDeliveredStart(startId, true, true);
                         break;
                     }
                     default:
@@ -3187,7 +3187,7 @@
                     stopServiceLocked(sr);
                 } else {
                     sr.pendingStarts.add(new ServiceRecord.StartItem(sr, true,
-                            sr.makeNextStartId(), baseIntent, null, 0));
+                            sr.getLastStartId(), baseIntent, null, 0));
                     if (sr.app != null && sr.app.thread != null) {
                         // We always run in the foreground, since this is called as
                         // part of the "remove task" UI operation.
