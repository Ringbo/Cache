diff --git a/common/net/minecraftforge/fluids/BlockFluidClassic.java b/common/net/minecraftforge/fluids/BlockFluidClassic.java
index 4defe7f..b5349ca 100644
--- a/common/net/minecraftforge/fluids/BlockFluidClassic.java
+++ b/common/net/minecraftforge/fluids/BlockFluidClassic.java
@@ -128,9 +128,10 @@
                 }
             }
         }
-        else if (quantaRemaining > quantaPerBlock)
+        // This is a "source" block, set meta to zero, and send a server only update
+        else if (quantaRemaining >= quantaPerBlock)
         {
-            world.setBlockMetadataWithNotify(x, y, z, 0, 3);
+            world.setBlockMetadataWithNotify(x, y, z, 0, 2);
         }
 
         // Flow vertically if possible
