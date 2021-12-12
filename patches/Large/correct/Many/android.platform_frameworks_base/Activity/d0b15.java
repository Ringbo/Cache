diff --git a/core/java/android/app/Activity.java b/core/java/android/app/Activity.java
index 090f664..d64f2c5 100644
--- a/core/java/android/app/Activity.java
+++ b/core/java/android/app/Activity.java
@@ -2068,8 +2068,10 @@
 
     public void onContentChanged() {
         // First time content is available, let the fragment manager
-        // attach all of the fragments to it.
-        if (mFragments.mCurState < Fragment.CONTENT) {
+        // attach all of the fragments to it.  Don't do this if the
+        // activity is no longer attached (because it is being destroyed).
+        if (mFragments.mCurState < Fragment.CONTENT
+                && mFragments.mActivity != null) {
             mFragments.moveToState(Fragment.CONTENT, false);
         }
     }
