diff --git a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
index fd55666..de9e324 100644
--- a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
+++ b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshAttacher.java
@@ -622,7 +622,7 @@
     }
 
     private void setRefreshingInt(View view, boolean refreshing, boolean fromTouch) {
-        clearRefreshableViews();
+        checkIfDestroyed();
 
         if (DEBUG) Log.d(LOG_TAG, "setRefreshingInt: " + refreshing);
         // Check to see if we need to do anything
