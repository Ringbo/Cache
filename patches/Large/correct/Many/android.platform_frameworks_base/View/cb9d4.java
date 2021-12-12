diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index f111f98..f9629bd 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -10940,7 +10940,7 @@
     public void dispatchSystemUiVisibilityChanged(int visibility) {
         if (mOnSystemUiVisibilityChangeListener != null) {
             mOnSystemUiVisibilityChangeListener.onSystemUiVisibilityChange(
-                    visibility & ~PUBLIC_STATUS_BAR_VISIBILITY_MASK);
+                    visibility & PUBLIC_STATUS_BAR_VISIBILITY_MASK);
         }
     }
 
