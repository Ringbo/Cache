diff --git a/common/src/main/java/org/broadleafcommerce/common/payment/PaymentType.java b/common/src/main/java/org/broadleafcommerce/common/payment/PaymentType.java
index 2ba9069..9419f86 100644
--- a/common/src/main/java/org/broadleafcommerce/common/payment/PaymentType.java
+++ b/common/src/main/java/org/broadleafcommerce/common/payment/PaymentType.java
@@ -47,7 +47,7 @@
     public static final PaymentType MONEY_ORDER = new PaymentType("MONEY_ORDER", "Money Order", false);
     public static final PaymentType CUSTOMER_CREDIT = new PaymentType("CUSTOMER_CREDIT", "Customer Credit", false);
     public static final PaymentType COD = new PaymentType("COD", "Collect On Delivery", false);
-    public static final PaymentType CUSTOMER_PAYMENT = new PaymentType("CUSTOMER_PAYMENT", "Customer Payment", false);
+    public static final PaymentType CUSTOMER_PAYMENT = new PaymentType("CUSTOMER_PAYMENT", "Customer Payment", true);
     /**
      * Intended for modules like PayPal Express Checkout
      *
