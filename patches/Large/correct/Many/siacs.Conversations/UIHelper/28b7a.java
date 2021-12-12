diff --git a/src/eu/siacs/conversations/utils/UIHelper.java b/src/eu/siacs/conversations/utils/UIHelper.java
index 8ab643d..bf7691c 100644
--- a/src/eu/siacs/conversations/utils/UIHelper.java
+++ b/src/eu/siacs/conversations/utils/UIHelper.java
@@ -180,7 +180,7 @@
 			case 4:
 				drawTile(canvas, letters[0], colors[0], fgColor,
 						0, 0, size/2 - 1, size/2 - 1);
-				drawTile(canvas, letters[1], colors[0], fgColor,
+				drawTile(canvas, letters[1], colors[1], fgColor,
 						0, size/2 + 1, size/2 - 1, size);
 				drawTile(canvas, letters[2], colors[2], fgColor,
 						size/2 + 1, 0, size, size/2 - 1);
