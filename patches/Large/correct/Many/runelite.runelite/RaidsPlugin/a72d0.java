diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/raids/RaidsPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/raids/RaidsPlugin.java
index babf829..e17047c 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/raids/RaidsPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/raids/RaidsPlugin.java
@@ -210,7 +210,7 @@
 	@Subscribe
 	public void onWidgetHiddenChanged(WidgetHiddenChanged event)
 	{
-		if (event.isHidden())
+		if (!inRaidChambers || event.isHidden())
 		{
 			return;
 		}
