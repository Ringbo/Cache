diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XPTracker.java b/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XPTracker.java
index a0504ce..3770715 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XPTracker.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XPTracker.java
@@ -59,7 +59,8 @@
 	@Subscribe
 	public void onGameStateChanged(GameStateChanged event)
 	{
-		if (event.getGameState() != GameState.LOGGED_IN)
+		//reset upon login
+		if (event.getGameState() == GameState.LOGGED_IN)
 			xpPanel.resetAllSkillXpHr();
 	}
 
