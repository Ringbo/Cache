diff --git a/wallettemplate/src/main/java/wallettemplate/Controller.java b/wallettemplate/src/main/java/wallettemplate/Controller.java
index a6bd124..715bc61 100644
--- a/wallettemplate/src/main/java/wallettemplate/Controller.java
+++ b/wallettemplate/src/main/java/wallettemplate/Controller.java
@@ -91,6 +91,6 @@
 
     public void refreshBalanceLabel() {
         final Coin amount = bitcoin.wallet().getBalance(Wallet.BalanceType.ESTIMATED);
-        balance.setText(amount.toFriendlyString());
+        balance.setText(amount.toPlainString());
     }
 }
