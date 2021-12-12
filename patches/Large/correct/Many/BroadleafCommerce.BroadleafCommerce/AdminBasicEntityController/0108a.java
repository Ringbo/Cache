diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
index d0309ab..9a93f74 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
@@ -1466,7 +1466,7 @@
             }
 
             String currentTabName = getCurrentTabName(pathVars, collectionMetadata);
-            Map<String, DynamicResultSet> subRecordsMap = service.getRecordsForSelectedTab(mainMetadata, entity, sectionCrumbs, currentTabName);
+            Map<String, DynamicResultSet> subRecordsMap = service.getRecordsForSelectedTab(collectionMetadata, entity, sectionCrumbs, currentTabName);
             if (entityForm == null) {
                 entityForm = formService.createEntityForm(collectionMetadata, entity, subRecordsMap, sectionCrumbs);
             } else {
