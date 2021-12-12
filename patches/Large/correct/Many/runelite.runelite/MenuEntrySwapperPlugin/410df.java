diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/menuentryswapper/MenuEntrySwapperPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/menuentryswapper/MenuEntrySwapperPlugin.java
index b329dac..d089a67 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/menuentryswapper/MenuEntrySwapperPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/menuentryswapper/MenuEntrySwapperPlugin.java
@@ -392,7 +392,7 @@
 		{
 			swap("investigate", option, target, true);
 		}
-		else if (config.swapBones() && option.equals("bury"))
+		else if (config.swapChase() && option.equals("pick-up"))
 		{
 			swap("chase", option, target, true);
 		}
