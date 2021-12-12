diff --git a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java
index beb66be..39035fc 100644
--- a/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java
+++ b/core/broadleaf-framework/src/main/java/org/broadleafcommerce/core/catalog/domain/CategoryImpl.java
@@ -275,7 +275,7 @@
             dataSourceName = "categoryTranslationDS",
             keyPropertyFriendlyName = "TranslationsImpl_Key",
             deleteEntityUponRemove = true,
-            mapKeyOptionEntityClass = SkuTranslationImpl.class,
+            mapKeyOptionEntityClass = CategoryTranslationImpl.class,
             mapKeyOptionEntityDisplayField = "friendlyName",
             mapKeyOptionEntityValueField = "translationsKey"
 
