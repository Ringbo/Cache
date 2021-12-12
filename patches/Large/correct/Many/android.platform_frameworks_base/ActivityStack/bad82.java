diff --git a/services/java/com/android/server/am/ActivityStack.java b/services/java/com/android/server/am/ActivityStack.java
index 4e3e457..ad895b1 100644
--- a/services/java/com/android/server/am/ActivityStack.java
+++ b/services/java/com/android/server/am/ActivityStack.java
@@ -368,7 +368,7 @@
                     // so we need to be conservative and assume it isn't.
                     ActivityRecord r = (ActivityRecord)msg.obj;
                     Slog.w(TAG, "Activity idle timeout for " + r);
-                    synchronized (this) {
+                    synchronized (mService) {
                         activityIdleInternalLocked(r != null ? r.appToken : null, true, null);
                     }
                 } break;
