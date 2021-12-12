diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/clanchat/ClanChatPlugin.java b/runelite-client/src/main/java/net/runelite/client/plugins/clanchat/ClanChatPlugin.java
index 56a27d0..790e548 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/clanchat/ClanChatPlugin.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/clanchat/ClanChatPlugin.java
@@ -146,7 +146,7 @@
 	@Subscribe
 	public void onSetMessage(SetMessage setMessage)
 	{
-		if (client.getGameState() != GameState.LOGGED_IN)
+		if (client.getGameState() != GameState.LOADING && client.getGameState() != GameState.LOGGED_IN)
 		{
 			return;
 		}
