diff --git a/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java b/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
index 0974bd7..7fc9a4a 100755
--- a/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
+++ b/forge/forge_common/net/minecraft/src/forge/MinecraftForge.java
@@ -61,7 +61,7 @@
         return false;
     }
 
-    public void addPixaxeBlockEffectiveAgainst (Block block) {
+    public static void addPixaxeBlockEffectiveAgainst (Block block) {
         ((ItemTool) Item.pickaxeWood).addBlockEffectiveAgainst(block);
         ((ItemTool) Item.pickaxeStone).addBlockEffectiveAgainst(block);
         ((ItemTool) Item.pickaxeSteel).addBlockEffectiveAgainst(block);
