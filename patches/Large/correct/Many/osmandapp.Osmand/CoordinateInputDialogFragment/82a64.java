diff --git a/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java b/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java
index 649eae6..d653058 100644
--- a/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java
+++ b/OsmAnd/src/net/osmand/plus/mapmarkers/CoordinateInputDialogFragment.java
@@ -434,7 +434,7 @@
 		View.OnTouchListener editTextOnTouchListener = new View.OnTouchListener() {
 			@Override
 			public boolean onTouch(View view, MotionEvent motionEvent) {
-				if (useOsmandKeyboard) {
+				if (useOsmandKeyboard || !orientationPortrait) {
 					if (orientationPortrait && !isOsmandKeyboardCurrentlyVisible()) {
 						changeOsmandKeyboardVisibility(true);
 					}
