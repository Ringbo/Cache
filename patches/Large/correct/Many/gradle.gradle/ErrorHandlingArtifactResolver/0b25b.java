diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingArtifactResolver.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingArtifactResolver.java
index d12f0e2..0bbd70a 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingArtifactResolver.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ivyresolve/ErrorHandlingArtifactResolver.java
@@ -35,7 +35,7 @@
     public void resolveArtifactsWithType(ComponentResolveMetadata component, ArtifactType artifactType, BuildableArtifactSetResolveResult result) {
         try {
             resolver.resolveArtifactsWithType(component, artifactType, result);
-        } catch (Throwable t) {
+        } catch (Exception t) {
             result.failed(new ArtifactResolveException(component.getId(), t));
         }
     }
@@ -44,7 +44,7 @@
     public void resolveArtifact(ComponentArtifactMetadata artifact, ModuleSource moduleSource, BuildableArtifactResolveResult result) {
         try {
             resolver.resolveArtifact(artifact, moduleSource, result);
-        } catch (Throwable t) {
+        } catch (Exception t) {
             result.failed(new ArtifactResolveException(artifact.getId(), t));
         }
     }
