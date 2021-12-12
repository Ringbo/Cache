diff --git a/ee/src/main/java/org/jboss/as/ee/component/ComponentInstallProcessor.java b/ee/src/main/java/org/jboss/as/ee/component/ComponentInstallProcessor.java
index 72dc292..3bfbd75 100644
--- a/ee/src/main/java/org/jboss/as/ee/component/ComponentInstallProcessor.java
+++ b/ee/src/main/java/org/jboss/as/ee/component/ComponentInstallProcessor.java
@@ -110,7 +110,7 @@
                 final String bindingName = bindingConfiguration.getName();
                 final BinderService service = new BinderService(bindingName);
                 ServiceBuilder<ManagedReferenceFactory> serviceBuilder = serviceTarget.addService(ContextNames.serviceNameOfContext(applicationName, moduleName, componentName, bindingName), service);
-                bindingConfiguration.getSource().getResourceValue(serviceBuilder, phaseContext, service.getManagedObjectInjector());
+                bindingConfiguration.getSource().getResourceValue(resolutionContext, serviceBuilder, phaseContext, service.getManagedObjectInjector());
             }
         }
 
@@ -119,7 +119,7 @@
             final String bindingName = bindingConfiguration.getName();
             final BinderService service = new BinderService(bindingName);
             ServiceBuilder<ManagedReferenceFactory> serviceBuilder = serviceTarget.addService(ContextNames.serviceNameOfContext(applicationName, moduleName, componentName, bindingName), service);
-            bindingConfiguration.getSource().getResourceValue(serviceBuilder, phaseContext, service.getManagedObjectInjector());
+            bindingConfiguration.getSource().getResourceValue(resolutionContext, serviceBuilder, phaseContext, service.getManagedObjectInjector());
         }
 
         createBuilder.install();
