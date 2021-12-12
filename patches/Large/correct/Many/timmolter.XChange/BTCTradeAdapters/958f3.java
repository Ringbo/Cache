diff --git a/xchange-btctrade/src/main/java/com/xeiam/xchange/btctrade/BTCTradeAdapters.java b/xchange-btctrade/src/main/java/com/xeiam/xchange/btctrade/BTCTradeAdapters.java
index c2be805..75eeaa7 100644
--- a/xchange-btctrade/src/main/java/com/xeiam/xchange/btctrade/BTCTradeAdapters.java
+++ b/xchange-btctrade/src/main/java/com/xeiam/xchange/btctrade/BTCTradeAdapters.java
@@ -146,7 +146,7 @@
 
     checkException(balance);
 
-    List<Wallet> wallets = new ArrayList<Wallet>(4);
+    List<Wallet> wallets = new ArrayList<Wallet>(5);
     wallets.add(new Wallet(Currencies.BTC, nullSafeSum(balance.getBtcBalance(), balance.getBtcReserved())));
     wallets.add(new Wallet(Currencies.LTC, nullSafeSum(balance.getLtcBalance(), balance.getLtcReserved())));
     wallets.add(new Wallet(Currencies.DOGE, nullSafeSum(balance.getDogeBalance(), balance.getDogeReserved())));
