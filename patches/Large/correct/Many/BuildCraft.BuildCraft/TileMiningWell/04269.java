diff --git a/common/buildcraft/factory/tile/TileMiningWell.java b/common/buildcraft/factory/tile/TileMiningWell.java
index f39d39d..e473c32 100644
--- a/common/buildcraft/factory/tile/TileMiningWell.java
+++ b/common/buildcraft/factory/tile/TileMiningWell.java
@@ -37,7 +37,7 @@
         if(hardness == 0) {
             hardness = 0.1F;
         }
-        progress += 1000 / hardness;
+        progress += 10 / hardness;
         if(progress > 100) {
             progress = 0;
             if(!worldObj.isAirBlock(currentPos)) {
