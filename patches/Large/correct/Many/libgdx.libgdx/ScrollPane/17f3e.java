diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java
index 18812af..b693ca9 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/ScrollPane.java
@@ -488,7 +488,7 @@
 		else
 			y -= (int)(maxY - visualAmountY);
 
-		if (scrollbarsOnTop && scrollX) {
+		if (!fadeScrollBars && scrollbarsOnTop && scrollX) {
 			float scrollbarHeight = 0;
 			if (style.hScrollKnob != null) scrollbarHeight = style.hScrollKnob.getMinHeight();
 			if (style.hScroll != null) scrollbarHeight = Math.max(scrollbarHeight, style.hScroll.getMinHeight());
