diff --git a/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java b/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java
index d5ecd34..5ae21d5 100644
--- a/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java
+++ b/xchange-core/src/main/java/org/knowm/xchange/dto/trade/LimitOrder.java
@@ -273,7 +273,7 @@
     public LimitOrder build() {
 
       LimitOrder order;
-      if (remainingAmount != null) {
+      if (remainingAmount != null && originalAmount != null) {
         order =
             new LimitOrder(
                 orderType,
