diff --git a/common/buildcraft/transport/blueprints/BptItemPipeFilters.java b/common/buildcraft/transport/blueprints/BptItemPipeFilters.java
index cbe8754..e51cad9 100644
--- a/common/buildcraft/transport/blueprints/BptItemPipeFilters.java
+++ b/common/buildcraft/transport/blueprints/BptItemPipeFilters.java
@@ -27,7 +27,7 @@
 		SimpleInventory newInv = new SimpleInventory(54, "Filters", 1);
 		inv.readFromNBT(slot.cpt);
 
-		for (int dir = 2; dir <= 5; ++dir) {
+		for (int dir = 0; dir <= 5; ++dir) {
 			ForgeDirection r = ForgeDirection.values()[dir].getRotation(ForgeDirection.UP);
 
 			for (int s = 0; s < 9; ++s) {
