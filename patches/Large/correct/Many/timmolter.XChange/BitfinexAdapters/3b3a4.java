diff --git a/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java b/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java
index 75207c3..9c4f5b0 100644
--- a/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java
+++ b/xchange-bitfinex/src/main/java/com/xeiam/xchange/bitfinex/v1/BitfinexAdapters.java
@@ -130,7 +130,7 @@
 				activeOrders.length);
 
 		for (BitfinexOrderStatusResponse order : activeOrders) {
-			OrderType orderType = order.getSide().equals("buy") ? OrderType.BID
+			OrderType orderType = order.getSide().equalsIgnoreCase("buy") ? OrderType.BID
 					: OrderType.ASK;
 			String tradableIdentifier = order.getSymbol().substring(0, 3)
 					.toUpperCase();
@@ -158,7 +158,7 @@
 				.toUpperCase();
 
 		for(BitfinexTradeResponse trade : trades) {
-			OrderType orderType = trade.getType().equals("buy") ? OrderType.BID
+			OrderType orderType = trade.getType().equalsIgnoreCase("buy") ? OrderType.BID
 					: OrderType.ASK;
 			
 			long id = trade.hashCode();
