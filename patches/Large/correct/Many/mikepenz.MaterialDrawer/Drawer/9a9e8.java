diff --git a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
index 753abfa..ff414af 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/Drawer.java
@@ -793,7 +793,7 @@
 
         //get the drawer root
         mDrawerContentRoot = (ScrimInsetsFrameLayout) mDrawerLayout.getChildAt(0);
-        if (!alreadyInflated && mTranslucentStatusBar && !mTranslucentActionBarCompatibility) {
+        if (!alreadyInflated && (mTranslucentStatusBar || mTranslucentActionBarCompatibility)) {
             if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
                 setTranslucentStatusFlag(true);
             }
@@ -1019,7 +1019,7 @@
         mSliderLayout.addView(mListView, params);
 
         //some extra stuff to beautify the whole thing ;)
-        if (!mTranslucentStatusBar) {
+        if (!mTranslucentStatusBar || mTranslucentActionBarCompatibility) {
             //disable the shadow if we don't use a translucent activity
             mSliderLayout.getChildAt(0).setVisibility(View.GONE);
         } else {
