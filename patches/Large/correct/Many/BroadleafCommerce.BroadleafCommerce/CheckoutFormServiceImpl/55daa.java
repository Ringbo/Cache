diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java
index b7c86b2..3f05641 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/checkout/service/CheckoutFormServiceImpl.java
@@ -188,7 +188,7 @@
         boolean orderUsingCustomerPayment = (customerPaymentUsedForOrder != null);
         boolean cartHasTemporaryCreditCard = cartStateService.cartHasTemporaryCreditCard();
 
-        return orderUsingCustomerPayment || !cartHasTemporaryCreditCard;
+        return orderUsingCustomerPayment && !cartHasTemporaryCreditCard;
     }
 
     /**
