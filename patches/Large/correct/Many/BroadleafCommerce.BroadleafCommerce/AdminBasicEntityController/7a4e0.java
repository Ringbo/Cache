diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
index 164d283..cb779e9 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
@@ -955,7 +955,7 @@
             @PathVariable(value="id") String id,
             @PathVariable(value="collectionField") String collectionField,
             @PathVariable(value="collectionItemId") String collectionItemId) throws Exception {
-        String returnPath = showViewUpdateCollection(request, model, pathVars, id, collectionField, null, collectionItemId,
+        String returnPath = showViewUpdateCollection(request, model, pathVars, id, collectionField, collectionItemId, null,
                 "viewCollectionItem");
 
         // Since this is a read-only view, actions don't make sense in this context
