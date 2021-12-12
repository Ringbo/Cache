diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/service/discount/domain/PromotableOrderItemPriceDetailImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/service/discount/domain/PromotableOrderItemPriceDetailImpl.java
index 126efe6..dc95e65 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/service/discount/domain/PromotableOrderItemPriceDetailImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/service/discount/domain/PromotableOrderItemPriceDetailImpl.java
@@ -136,7 +136,7 @@
             Money retailAdjustmentPrice = calculateRetailAdjustmentUnitPrice();
             
             if (promotableOrderItem.isOnSale()) {
-                if (saleAdjustmentPrice.lessThan(retailAdjustmentPrice)) {
+                if (saleAdjustmentPrice.lessThanOrEqual(retailAdjustmentPrice)) {
                     this.useSaleAdjustments = Boolean.TRUE;
                     adjustedTotal = saleAdjustmentPrice;
                 } else {
