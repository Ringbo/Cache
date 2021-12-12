diff --git a/xchange-bankera/src/main/java/org/knowm/xchange/bankera/BankeraAdapters.java b/xchange-bankera/src/main/java/org/knowm/xchange/bankera/BankeraAdapters.java
index 8b7c032..95ac678 100644
--- a/xchange-bankera/src/main/java/org/knowm/xchange/bankera/BankeraAdapters.java
+++ b/xchange-bankera/src/main/java/org/knowm/xchange/bankera/BankeraAdapters.java
@@ -181,7 +181,7 @@
                       trade.getSide().equalsIgnoreCase("buy") ? OrderType.BID : OrderType.ASK,
                       new BigDecimal(trade.getAmount()),
                       pair,
-                      new BigDecimal(trade.getTotal()),
+                      new BigDecimal(trade.getPrice()),
                       new Date(Long.valueOf(trade.getCompletedAt())),
                       String.valueOf(trade.getId()),
                       String.valueOf(trade.getOrderId()),
