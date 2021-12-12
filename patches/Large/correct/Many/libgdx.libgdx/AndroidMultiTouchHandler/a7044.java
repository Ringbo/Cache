diff --git a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidMultiTouchHandler.java b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidMultiTouchHandler.java
index 751e237..8ad2754 100644
--- a/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidMultiTouchHandler.java
+++ b/backends/gdx-backend-android/src/com/badlogic/gdx/backends/android/AndroidMultiTouchHandler.java
@@ -41,7 +41,7 @@
 			case MotionEvent.ACTION_DOWN:
 			case MotionEvent.ACTION_POINTER_DOWN:
 				realPointerIndex = input.getFreePointerIndex(); // get a free pointer index as reported by Input.getX() etc.
-				if (realPointerIndex > AndroidInput.NUM_TOUCHES) break;
+				if (realPointerIndex >= AndroidInput.NUM_TOUCHES) break;
 				input.realId[realPointerIndex] = pointerId;
 				x = (int)event.getX(pointerIndex);
 				y = (int)event.getY(pointerIndex);
@@ -59,7 +59,7 @@
 			case MotionEvent.ACTION_CANCEL:
 				realPointerIndex = input.lookUpPointerIndex(pointerId);
 				if (realPointerIndex == -1) break;
-				if (realPointerIndex > AndroidInput.NUM_TOUCHES) break;
+				if (realPointerIndex >= AndroidInput.NUM_TOUCHES) break;
 				input.realId[realPointerIndex] = -1;
 				x = (int)event.getX(pointerIndex);
 				y = (int)event.getY(pointerIndex);
@@ -80,7 +80,7 @@
 					y = (int)event.getY(pointerIndex);
 					realPointerIndex = input.lookUpPointerIndex(pointerId);
 					if (realPointerIndex == -1) continue;
-					if (realPointerIndex > AndroidInput.NUM_TOUCHES) break;
+					if (realPointerIndex >= AndroidInput.NUM_TOUCHES) break;
 					postTouchEvent(input, TouchEvent.TOUCH_DRAGGED, x, y, realPointerIndex, timeStamp);
 					input.deltaX[realPointerIndex] = x - input.touchX[realPointerIndex];
 					input.deltaY[realPointerIndex] = y - input.touchY[realPointerIndex];
