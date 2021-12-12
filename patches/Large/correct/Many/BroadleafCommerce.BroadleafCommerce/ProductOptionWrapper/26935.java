diff --git a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/ProductOptionWrapper.java b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/ProductOptionWrapper.java
index 217544c..e612ab2 100644
--- a/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/ProductOptionWrapper.java
+++ b/core/broadleaf-framework-web/src/main/java/org/broadleafcommerce/core/web/api/wrapper/ProductOptionWrapper.java
@@ -74,7 +74,7 @@
         if (model.getProductOptionValidationStrategyType() != null) {
             this.productOptionValidationStrategyType = model.getProductOptionValidationStrategyType().getType();
         }
-        if (model.getProductOptionValidationStrategyType() != null) {
+        if (model.getProductOptionValidationType() != null) {
             this.productOptionValidationType = model.getProductOptionValidationType().getType();
         }
         this.validationString = model.getValidationString();
