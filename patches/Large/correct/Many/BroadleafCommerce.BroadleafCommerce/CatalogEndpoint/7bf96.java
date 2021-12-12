diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/endpoint/catalog/CatalogEndpoint.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/endpoint/catalog/CatalogEndpoint.java
index 8b5c194..31d3fde 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/endpoint/catalog/CatalogEndpoint.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/endpoint/catalog/CatalogEndpoint.java
@@ -127,7 +127,7 @@
         List<ProductSummaryWrapper> out = new ArrayList<ProductSummaryWrapper>();
         if (result != null) {
             for (Product product : result) {
-                ProductWrapper wrapper = (ProductWrapper) context.getBean(ProductSummaryWrapper.class.getName());
+                ProductSummaryWrapper wrapper = (ProductSummaryWrapper) context.getBean(ProductSummaryWrapper.class.getName());
                 wrapper.wrap(product, request);
                 out.add(wrapper);
             }
