diff --git a/dubbo-registry/dubbo-registry-api/src/main/java/org/apache/dubbo/registry/support/AbstractRegistryFactory.java b/dubbo-registry/dubbo-registry-api/src/main/java/org/apache/dubbo/registry/support/AbstractRegistryFactory.java
index 4c83ea3..8347d9a 100644
--- a/dubbo-registry/dubbo-registry-api/src/main/java/org/apache/dubbo/registry/support/AbstractRegistryFactory.java
+++ b/dubbo-registry/dubbo-registry-api/src/main/java/org/apache/dubbo/registry/support/AbstractRegistryFactory.java
@@ -85,7 +85,7 @@
         url = url.setPath(RegistryService.class.getName())
                 .addParameter(Constants.INTERFACE_KEY, RegistryService.class.getName())
                 .removeParameters(Constants.EXPORT_KEY, Constants.REFER_KEY);
-        String key = url.toServiceString();
+        String key = url.toServiceStringWithoutResolving();
         // Lock the registry access process to ensure a single instance of the registry
         LOCK.lock();
         try {
