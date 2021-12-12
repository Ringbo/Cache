diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/EntityValidatorServiceImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/EntityValidatorServiceImpl.java
index 8759a3b..e1e87b7 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/EntityValidatorServiceImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/validation/EntityValidatorServiceImpl.java
@@ -62,7 +62,9 @@
             FieldMetadata metadata = metadataEntry.getValue();
 
             //Don't test this field if it was not inherited from our polymorphic type (or supertype)
-            if (types.contains(metadata.getInheritedFromType())) {
+            if (types.contains(metadata.getInheritedFromType())
+                    || instance.getClass().getName().equals(metadata.getInheritedFromType())) {
+                
                 Property property = entity.getPMap().get(metadataEntry.getKey());
                 
                 // This property should be set to false only in the case where we are adding a member to a collection
