diff --git a/ejb3/src/main/java/org/jboss/as/ejb3/component/stateful/StatefulComponentCreateServiceFactory.java b/ejb3/src/main/java/org/jboss/as/ejb3/component/stateful/StatefulComponentCreateServiceFactory.java
index 5e06c55..ef9c5ea 100644
--- a/ejb3/src/main/java/org/jboss/as/ejb3/component/stateful/StatefulComponentCreateServiceFactory.java
+++ b/ejb3/src/main/java/org/jboss/as/ejb3/component/stateful/StatefulComponentCreateServiceFactory.java
@@ -62,7 +62,7 @@
         configuration.getCreateDependencies().add(new DependencyConfigurator<StatefulSessionComponentCreateService>() {
             @Override
             public void configureDependency(ServiceBuilder<?> builder, StatefulSessionComponentCreateService service) {
-                builder.addDependency(RegistryInstallerService.SERVICE_NAME);
+                builder.addDependency(DependencyType.OPTIONAL, RegistryInstallerService.SERVICE_NAME);
                 builder.addDependency(DependencyType.OPTIONAL, EJBRemoteConnectorService.SERVICE_NAME);
             }
         });
