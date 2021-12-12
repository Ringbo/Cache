diff --git a/xchange-therock/src/main/java/org/knowm/xchange/therock/service/polling/TheRockMarketDataService.java b/xchange-therock/src/main/java/org/knowm/xchange/therock/service/polling/TheRockMarketDataService.java
index b2cccdc..e293d50 100644
--- a/xchange-therock/src/main/java/org/knowm/xchange/therock/service/polling/TheRockMarketDataService.java
+++ b/xchange-therock/src/main/java/org/knowm/xchange/therock/service/polling/TheRockMarketDataService.java
@@ -28,7 +28,7 @@
   public Ticker getTicker(CurrencyPair currencyPair, Object... args) throws IOException {
     TheRockTicker t = getTheRockTicker(new TheRock.Pair(currencyPair));
     return new Ticker.Builder().currencyPair(currencyPair).last(t.getLast()).bid(t.getBid()).ask(t.getAsk()).high(t.getHigh()).low(t.getLow())
-        .volume(t.getVolume()).timestamp(new Date()).build();
+        .volume(t.getVolumeTraded()).timestamp(new Date()).build();
   }
 
   @Override
