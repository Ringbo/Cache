diff --git a/subprojects/dependency-management/src/main/java/org/gradle/internal/component/external/model/DefaultDependencyMetadata.java b/subprojects/dependency-management/src/main/java/org/gradle/internal/component/external/model/DefaultDependencyMetadata.java
index f2d0f33..679d30e 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/internal/component/external/model/DefaultDependencyMetadata.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/internal/component/external/model/DefaultDependencyMetadata.java
@@ -54,17 +54,17 @@
     // TODO:DAZ Get rid of these: DefaultDependencyMetadata is not a _real_ `DependencyMetadata`
     @Override
     public Set<ConfigurationMetadata> selectConfigurations(ImmutableAttributes consumerAttributes, ComponentResolveMetadata targetComponent, AttributesSchemaInternal consumerSchema) {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException("Work in progress: DefaultDependencyMetadata is not really a DependencyMetadata");
     }
 
     @Override
     public List<Exclude> getExcludes() {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException("Work in progress: DefaultDependencyMetadata is not really a DependencyMetadata");
     }
 
     @Override
     public Set<IvyArtifactName> getArtifacts() {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException("Work in progress: DefaultDependencyMetadata is not really a DependencyMetadata");
     }
 
     @Override
