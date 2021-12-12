diff --git a/services/core/java/com/android/server/am/ActiveServices.java b/services/core/java/com/android/server/am/ActiveServices.java
index 6a8c8b0..dcd9b0c 100755
--- a/services/core/java/com/android/server/am/ActiveServices.java
+++ b/services/core/java/com/android/server/am/ActiveServices.java
@@ -2201,11 +2201,11 @@
                     // If the app is null, then it was probably removed because the process died,
                     // otherwise wtf
                     if (r.app != null) {
-                        Slog.wtfStack(TAG, "Service done with onDestroy, but not inDestroying: "
+                        Slog.w(TAG, "Service done with onDestroy, but not inDestroying: "
                                 + r + ", app=" + r.app);
                     }
                 } else if (r.executeNesting != 1) {
-                    Slog.wtfStack(TAG, "Service done with onDestroy, but executeNesting="
+                    Slog.w(TAG, "Service done with onDestroy, but executeNesting="
                             + r.executeNesting + ": " + r);
                     // Fake it to keep from ANR due to orphaned entry.
                     r.executeNesting = 1;
