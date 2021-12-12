diff --git a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
index 436a978..ca40226 100644
--- a/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
+++ b/library/src/main/java/com/h6ah4i/android/widget/advrecyclerview/draggable/DraggingItemDecorator.java
@@ -421,7 +421,7 @@
                 View.MeasureSpec.makeMeasureSpec(viewWidth, View.MeasureSpec.EXACTLY),
                 View.MeasureSpec.makeMeasureSpec(viewHeight, View.MeasureSpec.EXACTLY));
 
-        v.layout(viewTop, viewLeft, viewLeft + viewWidth, viewTop + viewHeight);
+        v.layout(viewLeft, viewTop, viewLeft + viewWidth, viewTop + viewHeight);
 
         final Bitmap bitmap = Bitmap.createBitmap(canvasWidth, canvasHeight, Bitmap.Config.ARGB_8888);
 
