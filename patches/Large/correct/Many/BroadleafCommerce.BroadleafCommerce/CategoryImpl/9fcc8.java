diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java
index c5c56e3..697496b 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java
@@ -741,7 +741,7 @@
         if (filteredFeaturedProducts == null && featuredProducts != null) {
             filteredFeaturedProducts = new ArrayList<FeaturedProduct>(featuredProducts.size());
             filteredFeaturedProducts.addAll(featuredProducts);
-            CollectionUtils.filter(featuredProducts, new Predicate() {
+            CollectionUtils.filter(filteredFeaturedProducts, new Predicate() {
                 @Override
                 public boolean evaluate(Object arg) {
                     return 'Y' != ((Status) ((FeaturedProduct) arg).getProduct()).getArchived();
@@ -764,7 +764,7 @@
         if (filteredCrossSales == null && crossSaleProducts != null) {
             filteredCrossSales = new ArrayList<RelatedProduct>(crossSaleProducts.size());
             filteredCrossSales.addAll(crossSaleProducts);
-            CollectionUtils.filter(crossSaleProducts, new Predicate() {
+            CollectionUtils.filter(filteredCrossSales, new Predicate() {
                 @Override
                 public boolean evaluate(Object arg) {
                     return 'Y'!=((Status)((CrossSaleProductImpl) arg).getRelatedProduct()).getArchived();
@@ -787,7 +787,7 @@
         if (filteredUpSales == null && upSaleProducts != null) {
             filteredUpSales = new ArrayList<RelatedProduct>(upSaleProducts.size());
             filteredUpSales.addAll(upSaleProducts);
-            CollectionUtils.filter(upSaleProducts, new Predicate() {
+            CollectionUtils.filter(filteredUpSales, new Predicate() {
                 @Override
                 public boolean evaluate(Object arg) {
                     return 'Y'!=((Status)((UpSaleProductImpl) arg).getRelatedProduct()).getArchived();
