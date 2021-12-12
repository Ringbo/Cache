diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index a24f84a..906f52b 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -4594,7 +4594,7 @@
             }
             ActivityOptions.abort(options);
         } else {
-            updateTransitLocked(TRANSIT_TASK_TO_FRONT, r, options);
+            updateTransitLocked(TRANSIT_TASK_TO_FRONT, starting, options);
         }
         // If a new task is moved to the front, then mark the existing top activity as supporting
         // picture-in-picture while paused only if the task would not be considered an oerlay on top
