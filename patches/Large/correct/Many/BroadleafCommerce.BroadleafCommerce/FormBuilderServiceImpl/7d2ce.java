diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
index ee5dfd8..3f94a83 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
@@ -1683,7 +1683,7 @@
             // We want our entity form to only render the maintained adorned target fields
             for (String targetFieldName : adornedMd.getMaintainedAdornedTargetFields()) {
                 Property p = collectionMetadata.getPMap().get(targetFieldName);
-                if (p.getMetadata() instanceof BasicFieldMetadata && BooleanUtils.isFalse(p.getMetadata().getExcluded())) {
+                if (p.getMetadata() instanceof BasicFieldMetadata && BooleanUtils.isNotTrue( p.getMetadata().getExcluded())) {
                     ((BasicFieldMetadata) p.getMetadata()).setVisibility(VisibilityEnum.VISIBLE_ALL);
                     entityFormProperties.add(p);
                 }
