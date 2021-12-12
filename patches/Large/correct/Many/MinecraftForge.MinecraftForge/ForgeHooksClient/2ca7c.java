diff --git a/src/main/java/net/minecraftforge/client/ForgeHooksClient.java b/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
index 45ef4d4..56eddd0 100644
--- a/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
+++ b/src/main/java/net/minecraftforge/client/ForgeHooksClient.java
@@ -639,7 +639,7 @@
             changed = slot != slotMainHand;
             slotMainHand = slot;
         }
-        return !from.getItem().shouldCauseReequipAnimation(from, to, changed);
+        return from.getItem().shouldCauseReequipAnimation(from, to, changed);
     }
 
     public static BlockFaceUV applyUVLock(BlockFaceUV blockFaceUV, EnumFacing originalSide, ITransformation rotation)
