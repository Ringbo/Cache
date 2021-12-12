diff --git a/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java b/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java
index 3b6aaff..ad69cc2 100644
--- a/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java
+++ b/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java
@@ -266,7 +266,7 @@
         .limitPrice(order.getPrice())
         .orderStatus(adaptOrderStatus(order.getStatus()))
         .originalAmount(order.getSize())
-        .remainingAmount(order.getFilledSize().subtract(order.getSize()))
+        .remainingAmount(order.getSize().subtract(order.getFilledSize()))
         .timestamp(parseDate(order.getCreatedAt()))
         .build();
   }
