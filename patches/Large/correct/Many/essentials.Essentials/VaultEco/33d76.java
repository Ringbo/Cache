diff --git a/Essentials/src/com/earth2me/essentials/register/payment/methods/VaultEco.java b/Essentials/src/com/earth2me/essentials/register/payment/methods/VaultEco.java
index 3d66c2f..45606c2 100644
--- a/Essentials/src/com/earth2me/essentials/register/payment/methods/VaultEco.java
+++ b/Essentials/src/com/earth2me/essentials/register/payment/methods/VaultEco.java
@@ -126,7 +126,7 @@
 			RegisteredServiceProvider<Economy> ecoPlugin = plugin.getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
 			return plugin instanceof Vault && ecoPlugin != null && !ecoPlugin.getProvider().getName().equals("Essentials Economy");
 		}
-		catch (Exception e)
+		catch (Throwable e)
 		{
 			return false;
 		}
