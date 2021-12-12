diff --git a/xchange-hitbtc/src/main/java/org/knowm/xchange/hitbtc/v2/service/HitbtcTradeServiceRaw.java b/xchange-hitbtc/src/main/java/org/knowm/xchange/hitbtc/v2/service/HitbtcTradeServiceRaw.java
index ae5cae3..d917ab8 100644
--- a/xchange-hitbtc/src/main/java/org/knowm/xchange/hitbtc/v2/service/HitbtcTradeServiceRaw.java
+++ b/xchange-hitbtc/src/main/java/org/knowm/xchange/hitbtc/v2/service/HitbtcTradeServiceRaw.java
@@ -111,7 +111,7 @@
   }
 
   public List<HitbtcOwnTrade> getTradeHistoryRaw(
-      String symbol, HitbtcSort sort, Long fromId, Date tillId, Integer limit, long offset)
+      String symbol, HitbtcSort sort, Long fromId, Long tillId, Integer limit, long offset)
       throws IOException {
     String sortValue = sort != null ? sort.toString().toUpperCase() : null;
     String fromValue = fromId != null ? fromId.toString() : null;
@@ -122,7 +122,7 @@
   public HitbtcOrder getHitbtcOrder(String symbol, String clientOrderId) throws IOException {
     List<HitbtcOrder> orders = hitbtc.getHitbtcOrder(symbol, clientOrderId);
 
-    if (orders == null || orders.size() == 0) {
+    if (orders == null || orders.isEmpty()) {
       return null;
     } else {
       return orders.iterator().next();
