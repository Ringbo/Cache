diff --git a/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java b/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java
index 582ff97..74f0208 100644
--- a/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java
+++ b/xchange-abucoins/src/main/java/org/knowm/xchange/abucoins/AbucoinsAdapters.java
@@ -279,7 +279,7 @@
                 .id(order.getId())
                 .orderStatus(adaptOrderStatus(order.getStatus()))
                 .originalAmount(order.getSize())
-                .remainingAmount(order.getFilledSize().subtract(order.getSize()))
+                .remainingAmount(order.getSize().subtract(order.getFilledSize()))
                 .timestamp(parseDate(order.getCreatedAt())))
         .build();
   }
