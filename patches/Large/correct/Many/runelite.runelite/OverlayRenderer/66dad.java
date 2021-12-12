diff --git a/runelite-client/src/main/java/net/runelite/client/ui/overlay/OverlayRenderer.java b/runelite-client/src/main/java/net/runelite/client/ui/overlay/OverlayRenderer.java
index 00c400a..d991ee3 100644
--- a/runelite-client/src/main/java/net/runelite/client/ui/overlay/OverlayRenderer.java
+++ b/runelite-client/src/main/java/net/runelite/client/ui/overlay/OverlayRenderer.java
@@ -228,7 +228,7 @@
 							bottomLeftPoint.x += dimension.width + (dimension.width == 0 ? 0 : PADDING);
 							break;
 						case BOTTOM_RIGHT:
-							bottomRightPoint.x -= dimension.width - (dimension.width == 0 ? 0 : PADDING);
+							bottomRightPoint.x -= dimension.width + (dimension.width == 0 ? 0 : PADDING);
 							break;
 						case TOP_LEFT:
 							topLeftPoint.y += dimension.height + (dimension.height == 0 ? 0 : PADDING);
