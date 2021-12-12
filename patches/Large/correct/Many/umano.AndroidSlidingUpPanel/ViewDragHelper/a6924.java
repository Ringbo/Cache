diff --git a/library/src/com/sothree/slidinguppanel/ViewDragHelper.java b/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
index 2b6a966..58a4e82 100644
--- a/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
+++ b/library/src/com/sothree/slidinguppanel/ViewDragHelper.java
@@ -822,7 +822,7 @@
     }
 
     private void clearMotionHistory(int pointerId) {
-        if (mInitialMotionX == null) {
+        if (mInitialMotionX == null || mInitialMotionX.length <= pointerId) {
             return;
         }
         mInitialMotionX[pointerId] = 0;
