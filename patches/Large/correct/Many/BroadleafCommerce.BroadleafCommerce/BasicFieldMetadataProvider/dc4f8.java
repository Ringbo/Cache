diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/dao/provider/metadata/BasicFieldMetadataProvider.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/dao/provider/metadata/BasicFieldMetadataProvider.java
index 616f563..dac9744 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/dao/provider/metadata/BasicFieldMetadataProvider.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/dao/provider/metadata/BasicFieldMetadataProvider.java
@@ -603,7 +603,7 @@
         if (metadata.getExplicitFieldType()==SupportedFieldType.ADDITIONAL_FOREIGN_KEY) {
             //this is a lookup - exclude the fields on this OneToOne or ManyToOne field
             //metadata.setExcluded(true);
-            if (!basicFieldMetadata.getForcePopulateChildProperties()) {
+            if (basicFieldMetadata.getForcePopulateChildProperties() == null || !basicFieldMetadata.getForcePopulateChildProperties()) {
                 metadata.setChildrenExcluded(true);
             }
             //metadata.setVisibility(VisibilityEnum.GRID_HIDDEN);
