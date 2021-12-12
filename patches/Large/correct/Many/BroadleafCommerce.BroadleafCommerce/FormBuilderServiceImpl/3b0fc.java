diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
index 68e7206..32f5ddb 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
@@ -1532,7 +1532,7 @@
                 continue;
             }
 
-            if (collectionRecords != null) {
+            if (collectionRecords != null && !collectionRecords.isEmpty()) {
                 DynamicResultSet subCollectionEntities = collectionRecords.get(p.getName());
                 String containingEntityId = entity.getPMap().get(ef.getIdProperty()).getValue();
                 ListGrid listGrid = buildCollectionListGrid(containingEntityId, subCollectionEntities, p, ef.getSectionKey(), sectionCrumbs);
