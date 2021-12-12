diff --git a/library/src/android/support/v4/app/DialogFragment.java b/library/src/android/support/v4/app/DialogFragment.java
index a5b89a9..952659d 100644
--- a/library/src/android/support/v4/app/DialogFragment.java
+++ b/library/src/android/support/v4/app/DialogFragment.java
@@ -361,7 +361,7 @@
         if (!mCancelable) {
             outState.putBoolean(SAVED_CANCELABLE, mCancelable);
         }
-        if (!mShowsDialog) {
+        if (mShowsDialog) {
             outState.putBoolean(SAVED_SHOWS_DIALOG, mShowsDialog);
         }
         if (mBackStackId != -1) {
