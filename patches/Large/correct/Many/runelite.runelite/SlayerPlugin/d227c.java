diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java
index 43eb687..f43625c 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/slayer/SlayerPlugin.java
@@ -283,7 +283,7 @@
 		}
 
 		infoBoxManager.removeIf(t -> t instanceof TaskCounter);
-		if (config.enabled() && config.showInfobox())
+		if (config.enabled() && config.showInfobox() && counter != null)
 		{
 			infoBoxManager.addInfoBox(counter);
 		}
