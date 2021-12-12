diff --git a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
index 5ddf2c9..4e37b58 100644
--- a/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
+++ b/library/src/com/sothree/slidinguppanel/SlidingUpPanelLayout.java
@@ -410,7 +410,7 @@
      */
     public void setCoveredFadeColor(int color) {
         mCoveredFadeColor = color;
-        invalidate();
+        requestLayout();
     }
 
     /**
