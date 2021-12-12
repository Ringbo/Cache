diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemImpl.java
index 500c2b3..a2d7635 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/order/domain/OrderItemImpl.java
@@ -324,10 +324,10 @@
         if (deproxiedCategory == null) {
             PostLoaderDao postLoaderDao = DefaultPostLoaderDao.getPostLoaderDao();
 
-            if (postLoaderDao != null) {
+            if (category != null && postLoaderDao != null) {
                 Long id = category.getId();
                 deproxiedCategory = postLoaderDao.find(CategoryImpl.class, id);
-            } else if (category instanceof HibernateProxy) {
+            } else if (category != null && category instanceof HibernateProxy) {
                 deproxiedCategory = HibernateUtils.deproxy(category);
             } else {
                 deproxiedCategory = category;
