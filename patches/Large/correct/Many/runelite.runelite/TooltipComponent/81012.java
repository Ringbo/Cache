diff --git a/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/TooltipComponent.java b/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/TooltipComponent.java
index 5c4ecf4..25f5036 100644
--- a/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/TooltipComponent.java
+++ b/runelite-client/src/main/java/net/runelite/client/ui/overlay/components/TooltipComponent.java
@@ -225,7 +225,7 @@
 
 		for (int y2 = 0; y2 < modIcon.getHeight(); y2++)
 		{
-			for (int x2 = 0; x2 < modIcon.getOriginalWidth(); x2++)
+			for (int x2 = 0; x2 < modIcon.getWidth(); x2++)
 			{
 				int index = modIcon.getPixels()[sourceOffset++] & 0xff;
 
