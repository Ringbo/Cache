diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java
index 48bd8af..6fc0558 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java
@@ -66,16 +66,16 @@
         List<TenantRoleAction> tenantRoleActions = createTenantRoleActions();
         log("putProviderResourceGroupRoles(" +
                         "tenantDomain=%s, providerDomain=%s, service=%s, resourceGroup=%s, roleActions=%s)",
-                tenantDomain, service.getDomain().getName(), service.getServiceName(), applicationName, tenantRoleActions);
+                tenantDomain, service.getDomain().id(), service.getServiceName(), applicationName, tenantRoleActions);
         runOrThrow(() -> {
             ProviderResourceGroupRoles resourceGroupRoles = new ProviderResourceGroupRoles()
-                    .setDomain(service.getDomain().getName())
+                    .setDomain(service.getDomain().id())
                     .setService(service.getServiceName())
                     .setTenant(tenantDomain.id())
                     .setResourceGroup(applicationName.id())
                     .setRoles(tenantRoleActions);
             zmsClient.putProviderResourceGroupRoles(
-                    tenantDomain.id(), service.getDomain().getName(), service.getServiceName(),
+                    tenantDomain.id(), service.getDomain(), service.getServiceName(),
                     applicationName.id(), /*auditref*/null, resourceGroupRoles);
         });
     }
@@ -83,10 +83,10 @@
     @Override
     public void deleteApplication(AthensDomain tenantDomain, ApplicationId applicationName) {
         log("deleteProviderResourceGroupRoles(tenantDomain=%s, providerDomain=%s, service=%s, resourceGroup=%s)",
-                tenantDomain, service.getDomain().getName(), service.getServiceName(), applicationName);
+                tenantDomain, service.getDomain().id(), service.getServiceName(), applicationName);
         runOrThrow(() -> {
             zmsClient.deleteProviderResourceGroupRoles(
-                    tenantDomain.id(), service.getDomain().getName(), service.getServiceName(), applicationName.id(), /*auditref*/null);
+                    tenantDomain.id(), service.getDomain().id(), service.getServiceName(), applicationName.id(), /*auditref*/null);
         });
     }
 
@@ -197,7 +197,7 @@
 
     private String resourceStringPrefix(AthensDomain tenantDomain) {
         return String.format("%s:service.%s.tenant.%s",
-                             service.getDomain().getName(), service.getServiceName(), tenantDomain.id());
+                             service.getDomain().id(), service.getServiceName(), tenantDomain.id());
     }
 
     private String tenantResourceString(AthensDomain tenantDomain) {
