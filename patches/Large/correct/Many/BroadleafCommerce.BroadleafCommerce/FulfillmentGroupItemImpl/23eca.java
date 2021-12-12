diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentGroupItemImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentGroupItemImpl.java
index daaf032..368d597 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentGroupItemImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/FulfillmentGroupItemImpl.java
@@ -302,7 +302,7 @@
     @Override
     public boolean getHasProratedOrderAdjustments() {
         if (proratedOrderAdjustment != null) {
-            return (proratedOrderAdjustment.compareTo(BigDecimal.ZERO) == 0);
+            return (proratedOrderAdjustment.compareTo(BigDecimal.ZERO) != 0);
         }
         return false;
     }
