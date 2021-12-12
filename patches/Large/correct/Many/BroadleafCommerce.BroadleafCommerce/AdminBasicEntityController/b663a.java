diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
index 341e042..7e45891 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/controller/entity/AdminBasicEntityController.java
@@ -236,8 +236,7 @@
         if (result.hasErrors()) {
             ClassMetadata cmd = service.getClassMetadata(getSectionPersistencePackageRequest(entityForm.getEntityType()));
             entityForm.clearFieldsMap();
-            //TODO: this is currently removing valid properties (ones that came across the wire as null)
-            formService.populateEntityForm(cmd, entity, entityForm, false);
+            formService.populateEntityForm(cmd, entity, entityForm, true);
 
             formService.removeNonApplicableFields(cmd, entityForm, entityForm.getEntityType());
 
@@ -386,7 +385,7 @@
             Map<String, DynamicResultSet> subRecordsMap = service.getRecordsForAllSubCollections(ppr, entity);
             ClassMetadata cmd = service.getClassMetadata(ppr);
             entityForm.clearFieldsMap();
-            formService.populateEntityForm(cmd, entity, subRecordsMap, entityForm);
+            formService.populateEntityForm(cmd, entity, subRecordsMap, entityForm, true);
             
             model.addAttribute("entity", entity);
             model.addAttribute("currentUrl", request.getRequestURL().toString());
