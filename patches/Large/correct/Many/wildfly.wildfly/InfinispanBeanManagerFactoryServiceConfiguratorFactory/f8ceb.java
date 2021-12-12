diff --git a/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/InfinispanBeanManagerFactoryServiceConfiguratorFactory.java b/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/InfinispanBeanManagerFactoryServiceConfiguratorFactory.java
index 60262cd..724d84b 100644
--- a/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/InfinispanBeanManagerFactoryServiceConfiguratorFactory.java
+++ b/clustering/ejb/infinispan/src/main/java/org/wildfly/clustering/ejb/infinispan/InfinispanBeanManagerFactoryServiceConfiguratorFactory.java
@@ -116,7 +116,7 @@
             }
         };
 
-        List<CapabilityServiceConfigurator> builders = new ArrayList<>(4);
+        List<CapabilityServiceConfigurator> builders = new ArrayList<>(3);
         builders.add(new TemplateConfigurationServiceConfigurator(ServiceName.parse(InfinispanCacheRequirement.CONFIGURATION.resolve(containerName, cacheName)), containerName, cacheName, templateCacheName, configurator));
         builders.add(new CacheServiceConfigurator<>(ServiceName.parse(InfinispanCacheRequirement.CACHE.resolve(containerName, cacheName)), containerName, cacheName).require(new ServiceDependency(name.append("marshalling"))));
         builders.add(new ServiceConfiguratorAdapter(new RemoveOnCancelScheduledExecutorServiceConfigurator(name.append(this.name, "expiration"), EXPIRATION_THREAD_FACTORY)));
