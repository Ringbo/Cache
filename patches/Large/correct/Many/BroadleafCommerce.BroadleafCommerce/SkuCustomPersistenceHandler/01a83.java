diff --git a/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java b/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java
index 13ac24a..860a497 100644
--- a/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java
+++ b/admin/broadleaf-admin-module/src/main/java/org/broadleafcommerce/admin/server/service/handler/SkuCustomPersistenceHandler.java
@@ -668,8 +668,8 @@
                 return entity;
             }
 
-            // Only modify product options if this isn't an update for inventory properties
-            if (persistencePackage.containsCriteria(INVENTORY_ONLY_CRITERIA)) {
+            // Only modify product options if this ISN'T an update for inventory properties
+            if (!persistencePackage.containsCriteria(INVENTORY_ONLY_CRITERIA)) {
                 associateProductOptionValuesToSku(entity, adminInstance, dynamicEntityDao);
             }
 
