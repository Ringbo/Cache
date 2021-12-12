diff --git a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
index 784033a..32d170f 100644
--- a/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
+++ b/runelite-client/src/main/java/net/runelite/client/plugins/itemstats/ItemStatChanges.java
@@ -66,7 +66,7 @@
 			TOAD_CRUNCHIES, EGG_AND_TOMATO, LECKISH_FISH_2, PRAEL_BAT_1, PEACH);
 		add(food(9), PREMADE_P_PUNCH, PINEAPPLE_PUNCH, PREMADE_FR_BLAST, FRUIT_BLAST, SALMON, ANCHOVY_PIZZA,
 			_12_ANCHOVY_PIZZA);
-		add(food(10), TUNA, COOKED_SWEETCORN, CRAB_MEAT, CHOPPED_TUNA, COOKED_CHOMPY);
+		add(food(10), TUNA, CRAB_MEAT, CHOPPED_TUNA, COOKED_CHOMPY);
 		add(food(11), JUG_OF_WINE, RAINBOW_FISH, STEW, PINEAPPLE_PIZZA, _12_PINEAPPLE_PIZZA, COOKED_FISHCAKE,
 			PREMADE_VEG_BATTA, VEGETABLE_BATTA, PREMADE_WM_BATTA, WORM_BATTA, PREMADE_TD_BATTA, TOAD_BATTA, PREMADE_CT_BATTA,
 			CHEESETOM_BATTA, PREMADE_FRT_BATTA, FRUIT_BATTA, MUSHROOM__ONION, GIRAL_BAT_2, LAVA_EEL);
@@ -86,8 +86,8 @@
 		add(food(maxHP -> (int) Math.ceil(maxHP * .06)), STRAWBERRY);
 		add(food(maxHP -> (int) Math.ceil(maxHP * .05)), WATERMELON_SLICE);
 		add(food(perc(.1, 0)), COOKED_SLIMY_EEL);
-		add(food(perc(.1, 1)), SWEETCORN, SWEETCORN_7088);
-		add(combo(food(1), boost(DEFENCE, perc(.02, 1))), CABBAGE_1967);
+		add(food(perc(.1, 1)), COOKED_SWEETCORN, SWEETCORN_7088 /* Bowl of cooked sweetcorn */);
+		add(combo(food(1), boost(DEFENCE, perc(.02, 1))), CABBAGE_1967 /* Draynor Manor */);
 		add(combo(2, food(4), heal(RUN_ENERGY, 5)), PAPAYA_FRUIT);
 
 		// Alcoholic Gnome Cocktails
