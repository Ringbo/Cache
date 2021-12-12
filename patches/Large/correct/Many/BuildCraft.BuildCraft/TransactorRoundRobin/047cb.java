diff --git a/common/buildcraft/core/inventory/TransactorRoundRobin.java b/common/buildcraft/core/inventory/TransactorRoundRobin.java
index 37e288b..bf638cf 100644
--- a/common/buildcraft/core/inventory/TransactorRoundRobin.java
+++ b/common/buildcraft/core/inventory/TransactorRoundRobin.java
@@ -21,7 +21,7 @@
 			int minSimilar = Integer.MAX_VALUE;
 			int minSlot = -1;
 			
-			for (int j = 0; j < inventory.getSizeInventory() && minSlot > 1; ++j) {
+			for (int j = 0; j < inventory.getSizeInventory() && minSimilar > 1; ++j) {
 				ItemStack stackInInventory = inventory.getStackInSlot(j);
 
 				if(stackInInventory == null)
