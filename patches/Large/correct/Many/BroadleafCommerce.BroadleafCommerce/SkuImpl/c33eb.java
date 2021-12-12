diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/SkuImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/SkuImpl.java
index 0d8616a..a73218b 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/SkuImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/SkuImpl.java
@@ -675,7 +675,7 @@
             purchaseCost = lookupDefaultSku().getCost();
         }
 
-        if (price != null && price.getAmount().equals(BigDecimal.ZERO)) {
+        if (price != null && !price.getAmount().equals(BigDecimal.ZERO)) {
             if (purchaseCost != null) {
                 margin = price.subtract(purchaseCost).divide(price.getAmount());
             }
