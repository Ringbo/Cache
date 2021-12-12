diff --git a/library/src/main/java/com/flaviofaria/kenburnsview/Rects.java b/library/src/main/java/com/flaviofaria/kenburnsview/Rects.java
index c7ef2e1..ffe1042 100644
--- a/library/src/main/java/com/flaviofaria/kenburnsview/Rects.java
+++ b/library/src/main/java/com/flaviofaria/kenburnsview/Rects.java
@@ -30,7 +30,7 @@
     protected static float getRectRatio(RectF rect) {
         float ratio = rect.width() / rect.height();
         // Reduces precision to avoid problems when comparing aspect ratios.
-        ratio = Math.round(ratio * 1000) / 1000;
+        ratio = Math.round(ratio * 1000) / 1000f;
         return ratio;
     }
 }
