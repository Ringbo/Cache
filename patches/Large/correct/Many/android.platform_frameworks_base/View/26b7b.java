diff --git a/core/java/android/view/View.java b/core/java/android/view/View.java
index 0d185fd..a3bce9e 100644
--- a/core/java/android/view/View.java
+++ b/core/java/android/view/View.java
@@ -11485,7 +11485,7 @@
     public void invalidate(int l, int t, int r, int b) {
         final int scrollX = mScrollX;
         final int scrollY = mScrollY;
-        invalidateInternal(l - scrollX, t - scrollY, r - scrollY, b - scrollY, true, false);
+        invalidateInternal(l - scrollX, t - scrollY, r - scrollX, b - scrollY, true, false);
     }
 
     /**
@@ -11525,7 +11525,7 @@
         if ((mPrivateFlags & (PFLAG_DRAWN | PFLAG_HAS_BOUNDS)) == (PFLAG_DRAWN | PFLAG_HAS_BOUNDS)
                 || (invalidateCache && (mPrivateFlags & PFLAG_DRAWING_CACHE_VALID) == PFLAG_DRAWING_CACHE_VALID)
                 || (mPrivateFlags & PFLAG_INVALIDATED) != PFLAG_INVALIDATED
-                || checkOpaque && isOpaque() != mLastIsOpaque) {
+                || (checkOpaque && isOpaque() != mLastIsOpaque)) {
             mLastIsOpaque = isOpaque();
             mPrivateFlags &= ~PFLAG_DRAWN;
             mPrivateFlags |= PFLAG_DIRTY;
