diff --git a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshLayout.java b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshLayout.java
index ded70ee..e0d9661 100644
--- a/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshLayout.java
+++ b/library/src/uk/co/senab/actionbarpulltorefresh/library/PullToRefreshLayout.java
@@ -63,7 +63,7 @@
 
             if (attacher != null) {
                 if (DEBUG) Log.d(LOG_TAG, "Adding View to Attacher: " + view);
-                attacher.addRefreshableView(view, null, refreshListener, false);
+                attacher.addRefreshableView(view, null, refreshListener);
             }
         }
 
