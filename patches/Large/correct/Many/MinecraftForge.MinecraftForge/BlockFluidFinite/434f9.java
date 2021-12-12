diff --git a/src/main/java/net/minecraftforge/fluids/BlockFluidFinite.java b/src/main/java/net/minecraftforge/fluids/BlockFluidFinite.java
index 3c51795..46498d5 100644
--- a/src/main/java/net/minecraftforge/fluids/BlockFluidFinite.java
+++ b/src/main/java/net/minecraftforge/fluids/BlockFluidFinite.java
@@ -233,9 +233,9 @@
                 {
                     IBlockState state = world.getBlockState(other);
                     world.setBlockState(other, myState.withProperty(LEVEL, amtToInput - 1), 3);
-                    world.setBlockState(other, state, 3);
+                    world.setBlockState(pos, state, 3);
                     world.scheduleUpdate(other, this,  tickRate);
-                    world.scheduleUpdate(other, state.getBlock(), state.getBlock().tickRate(world));
+                    world.scheduleUpdate(pos, state.getBlock(), state.getBlock().tickRate(world));
                     return 0;
                 }
             }
