diff --git a/common/buildcraft/core/inventory/TransactorSimple.java b/common/buildcraft/core/inventory/TransactorSimple.java
index 08e2a84..11c608c 100644
--- a/common/buildcraft/core/inventory/TransactorSimple.java
+++ b/common/buildcraft/core/inventory/TransactorSimple.java
@@ -40,7 +40,7 @@
 			if(inventory.getStackInSlot(i) == null)
 				continue;
 			
-			if(!inventory.getStackInSlot(i).isItemEqual(stack))
+			if(!inventory.getStackInSlot(i).isItemEqual(stack) || !ItemStack.func_77970_a(inventory.getStackInSlot(i), stack))
 				continue;
 			
 			if(inventory.getStackInSlot(i).stackSize >= inventory.getStackInSlot(i).getMaxStackSize())
@@ -75,7 +75,7 @@
 			return remaining;
 		}
 		
-		if(!inventory.getStackInSlot(slot).isItemEqual(stack))
+		if(!inventory.getStackInSlot(slot).isItemEqual(stack) || !ItemStack.func_77970_a(inventory.getStackInSlot(slot), stack))
 			return 0;
 		
 		int space = inventory.getStackInSlot(slot).getMaxStackSize() - inventory.getStackInSlot(slot).stackSize;
