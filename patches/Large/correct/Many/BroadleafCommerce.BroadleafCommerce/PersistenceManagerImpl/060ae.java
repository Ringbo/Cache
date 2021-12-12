diff --git a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java
index 18d9a99..bd4b1d3 100644
--- a/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java
+++ b/admin/broadleaf-open-admin-platform/src/main/java/org/broadleafcommerce/openadmin/server/service/persistence/PersistenceManagerImpl.java
@@ -414,7 +414,7 @@
                     }
                     adminRemoteSecurityService.securityCheck(subPackage.getValue().getCeilingEntityFullyQualifiedClassname(), EntityOperationType.ADD);
                     PersistenceModule subModule = getCompatibleModule(subPackage.getValue().getPersistencePerspective().getOperationTypes().getAddType());
-                    subResponse = subModule.add(persistencePackage);
+                    subResponse = subModule.update(persistencePackage);
                     subPackage.getValue().setEntity(subResponse);
                 }
             } catch (ValidationException e) {
