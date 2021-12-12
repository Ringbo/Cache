diff --git a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java
index ee48891..beca72c 100644
--- a/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java
+++ b/controller-server/src/main/java/com/yahoo/vespa/hosted/controller/athenz/impl/ZmsClientImpl.java
@@ -66,11 +66,11 @@
         List<TenantRoleAction> tenantRoleActions = createTenantRoleActions();
         log("putProviderResourceGroupRoles(" +
                         "tenantDomain=%s, providerDomain=%s, service=%s, resourceGroup=%s, roleActions=%s)",
-                tenantDomain, service.getDomain().id(), service.getFullName(), applicationName, tenantRoleActions);
+                tenantDomain, service.getDomain().id(), service.getName(), applicationName, tenantRoleActions);
         runOrThrow(() -> {
             ProviderResourceGroupRoles resourceGroupRoles = new ProviderResourceGroupRoles()
                     .setDomain(service.getDomain().id())
-                    .setService(service.getFullName())
+                    .setService(service.getName())
                     .setTenant(tenantDomain.id())
                     .setResourceGroup(applicationName.id())
                     .setRoles(tenantRoleActions);
