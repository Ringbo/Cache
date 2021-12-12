diff --git a/core/java/android/widget/ListPopupWindow.java b/core/java/android/widget/ListPopupWindow.java
index a31d37e..fe8b08b 100644
--- a/core/java/android/widget/ListPopupWindow.java
+++ b/core/java/android/widget/ListPopupWindow.java
@@ -1385,7 +1385,9 @@
             clearCallbacks();
 
             final View src = mSrc;
-            if (!src.isEnabled()) {
+            if (!src.isEnabled() || src.isLongClickable()) {
+                // Ignore long-press if the view is disabled or has its own
+                // handler.
                 return;
             }
 
@@ -1394,12 +1396,12 @@
             }
 
             // Don't let the parent intercept our events.
-            mSrc.getParent().requestDisallowInterceptTouchEvent(true);
+            src.getParent().requestDisallowInterceptTouchEvent(true);
 
             // Make sure we cancel any ongoing source event stream.
             final long now = SystemClock.uptimeMillis();
             final MotionEvent e = MotionEvent.obtain(now, now, MotionEvent.ACTION_CANCEL, 0, 0, 0);
-            mSrc.onTouchEvent(e);
+            src.onTouchEvent(e);
             e.recycle();
 
             mForwarding = true;
