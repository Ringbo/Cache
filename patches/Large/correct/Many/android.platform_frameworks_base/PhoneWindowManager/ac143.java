diff --git a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
index 1be5bd7..5697284 100755
--- a/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
+++ b/policy/src/com/android/internal/policy/impl/PhoneWindowManager.java
@@ -973,12 +973,13 @@
                 com.android.internal.R.dimen.navigation_bar_width);
 
         // Determine whether the status bar can hide based on the size
-        // of the screen.  We assume sizes > 600dp are tablets where we
+        // of the screen.  We assume sizes >= 600dp are tablets where we
         // will use the system bar.
+        // XXX: This will change to 720dp soon.
         int shortSizeDp = shortSize
                 * DisplayMetrics.DENSITY_DEFAULT
                 / DisplayMetrics.DENSITY_DEVICE;
-        mHasSystemNavBar = shortSizeDp > 600;
+        mHasSystemNavBar = shortSizeDp >= 600;
 
         if (!mHasSystemNavBar) {
             mHasNavigationBar = mContext.getResources().getBoolean(
