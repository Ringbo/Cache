diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/LocalFileDependencyBackedArtifactSet.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/LocalFileDependencyBackedArtifactSet.java
index 3a78fa6..0abcad9 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/LocalFileDependencyBackedArtifactSet.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/LocalFileDependencyBackedArtifactSet.java
@@ -68,7 +68,7 @@
         Set<File> files;
         try {
             files = dependencyMetadata.getFiles().getFiles();
-        } catch (Throwable throwable) {
+        } catch (Exception throwable) {
             return new BrokenResolvedArtifactSet(throwable);
         }
 
