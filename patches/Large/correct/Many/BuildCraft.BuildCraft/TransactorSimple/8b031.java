diff --git a/common/buildcraft/core/inventory/TransactorSimple.java b/common/buildcraft/core/inventory/TransactorSimple.java
index 3aeff78..a6a0ba2 100644
--- a/common/buildcraft/core/inventory/TransactorSimple.java
+++ b/common/buildcraft/core/inventory/TransactorSimple.java
@@ -45,7 +45,7 @@
 				continue;
 			}
 
-			if (inventory.getStackInSlot(i).stackSize >= inventory.getStackInSlot(i).getMaxStackSize()) {
+			if (inventory.getStackInSlot(i).stackSize >= inventory.getStackInSlot(i).getMaxStackSize() || inventory.getStackInSlot(i).stackSize >= inventory.getInventoryStackLimit()) {
 				continue;
 			}
 
