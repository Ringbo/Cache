diff --git a/services/core/java/com/android/server/am/ActivityStarter.java b/services/core/java/com/android/server/am/ActivityStarter.java
index 59f6098..56594d3 100644
--- a/services/core/java/com/android/server/am/ActivityStarter.java
+++ b/services/core/java/com/android/server/am/ActivityStarter.java
@@ -1038,7 +1038,7 @@
             sendPowerHintForLaunchStartIfNeeded(false /* forceSend */);
 
             reusedActivity = setTargetStackAndMoveToFrontIfNeeded(reusedActivity);
-            if (outActivity.length > 0) {
+            if (outActivity != null && outActivity.length > 0) {
                 outActivity[0] = reusedActivity;
             }
 
