diff --git a/engine/src/main/java/org/terasology/rendering/nui/layouts/MultiRowLayout.java b/engine/src/main/java/org/terasology/rendering/nui/layouts/MultiRowLayout.java
index 259f77a..8fbf0f7 100644
--- a/engine/src/main/java/org/terasology/rendering/nui/layouts/MultiRowLayout.java
+++ b/engine/src/main/java/org/terasology/rendering/nui/layouts/MultiRowLayout.java
@@ -178,7 +178,7 @@
 
         for (int i = 0; i < rows && i < column.size(); ++i) {
             UIWidget widget = column.get(i);
-            Vector2i cellSize = new Vector2i(availableHeight, areaHint.x);
+            Vector2i cellSize = new Vector2i(areaHint.x, availableHeight);
             cellSize.y *= rowHeights[i];
             if (widget != null) {
                 Vector2i contentSize = canvas.calculateRestrictedSize(widget, cellSize);
