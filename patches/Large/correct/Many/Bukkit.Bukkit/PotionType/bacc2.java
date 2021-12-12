diff --git a/src/main/java/org/bukkit/potion/PotionType.java b/src/main/java/org/bukkit/potion/PotionType.java
index f9a19cf..46921c2 100644
--- a/src/main/java/org/bukkit/potion/PotionType.java
+++ b/src/main/java/org/bukkit/potion/PotionType.java
@@ -12,7 +12,7 @@
     STRENGTH(9, PotionEffectType.INCREASE_DAMAGE, 2),
     SLOWNESS(10, PotionEffectType.SLOW, 1),
     INSTANT_DAMAGE(12, PotionEffectType.HARM, 2),
-    INVISIBILTY(14, PotionEffectType.INVISIBILITY, 1),
+    INVISIBILITY(14, PotionEffectType.INVISIBILITY, 1),
     ;
 
     private final int damageValue, maxLevel;
