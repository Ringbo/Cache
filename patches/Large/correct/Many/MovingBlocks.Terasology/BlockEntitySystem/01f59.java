diff --git a/engine/src/main/java/org/terasology/world/block/entity/BlockEntitySystem.java b/engine/src/main/java/org/terasology/world/block/entity/BlockEntitySystem.java
index d60aea6..dd1afa0 100644
--- a/engine/src/main/java/org/terasology/world/block/entity/BlockEntitySystem.java
+++ b/engine/src/main/java/org/terasology/world/block/entity/BlockEntitySystem.java
@@ -138,8 +138,7 @@
     }
 
     private boolean shouldDropToWorld(CreateBlockDropsEvent event, Block block, BlockDamageModifierComponent blockDamageModifierComponent, EntityRef item) {
-        return !isDirectPickup(block, blockDamageModifierComponent)
-                && !inventoryManager.giveItem(event.getInstigator(), item);
+        return !isDirectPickup(block, blockDamageModifierComponent) || !inventoryManager.giveItem(event.getInstigator(), item);
     }
 
     private boolean isDirectPickup(Block block, BlockDamageModifierComponent blockDamageModifierComponent) {
