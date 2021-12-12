diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
index bd4df94..f341253 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
@@ -879,11 +879,12 @@
                 LOG.warn(msg);
                 return null;
             }
-        } else if (fieldType.equals(SupportedFieldType.DECIMAL.toString())) {
+        } else if (fieldType.equals(SupportedFieldType.DECIMAL.toString())
+                || fieldType.equals(SupportedFieldType.MONEY.toString())) {
             try {
                 BigDecimal val = new BigDecimal(defaultValue);
             } catch (NumberFormatException  e) {
-                String msg = buildMsgForDefValException(SupportedFieldType.DECIMAL.toString(), fmd, defaultValue);
+                String msg = buildMsgForDefValException(fieldType.toString(), fmd, defaultValue);
                 LOG.warn(msg);
                 return null;
             }
