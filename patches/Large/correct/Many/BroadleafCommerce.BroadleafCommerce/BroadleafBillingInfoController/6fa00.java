diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafBillingInfoController.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafBillingInfoController.java
index 0e92e5e..940c1bb 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafBillingInfoController.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafBillingInfoController.java
@@ -71,7 +71,7 @@
 
             if (customerPayment != null) {
                 Address address = customerPayment.getBillingAddress();
-                if (address == null) {
+                if (address != null) {
                     copyAddressToBillingAddress(billingForm, address);
                 }
             }
