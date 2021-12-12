diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index b531f0e..8a4fa7c 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -10209,7 +10209,7 @@
                 ServiceRecord.StartItem si = r.pendingStarts.get(i);
                 if (DEBUG_SERVICE) Log.v(TAG, "Sending arguments to service: "
                         + r.name + " " + r.intent + " args=" + si.intent);
-                if (si.intent == null && N > 0) {
+                if (si.intent == null && N > 1) {
                     // If somehow we got a dummy start at the front, then
                     // just drop it here.
                     i++;
