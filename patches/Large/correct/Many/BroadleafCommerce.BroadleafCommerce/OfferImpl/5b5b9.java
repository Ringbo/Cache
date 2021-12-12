diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java
index dfd812e..35ebce3 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java
@@ -781,7 +781,7 @@
     @JsonIgnore
     public OfferDeliveryType getDeliveryType() {
         if (deliveryType == null) {
-            if (!isAutomaticallyAdded()) {
+            if (isAutomaticallyAdded()) {
                 return OfferDeliveryType.AUTOMATIC;
             } else {
                 return OfferDeliveryType.MANUAL;
