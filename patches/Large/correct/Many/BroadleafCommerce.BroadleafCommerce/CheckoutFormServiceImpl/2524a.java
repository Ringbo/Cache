diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java
index 1e67abd..f710346 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java
@@ -190,7 +190,7 @@
         boolean orderUsingCustomerPayment = (customerPaymentUsedForOrder != null);
         boolean cartHasTemporaryCreditCard = cartStateService.cartHasTemporaryCreditCard();
 
-        return orderUsingCustomerPayment && !cartHasTemporaryCreditCard;
+        return orderUsingCustomerPayment || !cartHasTemporaryCreditCard;
     }
 
     /**
