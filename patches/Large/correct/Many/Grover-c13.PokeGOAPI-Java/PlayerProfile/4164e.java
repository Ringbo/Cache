diff --git a/library/src/main/java/com/pokegoapi/api/player/PlayerProfile.java b/library/src/main/java/com/pokegoapi/api/player/PlayerProfile.java
index 8a0347e..d07b73c 100644
--- a/library/src/main/java/com/pokegoapi/api/player/PlayerProfile.java
+++ b/library/src/main/java/com/pokegoapi/api/player/PlayerProfile.java
@@ -155,9 +155,9 @@
 		contactSettings = new ContactSettings(playerData.getContactSettings());
 
 		// maybe something more graceful?
-		for (CurrencyOuterClass.Currency currency : playerData.getCurrenciesList()) {
+		for (CurrencyOuterClass.Currency currency : playerData.getCurrencyBalanceList()) {
 			try {
-				addCurrency(currency.getName(), currency.getAmount());
+				addCurrency(currency.getCurrencyType(), currency.getQuantity());
 			} catch (InvalidCurrencyException e) {
 				Log.w(TAG, "Error adding currency. You can probably ignore this.", e);
 			}
