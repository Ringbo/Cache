diff --git a/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index fa306f6..f58b7a7 100644
--- a/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/main/java/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -714,9 +714,9 @@
         final int heightMode = MeasureSpec.getMode(heightMeasureSpec);
         final int heightSize = MeasureSpec.getSize(heightMeasureSpec);
 
-        if (widthMode != MeasureSpec.EXACTLY) {
+        if (widthMode != MeasureSpec.EXACTLY && widthMode != MeasureSpec.AT_MOST) {
             throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
-        } else if (heightMode != MeasureSpec.EXACTLY) {
+        } else if (heightMode != MeasureSpec.EXACTLY && heightMode != MeasureSpec.AT_MOST) {
             throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
         }
 
