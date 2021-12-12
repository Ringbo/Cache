diff --git a/src/org/anddev/andengine/input/touch/detector/ScrollDetector.java b/src/org/anddev/andengine/input/touch/detector/ScrollDetector.java
index 6f4631b..3856d75 100644
--- a/src/org/anddev/andengine/input/touch/detector/ScrollDetector.java
+++ b/src/org/anddev/andengine/input/touch/detector/ScrollDetector.java
@@ -81,7 +81,7 @@
 			case MotionEvent.ACTION_MOVE:
 			case MotionEvent.ACTION_UP:
 			case MotionEvent.ACTION_CANCEL:
-				if(this.mPointerID != TouchEvent.INVALID_POINTER_ID) {
+				if(this.mPointerID == TouchEvent.INVALID_POINTER_ID) {
 					this.prepareScroll(pSceneTouchEvent.getPointerID(), touchX, touchY);
 					return true;
 				} else if(this.mPointerID == pSceneTouchEvent.getPointerID()) {
