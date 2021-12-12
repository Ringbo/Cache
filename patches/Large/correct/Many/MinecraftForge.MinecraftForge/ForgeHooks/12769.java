diff --git a/src/main/java/net/minecraftforge/common/ForgeHooks.java b/src/main/java/net/minecraftforge/common/ForgeHooks.java
index fe1acd8..11c336f 100644
--- a/src/main/java/net/minecraftforge/common/ForgeHooks.java
+++ b/src/main/java/net/minecraftforge/common/ForgeHooks.java
@@ -819,7 +819,7 @@
 
                     world.markAndNotifyBlock(snap.getPos(), null, oldBlock, newBlock, updateFlag);
                 }
-                player.addStat(StatList.getCraftStats(itemstack.getItem()));
+                player.addStat(StatList.getObjectUseStats(itemstack.getItem()));
             }
         }
         world.capturedBlockSnapshots.clear();
