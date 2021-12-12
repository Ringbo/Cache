diff --git a/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/processor/ItemOfferProcessorTest.java b/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/processor/ItemOfferProcessorTest.java
index b950efb..3adbeae 100644
--- a/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/processor/ItemOfferProcessorTest.java
+++ b/core/broadleaf-framework/src/test/java/org/broadleafcommerce/core/offer/service/processor/ItemOfferProcessorTest.java
@@ -453,7 +453,7 @@
 
         // Try again with two offers.   The second should be applied.    
         offerService.applyOffersToOrder(offerListWithTwoOffers, order);
-        assertTrue(checkOrderItemOfferAppliedCount(order) == 1);
+        assertTrue(checkOrderItemOfferAppliedCount(order) == 2);
 
         // Trying with 2nd offer as nonCombinable.
         offer1.setCombinableWithOtherOffers(true);
