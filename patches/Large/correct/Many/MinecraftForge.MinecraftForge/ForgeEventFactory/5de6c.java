diff --git a/src/main/java/net/minecraftforge/event/ForgeEventFactory.java b/src/main/java/net/minecraftforge/event/ForgeEventFactory.java
index 30d5654..7560e93 100644
--- a/src/main/java/net/minecraftforge/event/ForgeEventFactory.java
+++ b/src/main/java/net/minecraftforge/event/ForgeEventFactory.java
@@ -336,7 +336,7 @@
 
     public static boolean canInteractWith(EntityPlayer player, Entity entity)
     {
-        return MinecraftForge.EVENT_BUS.post(new EntityInteractEvent(player, entity));
+        return !MinecraftForge.EVENT_BUS.post(new EntityInteractEvent(player, entity));
     }
 
     public static EnumStatus onPlayerSleepInBed(EntityPlayer player, BlockPos pos)
