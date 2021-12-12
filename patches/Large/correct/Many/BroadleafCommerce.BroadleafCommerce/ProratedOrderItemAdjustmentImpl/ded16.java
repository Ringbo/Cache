diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/ProratedOrderItemAdjustmentImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/ProratedOrderItemAdjustmentImpl.java
index 05e0cfd..4a63449 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/ProratedOrderItemAdjustmentImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/offer/domain/ProratedOrderItemAdjustmentImpl.java
@@ -200,7 +200,7 @@
         if (!getClass().isAssignableFrom(obj.getClass())) {
             return false;
         }
-        OrderItemAdjustmentImpl other = (OrderItemAdjustmentImpl) obj;
+        ProratedOrderItemAdjustmentImpl other = (ProratedOrderItemAdjustmentImpl) obj;
 
         if (id != null && other.id != null) {
             return id.equals(other.id);
