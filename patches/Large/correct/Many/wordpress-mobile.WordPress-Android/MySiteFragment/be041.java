diff --git a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
index 4b9f104..a193f9c 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/main/MySiteFragment.java
@@ -151,7 +151,7 @@
 
         if (savedInstanceState != null) {
             mActiveTutorialPrompt =
-                    (InitialTutorialPrompts) savedInstanceState.getSerializable(InitialTutorialPrompts.KEY);
+                    (QuickStartMySitePrompts) savedInstanceState.getSerializable(QuickStartMySitePrompts.KEY);
         }
     }
 
@@ -182,7 +182,7 @@
 
     @Override public void onSaveInstanceState(Bundle outState) {
         super.onSaveInstanceState(outState);
-        outState.putSerializable(InitialTutorialPrompts.KEY, mActiveTutorialPrompt);
+        outState.putSerializable(QuickStartMySitePrompts.KEY, mActiveTutorialPrompt);
     }
 
     private void initSiteSettings() {
@@ -892,7 +892,7 @@
             int horizontalOffset;
             int verticalOffset;
 
-            if (InitialTutorialPrompts.isTargetingBottomNavBar(mActiveTutorialPrompt.getTask())) {
+            if (QuickStartMySitePrompts.isTargetingBottomNavBar(mActiveTutorialPrompt.getTask())) {
                 horizontalOffset = (quickStartTarget.getWidth() / 2) - focusPointSize + getResources()
                         .getDimensionPixelOffset(R.dimen.quick_start_focus_point_bottom_nav_offset);
                 verticalOffset = 0;
@@ -906,7 +906,7 @@
                     verticalOffset);
 
             // highlighting MySite row and scrolling to it
-            if (!InitialTutorialPrompts.isTargetingBottomNavBar(mActiveTutorialPrompt.getTask())) {
+            if (!QuickStartMySitePrompts.isTargetingBottomNavBar(mActiveTutorialPrompt.getTask())) {
                 mScrollView.post(new Runnable() {
                     @Override public void run() {
                         mScrollView.smoothScrollTo(0, quickStartTarget.getBottom());
