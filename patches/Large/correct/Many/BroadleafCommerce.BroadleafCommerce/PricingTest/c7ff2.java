diff --git a/BroadleafCommerce/src-test/org/broadleafcommerce/pricing/test/PricingTest.java b/BroadleafCommerce/src-test/org/broadleafcommerce/pricing/test/PricingTest.java
index c8fd787..f81b881 100644
--- a/BroadleafCommerce/src-test/org/broadleafcommerce/pricing/test/PricingTest.java
+++ b/BroadleafCommerce/src-test/org/broadleafcommerce/pricing/test/PricingTest.java
@@ -199,9 +199,9 @@
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
