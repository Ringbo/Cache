diff --git a/services/java/com/android/server/am/ActivityManagerService.java b/services/java/com/android/server/am/ActivityManagerService.java
index 8d30868..ea49661 100644
--- a/services/java/com/android/server/am/ActivityManagerService.java
+++ b/services/java/com/android/server/am/ActivityManagerService.java
@@ -9114,15 +9114,17 @@
                 ServiceRecord.StartItem si = r.pendingStarts.remove(0);
                 if (DEBUG_SERVICE) Slog.v(TAG, "Sending arguments to: "
                         + r + " " + r.intent + " args=" + si.intent);
-                if (si.intent == null) {
-                    // If somehow we got a dummy start at the front, then
-                    // just drop it here.
+                if (si.intent == null && N > 1) {
+                    // If somehow we got a dummy null intent in the middle,
+                    // then skip it.  DO NOT skip a null intent when it is
+                    // the only one in the list -- this is to support the
+                    // onStartCommand(null) case.
                     continue;
                 }
                 si.deliveredTime = SystemClock.uptimeMillis();
                 r.deliveredStarts.add(si);
                 si.deliveryCount++;
-                if (si.targetPermissionUid >= 0) {
+                if (si.targetPermissionUid >= 0 && si.intent != null) {
                     grantUriPermissionUncheckedFromIntentLocked(si.targetPermissionUid,
                             r.packageName, si.intent, si.getUriPermissionsLocked());
                 }
