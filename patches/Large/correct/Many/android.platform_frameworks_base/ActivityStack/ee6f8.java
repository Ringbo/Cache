diff --git a/services/core/java/com/android/server/am/ActivityStack.java b/services/core/java/com/android/server/am/ActivityStack.java
index d5a97d9..1190a49 100644
--- a/services/core/java/com/android/server/am/ActivityStack.java
+++ b/services/core/java/com/android/server/am/ActivityStack.java
@@ -4604,7 +4604,7 @@
             }
             ActivityOptions.abort(options);
         } else {
-            updateTransitLocked(TRANSIT_TASK_TO_FRONT, starting, options);
+            updateTransitLocked(TRANSIT_TASK_TO_FRONT, r, options);
         }
         // If a new task is moved to the front, then mark the existing top activity as supporting
         // picture-in-picture while paused only if the task would not be considered an oerlay on top
