diff --git a/core/java/com/android/internal/view/TooltipPopup.java b/core/java/com/android/internal/view/TooltipPopup.java
index 3930214..d38ea2c 100644
--- a/core/java/com/android/internal/view/TooltipPopup.java
+++ b/core/java/com/android/internal/view/TooltipPopup.java
@@ -93,7 +93,7 @@
 
     private void computePosition(View anchorView, int anchorX, int anchorY, boolean fromTouch,
             WindowManager.LayoutParams outParams) {
-        outParams.token = anchorView.getWindowToken();
+        outParams.token = anchorView.getApplicationWindowToken();
 
         final int tooltipPreciseAnchorThreshold = mContext.getResources().getDimensionPixelOffset(
                 com.android.internal.R.dimen.tooltip_precise_anchor_threshold);
