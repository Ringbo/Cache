diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java
index 36c1e23..1e8dfde 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/controller/checkout/BroadleafCheckoutController.java
@@ -378,7 +378,7 @@
      */
     public String completeCheckout(HttpServletRequest request, HttpServletResponse response, Model model, BillingInfoForm billingForm, BindingResult result) throws CheckoutException, PricingException, ServiceException {
         Order cart = CartState.getCart();
-        if (cart != null) {
+        if (cart != null && !(cart instanceof NullOrderImpl)) {
             Map<PaymentInfo, Referenced> payments = new HashMap<PaymentInfo, Referenced>();
             
             Iterator<PaymentInfo> paymentInfoItr = cart.getPaymentInfos().iterator();
