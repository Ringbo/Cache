diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java
index d7629dd..73596c9 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java
@@ -283,7 +283,7 @@
 		int itemSpriteId = ItemID.ENCHANTED_GEM;
 		if (task == null)
 		{
-			log.warn("No slayer task for {} in the Task database", taskName);
+			log.debug("No slayer task for {} in the Task database", taskName);
 		}
 		else
 		{
