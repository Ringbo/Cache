diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/dao/ProductDaoImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/dao/ProductDaoImpl.java
index 081111b..86a60af 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/dao/ProductDaoImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/dao/ProductDaoImpl.java
@@ -117,9 +117,9 @@
         CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
         Root<ProductImpl> product = criteria.from(ProductImpl.class);
 
-        product.fetch("defaultSku", JoinType.LEFT);
+        FetchParent fetchParent = product.fetch("defaultSku", JoinType.LEFT);
         if (!dialectHelper.isOracle() && !dialectHelper.isSqlServer()) {
-            product.fetch("skuMedia", JoinType.LEFT);
+            fetchParent.fetch("skuMedia", JoinType.LEFT);
         }
         criteria.select(product);
 
