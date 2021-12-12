diff --git a/library/src/main/java/com/github/lzyzsd/circleprogress/ArcProgress.java b/library/src/main/java/com/github/lzyzsd/circleprogress/ArcProgress.java
index ed3388d..9d2b893 100644
--- a/library/src/main/java/com/github/lzyzsd/circleprogress/ArcProgress.java
+++ b/library/src/main/java/com/github/lzyzsd/circleprogress/ArcProgress.java
@@ -98,7 +98,7 @@
         unfinishedStrokeColor = attributes.getColor(R.styleable.ArcProgress_arc_unfinished_color, default_unfinished_color);
         textColor = attributes.getColor(R.styleable.ArcProgress_arc_text_color, default_text_color);
         textSize = attributes.getDimension(R.styleable.ArcProgress_arc_text_size, default_text_size);
-        arcAngle = attributes.getDimension(R.styleable.ArcProgress_arc_angle, default_arc_angle);
+        arcAngle = attributes.getFloat(R.styleable.ArcProgress_arc_angle, default_arc_angle);
         setMax(attributes.getInt(R.styleable.ArcProgress_arc_max, default_max));
         setProgress(attributes.getInt(R.styleable.ArcProgress_arc_progress, 0));
         strokeWidth = attributes.getDimension(R.styleable.ArcProgress_arc_stroke_width, default_stroke_width);
