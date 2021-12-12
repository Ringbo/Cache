diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
index 23929fb..a6a07de 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
@@ -87,7 +87,8 @@
                     
                     Field hf;
                     if (fmd.getFieldType().equals(SupportedFieldType.EXPLICIT_ENUMERATION) ||
-                            fmd.getFieldType().equals(SupportedFieldType.BROADLEAF_ENUMERATION)) {
+                            fmd.getFieldType().equals(SupportedFieldType.BROADLEAF_ENUMERATION) ||
+                            fmd.getFieldType().equals(SupportedFieldType.EMPTY_ENUMERATION)) {
                         hf = new ComboField();
                         ((ComboField) hf).setOptions(fmd.getEnumerationValues());
                     } else {
@@ -301,7 +302,9 @@
                 	String fieldType = fmd.getFieldType() == null ? null : fmd.getFieldType().toString();
                     // Create the field and set some basic attributes
                     Field f;
-                    if (fieldType.equals(SupportedFieldType.BROADLEAF_ENUMERATION.toString())) {
+                    if (fieldType.equals(SupportedFieldType.BROADLEAF_ENUMERATION.toString())
+                            || fieldType.equals(SupportedFieldType.EXPLICIT_ENUMERATION.toString())
+                            || fieldType.equals(SupportedFieldType.EMPTY_ENUMERATION.toString())) {
                         f = new ComboField();
                         ((ComboField) f).setOptions(fmd.getEnumerationValues());
                     } else {
