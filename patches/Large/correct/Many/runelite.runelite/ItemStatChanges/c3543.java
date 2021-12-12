diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
index caf10ae..76c3fc7 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
@@ -124,7 +124,7 @@
 		add(boost(DEFENCE, perc(.15, 5)), SUPER_DEFENCE1, SUPER_DEFENCE2, SUPER_DEFENCE3, SUPER_DEFENCE4);
 		add(boost(MAGIC, 3), MAGIC_ESSENCE1, MAGIC_ESSENCE2, MAGIC_ESSENCE3, MAGIC_ESSENCE4);
 		add(combo(3, boost(ATTACK, perc(.15, 5)), boost(STRENGTH, perc(.15, 5)), boost(DEFENCE, perc(.15, 5))), SUPER_COMBAT_POTION1, SUPER_COMBAT_POTION2, SUPER_COMBAT_POTION3, SUPER_COMBAT_POTION4);
-		add(combo(3, boost(ATTACK, perc(.20, 2)), boost(STRENGTH, perc(.12, 2)), heal(PRAYER, perc(.10, 0)), heal(DEFENCE, perc(.10, -2)), heal(HITPOINTS, perc(.12, 0))), ZAMORAK_BREW1, ZAMORAK_BREW2, ZAMORAK_BREW3, ZAMORAK_BREW4);
+		add(combo(3, boost(ATTACK, perc(.20, 2)), boost(STRENGTH, perc(.12, 2)), heal(PRAYER, perc(.10, 0)), heal(DEFENCE, perc(.10, -2)), heal(HITPOINTS, perc(-.12, 0))), ZAMORAK_BREW1, ZAMORAK_BREW2, ZAMORAK_BREW3, ZAMORAK_BREW4);
 		add(new SaradominBrew(0.15, 0.2, 0.1, 2), SARADOMIN_BREW1, SARADOMIN_BREW2, SARADOMIN_BREW3, SARADOMIN_BREW4);
 		add(boost(RANGED, perc(.15, 5)), SUPER_RANGING_1, SUPER_RANGING_2, SUPER_RANGING_3, SUPER_RANGING_4);
 		add(boost(MAGIC, perc(.15, 5)), SUPER_MAGIC_POTION_1, SUPER_MAGIC_POTION_2, SUPER_MAGIC_POTION_3, SUPER_MAGIC_POTION_4);
