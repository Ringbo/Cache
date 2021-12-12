diff --git a/src/main/java/org/bukkit/Material.java b/src/main/java/org/bukkit/Material.java
index bc089e6..f2624e1 100644
--- a/src/main/java/org/bukkit/Material.java
+++ b/src/main/java/org/bukkit/Material.java
@@ -189,7 +189,7 @@
     SNOW_BALL(332, 16),
     BOAT(333, 1),
     LEATHER(334),
-    MILK_BUCKET(335),
+    MILK_BUCKET(335, 1),
     CLAY_BRICK(336),
     CLAY_BALL(337),
     SUGAR_CANE(338),
@@ -200,20 +200,20 @@
     POWERED_MINECART(343, 1),
     EGG(344, 16),
     COMPASS(345),
-    FISHING_ROD(346, 1, 32),
+    FISHING_ROD(346, 1, 64),
     WATCH(347),
     GLOWSTONE_DUST(348),
-    RAW_FISH(349),
-    COOKED_FISH(350),
+    RAW_FISH(349, 1),
+    COOKED_FISH(350, 1),
     INK_SACK(351, Dye.class),
     BONE(352),
     SUGAR(353),
     CAKE(354, 1),
-    BED(355),
+    BED(355, 1),
     DIODE(356),
-    COOKIE(357),
-    MAP(358),
-    SHEARS(359),
+    COOKIE(357, 8),
+    MAP(358, 1, MaterialData.class),
+    SHEARS(359, 1, 238),
     GOLD_RECORD(2256, 1),
     GREEN_RECORD(2257, 1);
 
