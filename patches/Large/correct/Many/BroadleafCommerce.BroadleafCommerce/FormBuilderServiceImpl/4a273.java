diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
index 98b01b4..cf27da3 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/web/service/FormBuilderServiceImpl.java
@@ -420,7 +420,7 @@
                          .withFriendlyName(fmd.getFriendlyName())
                          .withForeignKeyDisplayValueProperty(fmd.getForeignKeyDisplayValueProperty())
                          .withForeignKeyClass(fmd.getForeignKeyClass())
-                         .withOwningEntityClass(fmd.getOwningClass()!=null?fmd.getOwningClass():fmd.getTargetClass())
+                         .withOwningEntityClass(fmd.getOwningClass()!=null?fmd.getOwningClass():fmd.getInheritedFromType())
                          .withRequired(required)
                          .withReadOnly(fmd.getReadOnly())
                          .withTranslatable(fmd.getTranslatable())
