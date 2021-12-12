diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/service/OrderServiceImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/service/OrderServiceImpl.java
index 1a6865b..70f173d 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/service/OrderServiceImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/service/OrderServiceImpl.java
@@ -867,7 +867,7 @@
             bundleOrderItem.setQuantity(orderItemRequestDTO.getQuantity());
             bundleOrderItem.setCategory(category);
             bundleOrderItem.setSku(sku);
-            bundleOrderItem.setName(sku.getName());
+            bundleOrderItem.setName(product.getName());
             bundleOrderItem.setProductBundle(bundle);
 
             for (SkuBundleItem skuBundleItem : bundle.getSkuBundleItems()) {
