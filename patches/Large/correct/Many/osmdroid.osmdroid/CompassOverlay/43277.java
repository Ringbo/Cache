diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/compass/CompassOverlay.java b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/compass/CompassOverlay.java
index 9871ca2..bb9b6c4 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/compass/CompassOverlay.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/compass/CompassOverlay.java
@@ -106,17 +106,18 @@
     private void invalidateCompass()
     {
         Rect screenRect = mMapView.getProjection().getScreenRect();
-        final int frameLeft = screenRect.left + (mMapView.getWidth() / 2)
+		final int frameLeft = screenRect.left
                 + (int) FloatMath.ceil((mCompassCenterX - mCompassFrameCenterX) * mScale);
-        final int frameTop = screenRect.top + (mMapView.getHeight() / 2)
+		final int frameTop = screenRect.top
                 + (int) FloatMath.ceil((mCompassCenterY - mCompassFrameCenterY) * mScale);
-        final int frameRight = screenRect.left + (mMapView.getWidth() / 2)
+		final int frameRight = screenRect.left
                 + (int) FloatMath.ceil((mCompassCenterX + mCompassFrameCenterX) * mScale);
-        final int frameBottom = screenRect.top + (mMapView.getHeight() / 2)
+		final int frameBottom = screenRect.top
                 + (int) FloatMath.ceil((mCompassCenterY + mCompassFrameCenterY) * mScale);
 
         // Expand by 2 to cover stroke width
-        mMapView.postInvalidate(frameLeft - 2, frameTop - 2, frameRight + 2, frameBottom + 2);
+		mMapView.invalidateMapCoordinates(frameLeft - 2, frameTop - 2, frameRight + 2,
+				frameBottom + 2);
     }
 
     // ===========================================================
