diff --git a/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/OfferDataItemProvider.java b/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/OfferDataItemProvider.java
index 821b857..e225e90 100644
--- a/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/OfferDataItemProvider.java
+++ b/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/OfferDataItemProvider.java
@@ -735,7 +735,7 @@
         offer.setApplyDiscountToSalePrice(applyToSalePrice);
         offer.setCombinableWithOtherOffers(combinableWithOtherOffers);
         offer.setDeliveryType(deliveryType);
-        offer.setRequiresCode(OfferDeliveryType.AUTOMATIC==deliveryType);
+        offer.setRequiresCode(OfferDeliveryType.AUTOMATIC!=deliveryType);
         offer.setDiscountType(type);
         offer.setEndDate(endDate);
         offer.setMaxUses(maxUses);
