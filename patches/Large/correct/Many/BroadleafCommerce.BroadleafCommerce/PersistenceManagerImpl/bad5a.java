diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java
index 9f816e3..9792483 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java
@@ -326,7 +326,7 @@
                             if (!handler.willHandleSecurity(subPackage.getValue())) {
                                 adminRemoteSecurityService.securityCheck(subPackage.getValue().getCeilingEntityFullyQualifiedClassname(), EntityOperationType.ADD);
                             }
-                            subResponse = handler.add(subPackage.getValue(), dynamicEntityDao, (RecordHelper) getCompatibleModule(OperationType.BASIC));
+                            subResponse = handler.update(subPackage.getValue(), dynamicEntityDao, (RecordHelper) getCompatibleModule(OperationType.BASIC));
                             subPackage.getValue().setEntity(subResponse);
 
                             break checkHandler;
@@ -334,7 +334,7 @@
                     }
                     adminRemoteSecurityService.securityCheck(subPackage.getValue().getCeilingEntityFullyQualifiedClassname(), EntityOperationType.ADD);
                     PersistenceModule subModule = getCompatibleModule(subPackage.getValue().getPersistencePerspective().getOperationTypes().getAddType());
-                    subResponse = subModule.add(persistencePackage);
+                    subResponse = subModule.update(persistencePackage);
                     subPackage.getValue().setEntity(subResponse);
                 }
             } catch (ValidationException e) {
