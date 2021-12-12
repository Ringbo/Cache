diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java
index 7257848..d3eb631 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java
@@ -316,7 +316,7 @@
         for (Map.Entry<String, FieldMetadata> entry : mergedProperties.entrySet()) {
             String property = entry.getKey();
             FieldMetadata metadata = mergedProperties.get(property);
-            if (Class.forName(metadata.getInheritedFromType()).isAssignableFrom(entity.getClass())) {
+            if (Class.forName(metadata.getInheritedFromType()).isAssignableFrom(entity.getClass()) || entity.getClass().isAssignableFrom(Class.forName(metadata.getInheritedFromType()))) {
                 boolean proceed = true;
                 if (property.contains(".")) {
                     StringTokenizer tokens = new StringTokenizer(property, ".");
