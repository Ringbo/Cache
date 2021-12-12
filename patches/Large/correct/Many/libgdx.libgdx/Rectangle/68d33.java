diff --git a/gdx/src/com/badlogic/gdx/math/Rectangle.java b/gdx/src/com/badlogic/gdx/math/Rectangle.java
index 6086c67..5c0cf3e 100644
--- a/gdx/src/com/badlogic/gdx/math/Rectangle.java
+++ b/gdx/src/com/badlogic/gdx/math/Rectangle.java
@@ -101,8 +101,8 @@
 		float ymin = rectangle.y;
 		float ymax = ymin + rectangle.height;
 
-		return ((xmin > x && xmin < x + width) || (xmax > x && xmax < x + width))
-			&& ((ymin > y && ymin < y + height) || (ymax > y && ymax < y + height));
+		return ((xmin > x && xmin < x + width) && (xmax > x && xmax < x + width))
+			&& ((ymin > y && ymin < y + height) && (ymax > y && ymax < y + height));
 	}
 
 	/** @param rectangle the other {@link Rectangle}
