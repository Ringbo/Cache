diff --git a/common/buildcraft/factory/tile/TilePump.java b/common/buildcraft/factory/tile/TilePump.java
index cca5641..96e6d02 100644
--- a/common/buildcraft/factory/tile/TilePump.java
+++ b/common/buildcraft/factory/tile/TilePump.java
@@ -139,7 +139,7 @@
                         count++;
                     }
                 }
-                if (isWater && count > 2) {
+                if (isWater && count >= 2) {
                     IBlockState below = world.getBlockState(posToCheck.down());
                     // Same check as in BlockDynamicLiquid.updateTick:
                     // if that method changes how it checks for adjacent
