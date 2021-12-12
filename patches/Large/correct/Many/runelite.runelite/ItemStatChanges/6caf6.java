diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
index f28bb33..34b291b 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
@@ -88,7 +88,7 @@
 		add(food(maxHP -> (int) Math.ceil(maxHP * .05)), WATERMELON_SLICE);
 		add(food(perc(.1, 1)), COOKED_SWEETCORN, SWEETCORN_7088 /* Bowl of cooked sweetcorn */);
 		add(combo(food(1), boost(DEFENCE, perc(.02, 1))), CABBAGE_1967 /* Draynor Manor */);
-		add(combo(2, food(4), heal(RUN_ENERGY, 5)), PAPAYA_FRUIT);
+		add(combo(2, food(8), heal(RUN_ENERGY, 5)), PAPAYA_FRUIT);
 		add(range(food(5), food(7)), THIN_SNAIL_MEAT);
 		add(range(food(7), food(9)), FAT_SNAIL_MEAT);
 
