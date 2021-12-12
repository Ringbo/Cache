diff --git a/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java b/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java
index 6e4d1ac..7af0d01 100644
--- a/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java
+++ b/library/src/main/java/com/lorentzos/flingswipe/SwipeFlingAdapterView.java
@@ -124,7 +124,7 @@
     */
     private void setTopView() {
         if(getChildCount()>0){
-            TextView tv = (TextView) getChildAt(LAST_OBJECT_IN_STACK);
+            View tv = getChildAt(LAST_OBJECT_IN_STACK);
             if(tv!=null) {
                 FlingCardListener flingCardListener = new FlingCardListener(tv, getWidth(), tv.getX(),
                         tv.getY(), tv.getHeight(), tv.getWidth(), this) ;
