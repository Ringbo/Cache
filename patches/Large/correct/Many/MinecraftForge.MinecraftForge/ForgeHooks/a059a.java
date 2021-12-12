diff --git a/src/main/java/net/minecraftforge/common/ForgeHooks.java b/src/main/java/net/minecraftforge/common/ForgeHooks.java
index b84a095..5dc730c 100644
--- a/src/main/java/net/minecraftforge/common/ForgeHooks.java
+++ b/src/main/java/net/minecraftforge/common/ForgeHooks.java
@@ -326,7 +326,7 @@
 
     public static boolean onLivingAttack(EntityLivingBase entity, DamageSource src, float amount)
     {
-        return MinecraftForge.EVENT_BUS.post(new LivingAttackEvent(entity, src, amount));
+        return !MinecraftForge.EVENT_BUS.post(new LivingAttackEvent(entity, src, amount));
     }
 
     public static float onLivingHurt(EntityLivingBase entity, DamageSource src, float amount)
