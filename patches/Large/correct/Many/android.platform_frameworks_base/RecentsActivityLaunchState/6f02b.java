diff --git a/packages/SystemUI/src/com/android/systemui/recents/RecentsActivityLaunchState.java b/packages/SystemUI/src/com/android/systemui/recents/RecentsActivityLaunchState.java
index e2e0e918..76b666f 100644
--- a/packages/SystemUI/src/com/android/systemui/recents/RecentsActivityLaunchState.java
+++ b/packages/SystemUI/src/com/android/systemui/recents/RecentsActivityLaunchState.java
@@ -56,7 +56,7 @@
 
     /** Returns whether the status bar scrim should be animated when shown for the first time. */
     public boolean shouldAnimateStatusBarScrim() {
-        return launchedFromHome;
+        return true;
     }
 
     /** Returns whether the status bar scrim should be visible. */
@@ -72,6 +72,6 @@
     /** Returns whether the nav bar scrim should be visible. */
     public boolean hasNavBarScrim() {
         // Only show the scrim if we have recent tasks, and if the nav bar is not transposed
-        return !launchedWithNoRecentTasks && mConfig.hasTransposedNavBar;
+        return !launchedWithNoRecentTasks && !mConfig.hasTransposedNavBar;
     }
 }
