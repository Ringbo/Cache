diff --git a/xchange-gateio/src/main/java/org/knowm/xchange/gateio/dto/marketdata/GateioTradeHistory.java b/xchange-gateio/src/main/java/org/knowm/xchange/gateio/dto/marketdata/GateioTradeHistory.java
index 9b5d60b..c1b0998 100644
--- a/xchange-gateio/src/main/java/org/knowm/xchange/gateio/dto/marketdata/GateioTradeHistory.java
+++ b/xchange-gateio/src/main/java/org/knowm/xchange/gateio/dto/marketdata/GateioTradeHistory.java
@@ -46,13 +46,14 @@
     private final GateioOrderType type;
 
     private GateioPublicTrade(
-        @JsonProperty("date") long date,
-        @JsonProperty("price") BigDecimal price,
+        @JsonProperty("date") String date,
+        @JsonProperty("rate") BigDecimal price,
         @JsonProperty("amount") BigDecimal amount,
-        @JsonProperty("tid") String tradeId,
+        @JsonProperty("tradeID") String tradeId,
+        @JsonProperty("timestamp") long timestamp,
         @JsonProperty("type") GateioOrderType type) {
 
-      this.date = date;
+      this.date = timestamp;
       this.price = price;
       this.amount = amount;
       this.tradeId = tradeId;
