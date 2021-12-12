diff --git a/services/core/java/com/android/server/am/ActivityStarter.java b/services/core/java/com/android/server/am/ActivityStarter.java
index c2fc9dc..f5874af 100644
--- a/services/core/java/com/android/server/am/ActivityStarter.java
+++ b/services/core/java/com/android/server/am/ActivityStarter.java
@@ -1802,7 +1802,7 @@
     }
 
     private void addOrReparentStartingActivity(TaskRecord parent, String reason) {
-        if (mStartActivity.task == null) {
+        if (mStartActivity.task == null || mStartActivity.task == parent) {
             parent.addActivityToTop(mStartActivity);
         } else {
             mStartActivity.reparent(parent, parent.mActivities.size() /* top */, reason);
