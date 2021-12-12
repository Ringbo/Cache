diff --git a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
index a436e17..5eb315e 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/misc/SystemServicesProxy.java
@@ -208,6 +208,8 @@
      *
      * @param isHomeStackVisible if provided, will return whether the home stack is visible
      *                           regardless of the recents visibility
+     *
+     * TODO(winsonc): Refactor this check to just use the recents activity lifecycle
      */
     public boolean isRecentsActivityVisible(MutableBoolean isHomeStackVisible) {
         if (mIam == null) return false;
@@ -222,13 +224,13 @@
                 final WindowConfiguration winConfig = stackInfo.configuration.windowConfiguration;
                 final int activityType = winConfig.getActivityType();
                 final int windowingMode = winConfig.getWindowingMode();
-                if (activityType == ACTIVITY_TYPE_HOME) {
+                if (homeStackInfo == null && activityType == ACTIVITY_TYPE_HOME) {
                     homeStackInfo = stackInfo;
-                } else if (activityType == ACTIVITY_TYPE_STANDARD
+                } else if (fullscreenStackInfo == null && activityType == ACTIVITY_TYPE_STANDARD
                         && (windowingMode == WINDOWING_MODE_FULLSCREEN
                             || windowingMode == WINDOWING_MODE_SPLIT_SCREEN_SECONDARY)) {
                     fullscreenStackInfo = stackInfo;
-                } else if (activityType == ACTIVITY_TYPE_RECENTS) {
+                } else if (recentsStackInfo == null && activityType == ACTIVITY_TYPE_RECENTS) {
                     recentsStackInfo = stackInfo;
                 }
             }
