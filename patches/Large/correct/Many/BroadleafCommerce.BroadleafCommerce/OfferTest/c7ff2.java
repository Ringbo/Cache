diff --git a/BroadleafCommerce/src-test/org/broadleafcommerce/offer/test/OfferTest.java b/BroadleafCommerce/src-test/org/broadleafcommerce/offer/test/OfferTest.java
index 1a8c77c..04c416f 100644
--- a/BroadleafCommerce/src-test/org/broadleafcommerce/offer/test/OfferTest.java
+++ b/BroadleafCommerce/src-test/org/broadleafcommerce/offer/test/OfferTest.java
@@ -508,9 +508,9 @@
         offer.setName(offerName);
         offer.setStartDate(new Date());
         Calendar calendar = Calendar.getInstance();
-        calendar.roll(Calendar.DATE, -1);
+        calendar.add(Calendar.DATE, -1);
         offer.setStartDate(calendar.getTime());
-        calendar.roll(Calendar.DATE, 2);
+        calendar.add(Calendar.DATE, 2);
         offer.setEndDate(calendar.getTime());
         offer.setType(offerType);
         offer.setDiscountType(discountType);
