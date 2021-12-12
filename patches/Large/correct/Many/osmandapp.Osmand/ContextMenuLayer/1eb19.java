diff --git a/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java b/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
index 03dcb8f..148ac8c 100644
--- a/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
+++ b/OsmAnd/src/net/osmand/plus/views/ContextMenuLayer.java
@@ -105,7 +105,7 @@
 			canvas.translate(-tx, -ty);
 			
 			if (textView.getText().length() > 0) {
-				canvas.translate(x - textView.getWidth() / 2, ty - textView.getTop());
+				canvas.translate(x - textView.getWidth() / 2, ty - textView.getBottom());
 				int c = textView.getLineCount();
 				
 				textView.draw(canvas);
