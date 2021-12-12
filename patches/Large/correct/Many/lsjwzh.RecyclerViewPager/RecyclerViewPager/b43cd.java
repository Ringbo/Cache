diff --git a/lib/src/main/java/com/lsjwzh/widget/recyclerviewpager/RecyclerViewPager.java b/lib/src/main/java/com/lsjwzh/widget/recyclerviewpager/RecyclerViewPager.java
index cbac4b6..cab16fa 100644
--- a/lib/src/main/java/com/lsjwzh/widget/recyclerviewpager/RecyclerViewPager.java
+++ b/lib/src/main/java/com/lsjwzh/widget/recyclerviewpager/RecyclerViewPager.java
@@ -383,7 +383,7 @@
 
     @Override
     public boolean dispatchTouchEvent(MotionEvent ev) {
-        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
+        if (ev.getAction() == MotionEvent.ACTION_DOWN && getLayoutManager() != null) {
             mPositionOnTouchDown = getLayoutManager().canScrollHorizontally()
                     ? ViewUtils.getCenterXChildPosition(this)
                     : ViewUtils.getCenterYChildPosition(this);
