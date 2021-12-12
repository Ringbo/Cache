diff --git a/common/net/minecraftforge/common/ForgeHooks.java b/common/net/minecraftforge/common/ForgeHooks.java
index ee2e00b..fa1883f 100644
--- a/common/net/minecraftforge/common/ForgeHooks.java
+++ b/common/net/minecraftforge/common/ForgeHooks.java
@@ -379,6 +379,6 @@
         }
 
         Block block = Block.blocksList[world.getBlockId(x, y, z)];
-        return (block == null ? 0 : block.getEnchantPower(world, x, y, z));
+        return (block == null ? 0 : block.getEnchantPowerBonus(world, x, y, z));
     }
 }
