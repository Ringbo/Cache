diff --git a/src/com/fsck/k9/view/ToggleScrollView.java b/src/com/fsck/k9/view/ToggleScrollView.java
index ed70d55..5475768 100644
--- a/src/com/fsck/k9/view/ToggleScrollView.java
+++ b/src/com/fsck/k9/view/ToggleScrollView.java
@@ -40,7 +40,8 @@
         // currently got.  This is based on
         // http://stackoverflow.com/questions/2646028/android-horizontalscrollview-within-scrollview-touch-handling
         boolean result = super.onInterceptTouchEvent(ev);
-        if (mDetector.onTouchEvent(ev))
+        // Let the original ScrollView handle ACTION_DOWN so we can stop the scroll when someone touches the screen.
+        if (ev.getAction() == MotionEvent.ACTION_DOWN || mDetector.onTouchEvent(ev))
         {
             return result;
         }
@@ -48,7 +49,8 @@
         return false;
     }
 
-    // Return false if we're scrolling in the x direction
+    // Return false if we're scrolling in the x direction. That is, decline to consume the event and
+    // let the parent class take a stab at it.
     class YScrollDetector extends GestureDetector.SimpleOnGestureListener
     {
         @Override
