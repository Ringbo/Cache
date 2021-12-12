diff --git a/common/buildcraft/transport/ItemFacade.java b/common/buildcraft/transport/ItemFacade.java
index e2c6a07..871a71c 100644
--- a/common/buildcraft/transport/ItemFacade.java
+++ b/common/buildcraft/transport/ItemFacade.java
@@ -80,7 +80,7 @@
 		}
 
 		ItemStack stack = new ItemStack(block, 1, meta);
-		ItemStack stackAlt = new ItemStack(blockAlt, 1, meta);
+		ItemStack stackAlt = new ItemStack(blockAlt, 1, metaAlt);
 
 		if (getType(itemstack) == TYPE_BASIC) {
 			if (Item.getItemFromBlock(block) != null) {
