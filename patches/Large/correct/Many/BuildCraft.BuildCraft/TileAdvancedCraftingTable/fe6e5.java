diff --git a/common/buildcraft/silicon/tile/TileAdvancedCraftingTable.java b/common/buildcraft/silicon/tile/TileAdvancedCraftingTable.java
index 948ac98..344478d 100644
--- a/common/buildcraft/silicon/tile/TileAdvancedCraftingTable.java
+++ b/common/buildcraft/silicon/tile/TileAdvancedCraftingTable.java
@@ -44,7 +44,7 @@
         if (world.isRemote) {
             return;
         }
-        if (power > POWER_REQ) {
+        if (power >= POWER_REQ) {
             power -= POWER_REQ;
             craft();
         }
