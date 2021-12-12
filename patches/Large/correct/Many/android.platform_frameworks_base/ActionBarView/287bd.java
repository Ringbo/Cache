diff --git a/core/java/com/android/internal/widget/ActionBarView.java b/core/java/com/android/internal/widget/ActionBarView.java
index 0cf84d2..eb97ea8 100644
--- a/core/java/com/android/internal/widget/ActionBarView.java
+++ b/core/java/com/android/internal/widget/ActionBarView.java
@@ -300,7 +300,7 @@
     public void setEmbeddedTabView(ScrollingTabContainerView tabs) {
         mTabScrollView = tabs;
         mIncludeTabs = tabs != null;
-        if (mIncludeTabs) {
+        if (mIncludeTabs && mNavigationMode == ActionBar.NAVIGATION_MODE_TABS) {
             addView(mTabScrollView);
         }
     }
@@ -517,7 +517,7 @@
         if (mode != oldMode) {
             switch (oldMode) {
             case ActionBar.NAVIGATION_MODE_LIST:
-                if (mSpinner != null) {
+                if (mListNavLayout != null) {
                     removeView(mListNavLayout);
                 }
                 break;
