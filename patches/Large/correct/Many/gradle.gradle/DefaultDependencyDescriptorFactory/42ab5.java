diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/moduleconverter/dependencies/DefaultDependencyDescriptorFactory.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/moduleconverter/dependencies/DefaultDependencyDescriptorFactory.java
index 9d5ae68..76069f4 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/moduleconverter/dependencies/DefaultDependencyDescriptorFactory.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/moduleconverter/dependencies/DefaultDependencyDescriptorFactory.java
@@ -48,7 +48,7 @@
         ModuleComponentSelector selector = DefaultModuleComponentSelector.newSelector(
             nullToEmpty(dependencyConstraint.getGroup()), nullToEmpty(dependencyConstraint.getName()), dependencyConstraint.getVersionConstraint(), dependencyConstraint.getAttributes());
         return new LocalComponentDependencyMetadata(componentId, selector, clientConfiguration, attributes, dependencyConstraint.getAttributes(), null,
-            Collections.<IvyArtifactName>emptyList(), Collections.<ExcludeMetadata>emptyList(), false, false, true, true, dependencyConstraint.getReason());
+            Collections.<IvyArtifactName>emptyList(), Collections.<ExcludeMetadata>emptyList(), false, false, false, true, dependencyConstraint.getReason());
     }
 
     private IvyDependencyDescriptorFactory findFactoryForDependency(ModuleDependency dependency) {
