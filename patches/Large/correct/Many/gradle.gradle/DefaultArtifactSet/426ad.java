diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/DefaultArtifactSet.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/DefaultArtifactSet.java
index 26f36f9..99980f3 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/DefaultArtifactSet.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/DefaultArtifactSet.java
@@ -91,7 +91,7 @@
             if (!attributes.contains(ArtifactAttributes.ARTIFACT_FORMAT)) {
                 String format = null;
                 for (ComponentArtifactMetadata artifact : artifacts) {
-                    String candidateFormat = artifact.getName().getExtension();
+                    String candidateFormat = artifact.getName().getType();
                     if (format == null) {
                         format = candidateFormat;
                     } else if (!format.equals(candidateFormat)) {
