diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/payment/service/DefaultPaymentGatewayCheckoutService.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/payment/service/DefaultPaymentGatewayCheckoutService.java
index 700e3c2..e3ba207 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/payment/service/DefaultPaymentGatewayCheckoutService.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/payment/service/DefaultPaymentGatewayCheckoutService.java
@@ -238,7 +238,7 @@
             //TODO: what happens if State and Country cannot be found?
             State state = stateService.findStateByAbbreviation(billToDTO.getAddressStateRegion());
             if (state == null) {
-                Log.warn("The given state from the response: " + billToDTO.getAddressStateRegion() + " could not be found"
+                LOG.warn("The given state from the response: " + billToDTO.getAddressStateRegion() + " could not be found"
                         + " as a state abbreviation in BLC_STATE");
             }
             billingAddress.setState(state);
@@ -247,7 +247,7 @@
 
             Country country = countryService.findCountryByAbbreviation(billToDTO.getAddressCountryCode());
             if (country == null) {
-                Log.warn("The given country from the response: " + billToDTO.getAddressCountryCode() + " could not be found"
+                LOG.warn("The given country from the response: " + billToDTO.getAddressCountryCode() + " could not be found"
                         + " as a country abbreviation in BLC_COUNTRY");
             }
             billingAddress.setCountry(country);
@@ -277,7 +277,7 @@
 
             State state = stateService.findStateByAbbreviation(shipToDTO.getAddressStateRegion());
             if (state == null) {
-                Log.warn("The given state from the response: " + shipToDTO.getAddressStateRegion() + " could not be found"
+                LOG.warn("The given state from the response: " + shipToDTO.getAddressStateRegion() + " could not be found"
                         + " as a state abbreviation in BLC_STATE");
             }
             shippingAddress.setState(state);
@@ -286,7 +286,7 @@
 
             Country country = countryService.findCountryByAbbreviation(shipToDTO.getAddressCountryCode());
             if (country == null) {
-                Log.warn("The given country from the response: " + shipToDTO.getAddressCountryCode() + " could not be found"
+                LOG.warn("The given country from the response: " + shipToDTO.getAddressCountryCode() + " could not be found"
                         + " as a country abbreviation in BLC_COUNTRY");
             }
             shippingAddress.setCountry(country);
@@ -340,7 +340,6 @@
         try {
             response = checkoutService.performCheckout(order);
         } catch (CheckoutException e) {
-            //TODO: wrap the exception or put CheckoutException in common
             throw new Exception(e);
         }
 
