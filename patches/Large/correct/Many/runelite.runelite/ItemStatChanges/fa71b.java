diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
index 3d353d3..6510fbb 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
@@ -104,7 +104,7 @@
 		add(boost(STRENGTH, perc(.10, 3)), STRENGTH_POTION1, STRENGTH_POTION2, STRENGTH_POTION3, STRENGTH_POTION4);
 		add(boost(DEFENCE, perc(.10, 3)), DEFENCE_POTION1, DEFENCE_POTION2, DEFENCE_POTION3, DEFENCE_POTION4);
 		add(boost(MAGIC, 4), MAGIC_POTION1, MAGIC_POTION2, MAGIC_POTION3, MAGIC_POTION4);
-		add(boost(RANGED, perc(.10, 3)), RANGING_POTION1, RANGING_POTION2, RANGING_POTION3, RANGING_POTION4);
+		add(boost(RANGED, perc(.10, 4)), RANGING_POTION1, RANGING_POTION2, RANGING_POTION3, RANGING_POTION4);
 		add(combo(2, boost(ATTACK, perc(.10, 3)), boost(STRENGTH, perc(.10, 3))), COMBAT_POTION1, COMBAT_POTION2, COMBAT_POTION3, COMBAT_POTION4);
 		add(boost(ATTACK, perc(.15, 5)), SUPER_ATTACK1, SUPER_ATTACK2, SUPER_ATTACK3, SUPER_ATTACK4);
 		add(boost(STRENGTH, perc(.15, 5)), SUPER_STRENGTH1, SUPER_STRENGTH2, SUPER_STRENGTH3, SUPER_STRENGTH4);
