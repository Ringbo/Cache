diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/component/stateless/StatelessComponentCreateServiceFactory.java b/ejb3/src/main/java/org/jboss/as/ejb3/component/stateless/StatelessComponentCreateServiceFactory.java
index ab6ae5b..a057dd4 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/component/stateless/StatelessComponentCreateServiceFactory.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/component/stateless/StatelessComponentCreateServiceFactory.java
@@ -48,7 +48,7 @@
         configuration.getCreateDependencies().add(new DependencyConfigurator<StatelessSessionComponentCreateService>() {
             @Override
             public void configureDependency(ServiceBuilder<?> builder, StatelessSessionComponentCreateService service) {
-                builder.addDependency(RegistryInstallerService.SERVICE_NAME);
+                builder.addDependency(DependencyType.OPTIONAL, RegistryInstallerService.SERVICE_NAME);
                 builder.addDependency(DependencyType.OPTIONAL, ServiceName.JBOSS.append("clustering", "group", "ejb", "default"), Group.class, service.getGroupInjector());
                 builder.addDependency(DependencyType.OPTIONAL, EJBRemoteConnectorService.SERVICE_NAME);
             }
