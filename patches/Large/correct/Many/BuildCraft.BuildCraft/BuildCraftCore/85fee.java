diff --git a/common/buildcraft/BuildCraftCore.java b/common/buildcraft/BuildCraftCore.java
index d89cee7..6d3007b 100644
--- a/common/buildcraft/BuildCraftCore.java
+++ b/common/buildcraft/BuildCraftCore.java
@@ -264,7 +264,7 @@
 	@PostInit
 	public void postInit(FMLPostInitializationEvent event){
 		for(Block block : Block.blocksList) {
-			if(block instanceof BlockFluid || block instanceof BlockGrass){
+			if(block instanceof BlockFluid || block instanceof BlockTallGrass){
 				BuildCraftAPI.softBlocks[block.blockID] = true;
 			}
 		}
