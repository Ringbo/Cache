diff --git a/src/main/java/net/minecraftforge/fml/common/registry/VillagerRegistry.java b/src/main/java/net/minecraftforge/fml/common/registry/VillagerRegistry.java
index f23f68a..e0efec9 100644
--- a/src/main/java/net/minecraftforge/fml/common/registry/VillagerRegistry.java
+++ b/src/main/java/net/minecraftforge/fml/common/registry/VillagerRegistry.java
@@ -356,7 +356,7 @@
     {
         if (prof == null)
         {
-            if (entity.func_189777_di() != ZombieType.NORMAL)
+            if (entity.func_189777_di() != ZombieType.NORMAL && entity.func_189777_di() != ZombieType.HUSK)
                 entity.func_189778_a(ZombieType.NORMAL);
             return;
         }
