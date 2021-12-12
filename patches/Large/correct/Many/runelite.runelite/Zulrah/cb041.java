diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/zulrah/Zulrah.java b/runelite-client/src/main/java/net/runelite/client/plugins/zulrah/Zulrah.java
index 275f7d5..a475fc5 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/zulrah/Zulrah.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/zulrah/Zulrah.java
@@ -93,7 +93,7 @@
 
 	private synchronized void update()
 	{
-		if (client.getGameState() != GameState.LOGGED_IN)
+		if (client == null || client.getGameState() != GameState.LOGGED_IN)
 		{
 			return;
 		}
