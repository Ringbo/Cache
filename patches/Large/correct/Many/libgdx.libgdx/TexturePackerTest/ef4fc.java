diff --git a/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/TexturePackerTest.java b/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/TexturePackerTest.java
index 47e83d2..06543fb 100644
--- a/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/TexturePackerTest.java
+++ b/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/TexturePackerTest.java
@@ -81,15 +81,15 @@
 		int x = 20, y = 20;
 		for (Page page : pages) {
 			renderer.setColor(Color.GRAY);
-			renderer.begin(ShapeType.FilledRectangle);
+			renderer.begin(ShapeType.Filled);
 			for (int i = 0; i < page.outputRects.size; i++) {
 				Rect rect = page.outputRects.get(i);
-				renderer.filledRect(x + rect.x + settings.paddingX, y + rect.y + settings.paddingY, rect.width - settings.paddingX,
+				renderer.rect(x + rect.x + settings.paddingX, y + rect.y + settings.paddingY, rect.width - settings.paddingX,
 					rect.height - settings.paddingY);
 			}
 			renderer.end();
 			renderer.setColor(Color.RED);
-			renderer.begin(ShapeType.Rectangle);
+			renderer.begin(ShapeType.Line);
 			for (int i = 0; i < page.outputRects.size; i++) {
 				Rect rect = page.outputRects.get(i);
 				renderer.rect(x + rect.x + settings.paddingX, y + rect.y + settings.paddingY, rect.width - settings.paddingX,
