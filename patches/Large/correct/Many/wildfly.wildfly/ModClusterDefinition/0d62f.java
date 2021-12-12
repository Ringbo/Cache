diff --git a/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterDefinition.java b/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterDefinition.java
index f06ddc8..649b193 100644
--- a/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterDefinition.java
+++ b/modcluster/src/main/java/org/jboss/as/modcluster/ModClusterDefinition.java
@@ -103,12 +103,12 @@
         final DescriptionProvider readProxiesInfoConfiguration = new DefaultOperationDescriptionProvider(CommonAttributes.READ_PROXIES_CONFIGURATION, rootResolver);
         registration.registerOperationHandler(CommonAttributes.READ_PROXIES_CONFIGURATION, ModClusterGetProxyConfiguration.INSTANCE, readProxiesInfoConfiguration, false, runtimeOnlyFlags);
 
-        //These seem to be modifying the state so don't add the runtimeOnly stuff for now
+        // add/remove a proxy from the proxy-list (it is not persisted operation).
         final DescriptionProvider addProxy = new DefaultOperationDescriptionProvider(CommonAttributes.ADD_PROXY, rootResolver, HOST, PORT);
-        registration.registerOperationHandler(CommonAttributes.ADD_PROXY, ModClusterAddProxy.INSTANCE, addProxy, false);
+        registration.registerOperationHandler(CommonAttributes.ADD_PROXY, ModClusterAddProxy.INSTANCE, addProxy, false, runtimeOnlyFlags);
 
         final DescriptionProvider removeProxy = new DefaultOperationDescriptionProvider(CommonAttributes.REMOVE_PROXY, rootResolver, HOST, PORT);
-        registration.registerOperationHandler(CommonAttributes.REMOVE_PROXY, ModClusterRemoveProxy.INSTANCE, removeProxy, false);
+        registration.registerOperationHandler(CommonAttributes.REMOVE_PROXY, ModClusterRemoveProxy.INSTANCE, removeProxy, false, runtimeOnlyFlags);
 
         // node related operations.
         final DescriptionProvider refresh = new DefaultOperationDescriptionProvider(CommonAttributes.REFRESH, rootResolver);
@@ -119,23 +119,23 @@
 
         // node (all contexts) related operations.
         final DescriptionProvider enable = new DefaultOperationDescriptionProvider(CommonAttributes.ENABLE, rootResolver);
-        registration.registerOperationHandler(CommonAttributes.ENABLE, ModClusterEnable.INSTANCE, enable, false);
+        registration.registerOperationHandler(CommonAttributes.ENABLE, ModClusterEnable.INSTANCE, enable, false, runtimeOnlyFlags);
 
         final DescriptionProvider disable = new DefaultOperationDescriptionProvider(CommonAttributes.DISABLE, rootResolver);
-        registration.registerOperationHandler(CommonAttributes.DISABLE, ModClusterDisable.INSTANCE, disable, false);
+        registration.registerOperationHandler(CommonAttributes.DISABLE, ModClusterDisable.INSTANCE, disable, false, runtimeOnlyFlags);
 
         final DescriptionProvider stop = new DefaultOperationDescriptionProvider(CommonAttributes.STOP, rootResolver);
-        registration.registerOperationHandler(CommonAttributes.STOP, ModClusterStop.INSTANCE, stop, false);
+        registration.registerOperationHandler(CommonAttributes.STOP, ModClusterStop.INSTANCE, stop, false, runtimeOnlyFlags);
 
         // Context related operations.
         final DescriptionProvider enableContext = new DefaultOperationDescriptionProvider(CommonAttributes.ENABLE_CONTEXT, rootResolver, VIRTUAL_HOST, CONTEXT);
-        registration.registerOperationHandler(CommonAttributes.ENABLE_CONTEXT, ModClusterEnableContext.INSTANCE, enableContext, false);
+        registration.registerOperationHandler(CommonAttributes.ENABLE_CONTEXT, ModClusterEnableContext.INSTANCE, enableContext, false, runtimeOnlyFlags);
 
         final DescriptionProvider disableContext = new DefaultOperationDescriptionProvider(CommonAttributes.DISABLE_CONTEXT, rootResolver, VIRTUAL_HOST, CONTEXT);
-        registration.registerOperationHandler(CommonAttributes.DISABLE_CONTEXT, ModClusterDisableContext.INSTANCE, disableContext, false);
+        registration.registerOperationHandler(CommonAttributes.DISABLE_CONTEXT, ModClusterDisableContext.INSTANCE, disableContext, false, runtimeOnlyFlags);
 
         final DescriptionProvider stopContext = new DefaultOperationDescriptionProvider(CommonAttributes.STOP_CONTEXT, rootResolver, VIRTUAL_HOST, CONTEXT, WAIT_TIME);
-        registration.registerOperationHandler(CommonAttributes.STOP_CONTEXT, ModClusterStopContext.INSTANCE, stopContext, false);
+        registration.registerOperationHandler(CommonAttributes.STOP_CONTEXT, ModClusterStopContext.INSTANCE, stopContext, false, runtimeOnlyFlags);
     }
 
 
