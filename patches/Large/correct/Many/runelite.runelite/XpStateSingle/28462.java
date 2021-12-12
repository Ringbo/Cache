diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java b/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java
index 98c956e..b8ddf5f 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java
@@ -53,7 +53,7 @@
 		return toHourly(xpGained);
 	}
 
-	int getActionsHr()
+	private int getActionsHr()
 	{
 		return toHourly(actions);
 	}
@@ -82,12 +82,12 @@
 		return Math.max(60, Duration.between(skillTimeStart, Instant.now()).getSeconds());
 	}
 
-	int getXpRemaining()
+	private int getXpRemaining()
 	{
 		return nextLevelExp - (startXp + xpGained);
 	}
 
-	int getActionsRemaining()
+	private int getActionsRemaining()
 	{
 		if (actionsHistoryInitialized)
 		{
@@ -112,7 +112,7 @@
 		return Integer.MAX_VALUE;
 	}
 
-	int getSkillProgress()
+	private int getSkillProgress()
 	{
 		int currentXp = startXp + xpGained;
 
@@ -121,7 +121,7 @@
 		return (int) ((xpGained / xpGoal) * 100);
 	}
 
-	String getTimeTillLevel()
+	private String getTimeTillLevel()
 	{
 		long seconds = getTimeElapsedInSeconds();
 
