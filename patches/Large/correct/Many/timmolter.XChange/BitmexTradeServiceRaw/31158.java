diff --git a/xchange-bitmex/src/main/java/org/knowm/xchange/bitmex/service/BitmexTradeServiceRaw.java b/xchange-bitmex/src/main/java/org/knowm/xchange/bitmex/service/BitmexTradeServiceRaw.java
index bab8df6..848830f 100755
--- a/xchange-bitmex/src/main/java/org/knowm/xchange/bitmex/service/BitmexTradeServiceRaw.java
+++ b/xchange-bitmex/src/main/java/org/knowm/xchange/bitmex/service/BitmexTradeServiceRaw.java
@@ -84,7 +84,7 @@
         exchange.getNonceFactory(),
         signatureCreator,
         symbol,
-        side == null ? null : side.toString(),
+        side == null ? null : side.getCapitalized(),
         orderQuantity.intValue(),
         null,
         null,
