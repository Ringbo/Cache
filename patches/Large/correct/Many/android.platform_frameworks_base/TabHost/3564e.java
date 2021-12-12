diff --git a/core/java/android/widget/TabHost.java b/core/java/android/widget/TabHost.java
index 103d44d..1bee9db 100644
--- a/core/java/android/widget/TabHost.java
+++ b/core/java/android/widget/TabHost.java
@@ -68,7 +68,7 @@
         initTabHost();
     }
 
-    private final void initTabHost() {
+    private void initTabHost() {
         setFocusableInTouchMode(true);
         setDescendantFocusability(FOCUS_AFTER_DESCENDANTS);
 
@@ -134,7 +134,8 @@
         mTabContent = (FrameLayout) findViewById(com.android.internal.R.id.tabcontent);
         if (mTabContent == null) {
             throw new RuntimeException(
-                    "Your TabHost must have a FrameLayout whose id attribute is 'android.R.id.tabcontent'");
+                    "Your TabHost must have a FrameLayout whose id attribute is " 
+                            + "'android.R.id.tabcontent'");
         }
     }
 
@@ -176,7 +177,7 @@
         if (!isInTouchMode) {
             // leaving touch mode.. if nothing has focus, let's give it to
             // the indicator of the current tab
-            if (!mCurrentView.hasFocus() || mCurrentView.isFocused()) {
+            if (mCurrentView != null && (!mCurrentView.hasFocus() || mCurrentView.isFocused())) {
                 mTabWidget.getChildTabViewAt(mCurrentTab).requestFocus();
             }
         }
