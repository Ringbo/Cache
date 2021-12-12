diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextArea.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextArea.java
index fcc0952..b310bff 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextArea.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/TextArea.java
@@ -88,7 +88,7 @@
 				int i = start;
 				for (; i < end; i++)
 					if (glyphPositions[i] > x) break;
-				if (glyphPositions[i] - x <= x - glyphPositions[i - 1]) return i;
+				if (i > 0 && glyphPositions[i] - x <= x - glyphPositions[i - 1]) return i;
 				return Math.max(0, i - 1);
 			}
 		} else {
