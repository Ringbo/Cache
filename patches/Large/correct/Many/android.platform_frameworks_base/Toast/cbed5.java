diff --git a/core/java/android/widget/Toast.java b/core/java/android/widget/Toast.java
index eca10cb..a400d90 100644
--- a/core/java/android/widget/Toast.java
+++ b/core/java/android/widget/Toast.java
@@ -460,7 +460,7 @@
                 // the view isn't yet added, so let's try not to crash.
                 if (mView.getParent() != null) {
                     if (localLOGV) Log.v(TAG, "REMOVE! " + mView + " in " + this);
-                    mWM.removeView(mView);
+                    mWM.removeViewImmediate(mView);
                 }
 
                 mView = null;
