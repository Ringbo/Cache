diff --git a/xchange-kucoin/src/main/java/org/knowm/xchange/kucoin/dto/KucoinAdapters.java b/xchange-kucoin/src/main/java/org/knowm/xchange/kucoin/dto/KucoinAdapters.java
index bd88dda..8f4fdc7 100644
--- a/xchange-kucoin/src/main/java/org/knowm/xchange/kucoin/dto/KucoinAdapters.java
+++ b/xchange-kucoin/src/main/java/org/knowm/xchange/kucoin/dto/KucoinAdapters.java
@@ -48,8 +48,8 @@
     KucoinTicker kcTick = tickResponse.getData();
     return new Ticker.Builder()
         .currencyPair(pair)
-        .ask(kcTick.getBuy())
-        .bid(kcTick.getSell())
+        .bid(kcTick.getBuy())
+        .ask(kcTick.getSell())
         .high(kcTick.getHigh())
         .low(kcTick.getLow())
         .last(kcTick.getLastDealPrice())
