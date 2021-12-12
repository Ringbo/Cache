diff --git a/common/buildcraft/core/blueprints/BptBuilderBlueprint.java b/common/buildcraft/core/blueprints/BptBuilderBlueprint.java
index 0118e60..de68fa5 100644
--- a/common/buildcraft/core/blueprints/BptBuilderBlueprint.java
+++ b/common/buildcraft/core/blueprints/BptBuilderBlueprint.java
@@ -283,7 +283,7 @@
 			boolean smallStack = reqStk.stackSize == 1;
 			ItemStack usedStack = reqStk;
 			int size = inv.getSizeInventory();
-			for (int i = 0; i <= size; ++i) {
+			for (int i = 0; i < size; ++i) {
 				if (!inv.isBuildingMaterial(i)) {
 
 				}
