diff --git a/xchange-cexio/src/main/java/org/knowm/xchange/cexio/service/CexIOTradeServiceRaw.java b/xchange-cexio/src/main/java/org/knowm/xchange/cexio/service/CexIOTradeServiceRaw.java
index 0aec694..0d07917 100644
--- a/xchange-cexio/src/main/java/org/knowm/xchange/cexio/service/CexIOTradeServiceRaw.java
+++ b/xchange-cexio/src/main/java/org/knowm/xchange/cexio/service/CexIOTradeServiceRaw.java
@@ -92,7 +92,7 @@
         .equals(true);
   }
 
-  public List<CexIOArchivedOrder> archivedOrders(TradeHistoryParams tradeHistoryParams) throws HttpStatusIOException {
+  public List<CexIOArchivedOrder> archivedOrders(TradeHistoryParams tradeHistoryParams) throws IOException {
     String baseCcy = null;
     String counterCcy = null;
     Integer limit = null;
