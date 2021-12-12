diff --git a/services/core/java/com/android/server/policy/SystemGesturesPointerEventListener.java b/services/core/java/com/android/server/policy/SystemGesturesPointerEventListener.java
index b06fe58..80e4341 100644
--- a/services/core/java/com/android/server/policy/SystemGesturesPointerEventListener.java
+++ b/services/core/java/com/android/server/policy/SystemGesturesPointerEventListener.java
@@ -89,7 +89,7 @@
 
     @Override
     public void onPointerEvent(MotionEvent event) {
-        if (mGestureDetector != null) {
+        if (mGestureDetector != null && event.isTouchEvent()) {
             mGestureDetector.onTouchEvent(event);
         }
         switch (event.getActionMasked()) {
