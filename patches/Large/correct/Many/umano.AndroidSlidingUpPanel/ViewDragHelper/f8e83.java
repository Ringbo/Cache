diff --git a/library/src/com/sothree/slidinguppanel/ViewDragHelper.java b/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
index 768c8a7..5821bfe 100644
--- a/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
+++ b/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
@@ -871,7 +871,7 @@
         if (mDragState != state) {
             mDragState = state;
             mCallback.onViewDragStateChanged(state);
-            if (state == STATE_IDLE) {
+            if (mDragState == STATE_IDLE) {
                 mCapturedView = null;
             }
         }
