diff --git a/Essentials/src/com/earth2me/essentials/Trade.java b/Essentials/src/com/earth2me/essentials/Trade.java
index 502d3e3..730037d 100644
--- a/Essentials/src/com/earth2me/essentials/Trade.java
+++ b/Essentials/src/com/earth2me/essentials/Trade.java
@@ -58,7 +58,7 @@
 	{
 		if (getMoney() != null
 			&& getMoney() > 0
-			&& user.canAfford(getMoney()))
+			&& !user.canAfford(getMoney()))
 		{
 			throw new ChargeException(_("notEnoughMoney"));
 		}
@@ -72,7 +72,7 @@
 		double money;
 		if (command != null && !command.isEmpty()
 			&& 0 < (money = getCommandCost(user))
-			&& user.canAfford(money))
+			&& !user.canAfford(money))
 		{
 			throw new ChargeException(_("notEnoughMoney"));
 		}
