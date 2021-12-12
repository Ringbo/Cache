diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionImpl.java
index f0e7fe2..f75ff14 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/ProductOptionImpl.java
@@ -109,7 +109,7 @@
             dataSourceName = "productOptionTranslationDS",
             keyPropertyFriendlyName = "TranslationsImpl_Key",
             deleteEntityUponRemove = true,
-            mapKeyOptionEntityClass = SkuTranslationImpl.class,
+            mapKeyOptionEntityClass = ProductOptionTranslationImpl.class,
             mapKeyOptionEntityDisplayField = "friendlyName",
             mapKeyOptionEntityValueField = "translationsKey"
 
