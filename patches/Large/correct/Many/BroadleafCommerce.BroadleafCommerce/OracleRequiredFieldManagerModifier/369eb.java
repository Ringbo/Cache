diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/OracleRequiredFieldManagerModifier.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/OracleRequiredFieldManagerModifier.java
index 7e87782..31b6fb9 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/OracleRequiredFieldManagerModifier.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/OracleRequiredFieldManagerModifier.java
@@ -60,7 +60,7 @@
 
         Column column = field.getAnnotation(Column.class);
         AdminPresentation adminPresentation = field.getAnnotation(AdminPresentation.class);
-        return adminPresentation != null && isRequiredField(adminPresentation, column) && isStringFieldType(value, adminPresentation);
+        return adminPresentation != null && isRequiredField(adminPresentation, column) && isStringFieldType(field, adminPresentation);
     }
 
     protected boolean isRequiredField(AdminPresentation adminPresentation, Column column) {
@@ -69,10 +69,10 @@
         return ((column != null && !column.nullable()) || (requiredOverride.equals(RequiredOverride.REQUIRED))) && StringUtils.isEmpty(defaultValue);
     }
 
-    protected boolean isStringFieldType(Object value, AdminPresentation adminPresentation) {
+    protected boolean isStringFieldType(Field field, AdminPresentation adminPresentation) {
         SupportedFieldType fieldType = adminPresentation.fieldType();
         return TYPES_THAT_SUPPORT_SINGLE_SPACE_AS_DEFAULT.contains(fieldType.toString())
-            || (SupportedFieldType.UNKNOWN.toString().equals(fieldType.toString()) && value instanceof String);
+            || (SupportedFieldType.UNKNOWN.toString().equals(fieldType.toString()) && String.class.isAssignableFrom(field.getType()));
     }
 
     @Override
