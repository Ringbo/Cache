diff --git a/library/src/com/sothree/slidinguppanel/ViewDragHelper.java b/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
index 48b90ab..e48a395 100644
--- a/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
+++ b/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
@@ -873,7 +873,7 @@
         if (mDragState != state) {
             mDragState = state;
             mCallback.onViewDragStateChanged(state);
-            if (state == STATE_IDLE) {
+            if (mDragState == STATE_IDLE) {
                 mCapturedView = null;
             }
         }
