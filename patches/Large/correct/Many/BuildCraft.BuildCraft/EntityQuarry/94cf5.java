diff --git a/common/buildcraft/builders/entity/EntityQuarry.java b/common/buildcraft/builders/entity/EntityQuarry.java
index 049b6d9..1d8a17a 100644
--- a/common/buildcraft/builders/entity/EntityQuarry.java
+++ b/common/buildcraft/builders/entity/EntityQuarry.java
@@ -70,7 +70,7 @@
 
     @Override
     protected void readEntityFromNBT(NBTTagCompound compound) {
-        dataManager.set(TILE_POS, NBTUtils.readBlockPos(compound.getCompoundTag("tile_pos")));
+        dataManager.set(TILE_POS, NBTUtils.readBlockPos(compound.getTag("tile_pos")));
         dataManager.set(TYPE, compound.getInteger("type"));
     }
 
