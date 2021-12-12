diff --git a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/ItemizedOverlay.java b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/ItemizedOverlay.java
index 96851e8..202da32 100644
--- a/osmdroid-android/src/main/java/org/osmdroid/views/overlay/ItemizedOverlay.java
+++ b/osmdroid-android/src/main/java/org/osmdroid/views/overlay/ItemizedOverlay.java
@@ -112,7 +112,7 @@
 			return;
 		}
 		
-		if (!mPendingFocusChangedEvent && mOnFocusChangeListener != null)
+		if (mPendingFocusChangedEvent && mOnFocusChangeListener != null)
 			mOnFocusChangeListener.onFocusChanged(this, mFocusedItem);
 		mPendingFocusChangedEvent = false;
 
@@ -180,7 +180,7 @@
 		Overlay.drawAt(canvas, marker, curScreenCoords.x, curScreenCoords.y, false);
 	}
 
-	private Drawable getDefaultMarker(final int state) {
+	protected Drawable getDefaultMarker(final int state) {
 		OverlayItem.setState(mDefaultMarker, state);
 		return mDefaultMarker;
 	}
