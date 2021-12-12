diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/MapFieldPersistenceProvider.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/MapFieldPersistenceProvider.java
index 34dd457..2098b81 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/MapFieldPersistenceProvider.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/provider/MapFieldPersistenceProvider.java
@@ -90,7 +90,7 @@
                 } catch (FieldNotAvailableException e) {
                     throw new IllegalArgumentException(e);
                 }
-                dirty = persistValue || (assignableValue != null && assignableValue.getValue().equals(
+                dirty = persistValue || (assignableValue != null && !assignableValue.getValue().equals(
                         populateValueRequest.getProperty().getValue()));
                 if (dirty) {
                     updateAssignableValue(populateValueRequest, instance, parent, valueType, persistValue, assignableValue);
