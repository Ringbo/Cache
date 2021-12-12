diff --git a/core/java/android/view/ScaleGestureDetector.java b/core/java/android/view/ScaleGestureDetector.java
index ff34f4a..0999598 100644
--- a/core/java/android/view/ScaleGestureDetector.java
+++ b/core/java/android/view/ScaleGestureDetector.java
@@ -312,7 +312,7 @@
      * MotionEvent has no getRawX(int) method; simulate it pending future API approval. 
      */
     private static float getRawX(MotionEvent event, int pointerIndex) {
-        float offset = event.getX() - event.getRawX();
+        float offset = event.getRawX() - event.getX();
         return event.getX(pointerIndex) + offset;
     }
     
@@ -320,7 +320,7 @@
      * MotionEvent has no getRawY(int) method; simulate it pending future API approval. 
      */
     private static float getRawY(MotionEvent event, int pointerIndex) {
-        float offset = event.getY() - event.getRawY();
+        float offset = event.getRawY() - event.getY();
         return event.getY(pointerIndex) + offset;
     }
 
