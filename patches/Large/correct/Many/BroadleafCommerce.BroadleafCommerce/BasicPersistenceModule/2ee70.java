diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java
index ecc76b6..c6c5f96 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/module/BasicPersistenceModule.java
@@ -468,7 +468,7 @@
                             alternateOnEntity.put(entry.getKey(), entry.getValue());
                             List<Property> props2 = new ArrayList<Property>();
                             extractPropertiesFromPersistentEntity(alternateOnEntity, recordEntity, props2);
-                            if (props2.size() == 1) {
+                            if (props2.size() == 1 && !props2.get(0).getName().contains(".")) {
                                 Property alternateIdProp = props2.get(0);
                                 alternateIdProp.setName(ALTERNATE_ID_PROPERTY);
                                 props.add(alternateIdProp);
