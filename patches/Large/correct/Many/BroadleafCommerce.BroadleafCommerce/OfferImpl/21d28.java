diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java
index 668dd8c..b604ecd 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/OfferImpl.java
@@ -680,7 +680,7 @@
     @JsonIgnore
     public OfferDeliveryType getDeliveryType() {
         if (deliveryType == null) {
-            if (getRequiresCode()) {
+            if (!getRequiresCode()) {
                 return OfferDeliveryType.AUTOMATIC;
             } else {
                 return OfferDeliveryType.MANUAL;
