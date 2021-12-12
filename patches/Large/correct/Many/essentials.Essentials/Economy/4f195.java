diff --git a/Essentials/src/com/earth2me/essentials/api/Economy.java b/Essentials/src/com/earth2me/essentials/api/Economy.java
index 3aaeab4..26cebfc 100644
--- a/Essentials/src/com/earth2me/essentials/api/Economy.java
+++ b/Essentials/src/com/earth2me/essentials/api/Economy.java
@@ -285,7 +285,7 @@
 		}
 		getCurrency();
 		getCurrencyPlural();
-		return formed + " " + ((amount <= 1 && amount >= -1) ? ess.getSettings().getCurrency() : ess.getSettings().getCurrency());
+		return formed + " " + ((amount <= 1 && amount >= -1) ? ess.getSettings().getCurrency() : ess.getSettings().getCurrencyPlural());
 	}
 
 	//************************!WARNING!**************************
