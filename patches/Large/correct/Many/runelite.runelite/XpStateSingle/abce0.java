diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java b/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java
index a04318f..153c53f 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/xptracker/XpStateSingle.java
@@ -210,7 +210,7 @@
 		xpGained = currentXp - startXp;
 
 		// Determine XP goals
-		if (goalStartXp <= 0)
+		if (goalStartXp <= 0 || currentXp > goalEndXp)
 		{
 			startLevelExp = Experience.getXpForLevel(Experience.getLevelForXp(currentXp));
 		}
