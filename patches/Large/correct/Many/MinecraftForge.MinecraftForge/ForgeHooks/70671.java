diff --git a/common/net/minecraftforge/common/ForgeHooks.java b/common/net/minecraftforge/common/ForgeHooks.java
index 4a54f72..7916f10 100644
--- a/common/net/minecraftforge/common/ForgeHooks.java
+++ b/common/net/minecraftforge/common/ForgeHooks.java
@@ -365,7 +365,7 @@
             int mX = MathHelper.floor_double(bb.minX);
             int mY = MathHelper.floor_double(bb.minY);
             int mZ = MathHelper.floor_double(bb.minZ);
-            for (int y2 = mY; y < bb.maxY; y2++)
+            for (int y2 = mY; y2 < bb.maxY; y2++)
             {
                 for (int x2 = mX; x2 < bb.maxX; x2++)
                 {
