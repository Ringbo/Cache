diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/pricing/service/fulfillment/processor/BandedPriceFulfillmentPricingProvider.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/pricing/service/fulfillment/processor/BandedPriceFulfillmentPricingProvider.java
index 37b3949..ad7d8ab 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/pricing/service/fulfillment/processor/BandedPriceFulfillmentPricingProvider.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/pricing/service/fulfillment/processor/BandedPriceFulfillmentPricingProvider.java
@@ -136,14 +136,16 @@
                         //Now, determine if this is a percentage or actual amount
                         FulfillmentBandResultAmountType resultAmountType = band.getResultAmountType();
                         if (FulfillmentBandResultAmountType.RATE.equals(resultAmountType)) {
-                            if (band.getResultAmount().compareTo(fulfillmentAmount) <= 0) {
+                            if (fulfillmentAmount.compareTo(new BigDecimal(0D)) == 0 
+                                    || band.getResultAmount().compareTo(fulfillmentAmount) <= 0) {
                                 //We found a matching option that is cheaper than what we found before
                                 fulfillmentAmount = band.getResultAmount();
                             }
                         } else if (FulfillmentBandResultAmountType.PERCENTAGE.equals(resultAmountType)) {
                             //Since this is a percentage, we calculate the result amount based on retailTotal and the band percentage
                             BigDecimal resultAmount = retailTotal.multiply(band.getResultAmount());
-                            if (resultAmount.compareTo(fulfillmentAmount) <= 0) {
+                            if (fulfillmentAmount.compareTo(new BigDecimal(0D)) == 0 
+                                    || resultAmount.compareTo(fulfillmentAmount) <= 0) {
                                 //We found a matching option that is cheaper than what we found before
                                 fulfillmentAmount = resultAmount;
                             }
