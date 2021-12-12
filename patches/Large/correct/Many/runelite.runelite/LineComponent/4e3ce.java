diff --git a/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/LineComponent.java b/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/LineComponent.java
index a76d20f..efe7f40 100644
--- a/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/LineComponent.java
+++ b/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/LineComponent.java
@@ -105,7 +105,7 @@
 				leftLineComponent.render(graphics);
 
 				final TextComponent rightLineComponent = new TextComponent();
-				rightLineComponent.setPosition(new Point(x + leftSmallWidth + rightFullWidth - getLineWidth(rightText, metrics), y));
+				rightLineComponent.setPosition(new Point(x + leftSmallWidth + rightSmallWidth - getLineWidth(rightText, metrics), y));
 				rightLineComponent.setText(rightText);
 				rightLineComponent.setColor(rightColor);
 				rightLineComponent.render(graphics);
