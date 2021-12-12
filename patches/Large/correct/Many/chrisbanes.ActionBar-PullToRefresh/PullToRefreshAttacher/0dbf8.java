diff --git a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
index 36a9952..5b6d166 100644
--- a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
+++ b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
@@ -435,9 +435,9 @@
             case MotionEvent.ACTION_DOWN: {
                 // If we're already refreshing, ignore
                 if (canRefresh(true, params.getOnRefreshListener())
-                        && params.mViewDelegate.isReadyForPull(view, event.getX(), event.getY())) {
+                        && params.getViewDelegate().isReadyForPull(view, event.getX(), event.getY())) {
                     mInitialMotionY = (int) event.getY();
-                    mInitialMotionX = (int) event.getY();
+                    mInitialMotionX = (int) event.getX();
                 }
                 break;
             }
