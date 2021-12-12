diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandrepair.java b/Essentials/src/com/earth2me/essentials/commands/Commandrepair.java
index cf9e43f..8d1278f 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandrepair.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandrepair.java
@@ -80,7 +80,7 @@
 	private void repairItem(final ItemStack item) throws Exception
 	{
 		final Material material = Material.getMaterial(item.getTypeId());
-		if (material.isBlock() || material.getMaxDurability() < 0)
+		if (material.isBlock() || material.getMaxDurability() < 1)
 		{
 			throw new Exception(_("repairInvalidType"));
 		}
