diff --git a/Essentials/src/com/earth2me/essentials/commands/Commandsell.java b/Essentials/src/com/earth2me/essentials/commands/Commandsell.java
index 07338e0..554bb4a 100644
--- a/Essentials/src/com/earth2me/essentials/commands/Commandsell.java
+++ b/Essentials/src/com/earth2me/essentials/commands/Commandsell.java
@@ -155,7 +155,7 @@
 
 		//TODO: Prices for Enchantments
 		final ItemStack ris = is.clone();
-		is.setAmount(amount);
+		ris.setAmount(amount);
 		InventoryWorkaround.removeItem(user.getInventory(), true, ris);
 		user.updateInventory();
 		Trade.log("Command", "Sell", "Item", user.getName(), new Trade(ris, ess), user.getName(), new Trade(worth * amount, ess), user.getLocation(), ess);
