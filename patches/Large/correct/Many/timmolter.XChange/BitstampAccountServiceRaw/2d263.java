diff --git a/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampAccountServiceRaw.java b/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampAccountServiceRaw.java
index 7311d88..5808772 100644
--- a/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampAccountServiceRaw.java
+++ b/xchange-bitstamp/src/main/java/org/knowm/xchange/bitstamp/service/BitstampAccountServiceRaw.java
@@ -246,7 +246,7 @@
 
     try {
       final BitstampDepositAddress response =
-          bitstampAuthenticated.getBitcoinDepositAddress(
+          bitstampAuthenticated.getBitcoinCashDepositAddress(
               exchange.getExchangeSpecification().getApiKey(),
               signatureCreator,
               exchange.getNonceFactory());
