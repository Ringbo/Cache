diff --git a/xchange-btcmarkets/src/test/java/org/knowm/xchange/btcmarkets/service/BTCMarketsTradeServiceTest.java b/xchange-btcmarkets/src/test/java/org/knowm/xchange/btcmarkets/service/BTCMarketsTradeServiceTest.java
index a77fd61..e9378bd 100644
--- a/xchange-btcmarkets/src/test/java/org/knowm/xchange/btcmarkets/service/BTCMarketsTradeServiceTest.java
+++ b/xchange-btcmarkets/src/test/java/org/knowm/xchange/btcmarkets/service/BTCMarketsTradeServiceTest.java
@@ -74,7 +74,7 @@
             "generatedReqId");
 
     BTCMarketsPlaceOrderResponse orderResponse =
-        new BTCMarketsPlaceOrderResponse(true, null, 0, "11111", 12345);
+        new BTCMarketsPlaceOrderResponse(true, null, 0, "11111", 12345L);
 
     BTCMarketsAuthenticated btcm = mock(BTCMarketsAuthenticated.class);
     PowerMockito.when(
@@ -117,7 +117,7 @@
             "generatedReqId");
 
     BTCMarketsPlaceOrderResponse orderResponse =
-        new BTCMarketsPlaceOrderResponse(true, null, 0, "11111", 12345);
+        new BTCMarketsPlaceOrderResponse(true, null, 0, "11111", 12345L);
 
     BTCMarketsAuthenticated btcm = mock(BTCMarketsAuthenticated.class);
     PowerMockito.when(
