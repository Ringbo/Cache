diff --git a/services/core/java/com/android/server/am/TaskRecord.java b/services/core/java/com/android/server/am/TaskRecord.java
index 73c9783..4dfd23b 100644
--- a/services/core/java/com/android/server/am/TaskRecord.java
+++ b/services/core/java/com/android/server/am/TaskRecord.java
@@ -783,7 +783,7 @@
     int findEffectiveRootIndex() {
         int effectiveNdx = 0;
         final int topActivityNdx = mActivities.size() - 1;
-        for (int activityNdx = 0; activityNdx < topActivityNdx; ++activityNdx) {
+        for (int activityNdx = 0; activityNdx <= topActivityNdx; ++activityNdx) {
             final ActivityRecord r = mActivities.get(activityNdx);
             if (r.finishing) {
                 continue;
