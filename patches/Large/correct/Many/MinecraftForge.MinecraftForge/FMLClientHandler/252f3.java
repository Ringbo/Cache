diff --git a/fml/client/cpw/mods/fml/client/FMLClientHandler.java b/fml/client/cpw/mods/fml/client/FMLClientHandler.java
index 908ad06..fefcc5d 100644
--- a/fml/client/cpw/mods/fml/client/FMLClientHandler.java
+++ b/fml/client/cpw/mods/fml/client/FMLClientHandler.java
@@ -278,7 +278,7 @@
             }
 
             entity.field_70157_k = packet.entityId;
-            entity.func_70056_a(packet.scaledX, packet.scaledY, packet.scaledZ, packet.scaledYaw, packet.scaledPitch, 1);
+            entity.func_70012_b(packet.scaledX, packet.scaledY, packet.scaledZ, packet.scaledYaw, packet.scaledPitch);
 
             if (entity instanceof EntityLiving)
             {
