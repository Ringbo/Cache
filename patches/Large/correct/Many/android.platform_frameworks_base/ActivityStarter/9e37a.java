diff --git a/services/core/java/com/android/server/am/ActivityStarter.java b/services/core/java/com/android/server/am/ActivityStarter.java
index 19b9b45..9e19df7 100644
--- a/services/core/java/com/android/server/am/ActivityStarter.java
+++ b/services/core/java/com/android/server/am/ActivityStarter.java
@@ -1059,7 +1059,7 @@
                 // We didn't do anything...  but it was needed (a.k.a., client don't use that
                 // intent!)  And for paranoia, make sure we have correctly resumed the top activity.
                 resumeTargetStackIfNeeded();
-                if (outActivity.length > 0) {
+                if (outActivity != null && outActivity.length > 0) {
                     outActivity[0] = reusedActivity;
                 }
                 return START_TASK_TO_FRONT;
