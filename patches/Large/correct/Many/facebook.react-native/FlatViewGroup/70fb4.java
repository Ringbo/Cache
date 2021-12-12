diff --git a/ReactAndroid/src/main/java/com/facebook/react/flat/FlatViewGroup.java b/ReactAndroid/src/main/java/com/facebook/react/flat/FlatViewGroup.java
index 7727097..0b19419 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/flat/FlatViewGroup.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/flat/FlatViewGroup.java
@@ -416,7 +416,11 @@
   @Override
   protected void onDetachedFromWindow() {
     if (!mIsAttached) {
-      throw new RuntimeException("Double detach");
+      // Hack.  Our current behaviour of add then immediately remove if a view is clipped pretty
+      // much guarantees that we kill network requests for images in feed.  We have a fix, but are
+      // going to add it in master and patch this in in the meantime.
+      return;
+      // throw new RuntimeException("Double detach");
     }
 
     mIsAttached = false;
@@ -877,18 +881,17 @@
             // Now off the screen.  Don't invalidate in this case, as the canvas should not be
             // redrawn unless new elements are coming onscreen.
             mClippedSubviews.put(view.getId(), view);
-            removeViewsInLayout(--index, 1);
+            detachViewFromParent(--index);
             drawView.isViewGroupClipped = true;
           }
         } else {
           // Clipped, invisible.
           if (withinBounds(view, clippingRect)) {
             // Now on the screen.  Invalidate as we have a new element to draw.
-            addViewInLayout(
+            attachViewToParent(
                 view,
                 index++,
-                ensureLayoutParams(view.getLayoutParams()),
-                true);
+                ensureLayoutParams(view.getLayoutParams()));
             mClippedSubviews.remove(view.getId());
             drawView.isViewGroupClipped = false;
             needsInvalidate = true;
