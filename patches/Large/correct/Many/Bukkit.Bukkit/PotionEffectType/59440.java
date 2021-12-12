diff --git a/src/main/java/org/bukkit/potion/PotionEffectType.java b/src/main/java/org/bukkit/potion/PotionEffectType.java
index d43aea5..8a60055 100644
--- a/src/main/java/org/bukkit/potion/PotionEffectType.java
+++ b/src/main/java/org/bukkit/potion/PotionEffectType.java
@@ -12,99 +12,100 @@
     /**
      * Increases movement speed.
      */
-    public static PotionEffectType SPEED = new PotionEffectTypeWrapper(1);
+    public static final PotionEffectType SPEED = new PotionEffectTypeWrapper(1);
 
     /**
      * Decreases movement speed.
      */
-    public static PotionEffectType SLOW = new PotionEffectTypeWrapper(2);
+    public static final PotionEffectType SLOW = new PotionEffectTypeWrapper(2);
 
     /**
      * Increases dig speed.
      */
-    public static PotionEffectType FAST_DIGGING = new PotionEffectTypeWrapper(3);
+    public static final PotionEffectType FAST_DIGGING = new PotionEffectTypeWrapper(3);
 
     /**
      * Decreases dig speed.
      */
-    public static PotionEffectType SLOW_DIGGING = new PotionEffectTypeWrapper(4);
+    public static final PotionEffectType SLOW_DIGGING = new PotionEffectTypeWrapper(4);
 
     /**
      * Increases damage dealt.
      */
-    public static PotionEffectType INCREASE_DAMAGE = new PotionEffectTypeWrapper(5);
+    public static final PotionEffectType INCREASE_DAMAGE = new PotionEffectTypeWrapper(5);
 
     /**
      * Heals an entity.
      */
-    public static PotionEffectType HEAL = new PotionEffectTypeWrapper(6);
+    public static final PotionEffectType HEAL = new PotionEffectTypeWrapper(6);
 
     /**
      * Hurts an entity.
      */
-    public static PotionEffectType HARM = new PotionEffectTypeWrapper(7);
+    public static final PotionEffectType HARM = new PotionEffectTypeWrapper(7);
 
     /**
      * Increases jump height.
      */
-    public static PotionEffectType JUMP = new PotionEffectTypeWrapper(8);
+    public static final PotionEffectType JUMP = new PotionEffectTypeWrapper(8);
 
     /**
      * Warps vision on the client.
      */
-    public static PotionEffectType CONFUSION = new PotionEffectTypeWrapper(9);
+    public static final PotionEffectType CONFUSION = new PotionEffectTypeWrapper(9);
 
     /**
      * Regenerates health.
      */
-    public static PotionEffectType REGENERATION = new PotionEffectTypeWrapper(10);
+    public static final PotionEffectType REGENERATION = new PotionEffectTypeWrapper(10);
 
     /**
      * Decreases damage dealt to an entity.
      */
-    public static PotionEffectType DAMAGE_RESISTANCE = new PotionEffectTypeWrapper(11);
+    public static final PotionEffectType DAMAGE_RESISTANCE = new PotionEffectTypeWrapper(11);
 
     /**
      * Stops fire damage.
      */
-    public static PotionEffectType FIRE_RESISTANCE = new PotionEffectTypeWrapper(12);
+    public static final PotionEffectType FIRE_RESISTANCE = new PotionEffectTypeWrapper(12);
 
     /**
      * Allows breathing underwater.
      */
-    public static PotionEffectType WATER_BREATHING = new PotionEffectTypeWrapper(13);
+    public static final PotionEffectType WATER_BREATHING = new PotionEffectTypeWrapper(13);
 
     /**
-     * Grants invisibility.
+     * Grants invisibility. NOTE: Unusable due to not being implemented by Minecraft.
      */
     @Deprecated
-    public static PotionEffectType INVISIBILITY = new PotionEffectTypeWrapper(14); // unimplemented
+    public static final PotionEffectType INVISIBILITY = new PotionEffectTypeWrapper(14); // unimplemented
 
     /**
      * Blinds an entity.
      */
-    public static PotionEffectType BLINDNESS = new PotionEffectTypeWrapper(15);
+    public static final PotionEffectType BLINDNESS = new PotionEffectTypeWrapper(15);
 
     /**
-     * Allows an entity to see in the dark.
+     * Allows an entity to see in the dark. NOTE: Unusable due to not being 
+     * implemented by Minecraft.
      */
     @Deprecated
-    public static PotionEffectType NIGHT_VISION = new PotionEffectTypeWrapper(16); // unimplemented
+    public static final PotionEffectType NIGHT_VISION = new PotionEffectTypeWrapper(16); // unimplemented
 
     /**
      * Increases hunger.
      */
-    public static PotionEffectType HUNGER = new PotionEffectTypeWrapper(17);
+    public static final PotionEffectType HUNGER = new PotionEffectTypeWrapper(17);
 
     /**
      * Decreases damage dealt by an entity.
      */
-    public static PotionEffectType WEAKNESS = new PotionEffectTypeWrapper(18);
+    public static final PotionEffectType WEAKNESS = new PotionEffectTypeWrapper(18);
 
     /**
      * Deals damage to an entity over time.
      */
-    public static PotionEffectType POISON = new PotionEffectTypeWrapper(19);
+    public static final PotionEffectType POISON = new PotionEffectTypeWrapper(19);
 
     private final int id;
 
