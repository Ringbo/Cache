diff --git a/xchange-examples/src/main/java/org/knowm/xchange/examples/anx/v2/account/WalletHistoryDemo.java b/xchange-examples/src/main/java/org/knowm/xchange/examples/anx/v2/account/WalletHistoryDemo.java
index 0345f0b..7fa7e14 100644
--- a/xchange-examples/src/main/java/org/knowm/xchange/examples/anx/v2/account/WalletHistoryDemo.java
+++ b/xchange-examples/src/main/java/org/knowm/xchange/examples/anx/v2/account/WalletHistoryDemo.java
@@ -26,7 +26,7 @@
     ParamsDigest signatureCreator = ANXV2Digest.createInstance(ANXExchange.getExchangeSpecification().getSecretKey());
 
     ANXWalletHistoryWrapper wallethistory = ANXV2.getWalletHistory(ANXExchange.getExchangeSpecification().getApiKey(), signatureCreator,
-        new CurrentTimeNonceFactory(), "BTC", null);
+        new CurrentTimeNonceFactory(), "BTC", null, null, null);
 
     System.out.println("WalletHistory: " + wallethistory.getANXWalletHistory().toString());
     for (ANXWalletHistoryEntry entry : wallethistory.getANXWalletHistory().getANXWalletHistoryEntries()) {
