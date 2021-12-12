diff --git a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/modulecache/ModuleDescriptorStore.java b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/modulecache/ModuleDescriptorStore.java
index 951ff58..08c3f95 100644
--- a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/modulecache/ModuleDescriptorStore.java
+++ b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/modulecache/ModuleDescriptorStore.java
@@ -66,7 +66,7 @@
 
     private ModuleDescriptor parseModuleDescriptorFile(File moduleDescriptorFile) {
         DescriptorParseContext parserSettings = new CachedModuleDescriptorParseContext();
-        return descriptorParser.parseMetaData(parserSettings, moduleDescriptorFile).getDescriptor();
+        return descriptorParser.parseMetaData(parserSettings, moduleDescriptorFile, false).getDescriptor();
     }
 
     private String getFilePath(ModuleComponentRepository repository, ModuleRevisionId moduleRevisionId) {
