diff --git a/common/net/minecraftforge/common/ForgeInternalHandler.java b/common/net/minecraftforge/common/ForgeInternalHandler.java
index 16c5169..c7020d9 100644
--- a/common/net/minecraftforge/common/ForgeInternalHandler.java
+++ b/common/net/minecraftforge/common/ForgeInternalHandler.java
@@ -20,7 +20,7 @@
                 {
                     entity.setDead();
                     event.setCanceled(true);
-                    event.world.spawnEntityInWorld(entity);
+                    event.world.spawnEntityInWorld(newEntity);
                 }
             }
         }
