diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductImpl.java
index b47ba34..d51a2bd 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductImpl.java
@@ -586,7 +586,7 @@
         Iterator<RelatedProduct> itr = returnProducts.iterator();
         while(itr.hasNext()) {
             RelatedProduct relatedProduct = itr.next();
-            if (relatedProduct.getProduct().equals(this)) {
+            if (relatedProduct.getRelatedProduct().equals(this)) {
                 itr.remove();
             }
         }
@@ -605,7 +605,7 @@
         Iterator<RelatedProduct> itr = returnProducts.iterator();
         while(itr.hasNext()) {
             RelatedProduct relatedProduct = itr.next();
-            if (relatedProduct.getProduct().equals(this)) {
+            if (relatedProduct.getRelatedProduct().equals(this)) {
                 itr.remove();
             }
         }
