diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionValueImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionValueImpl.java
index 2b9d63b..fc44f73 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionValueImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionValueImpl.java
@@ -123,7 +123,7 @@
             dataSourceName = "productOptionValueTranslationDS",
             keyPropertyFriendlyName = "TranslationsImpl_Key",
             deleteEntityUponRemove = true,
-            mapKeyOptionEntityClass = SkuTranslationImpl.class,
+            mapKeyOptionEntityClass = ProductOptionValueTranslationImpl.class,
             mapKeyOptionEntityDisplayField = "friendlyName",
             mapKeyOptionEntityValueField = "translationsKey"
 
