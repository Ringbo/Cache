diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/dsl/PublishArtifactNotationParserFactory.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/dsl/PublishArtifactNotationParserFactory.java
index aca9e54..2836d60 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/dsl/PublishArtifactNotationParserFactory.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/dsl/PublishArtifactNotationParserFactory.java
@@ -165,7 +165,7 @@
         @Override
         protected ConfigurablePublishArtifact parseType(Provider notation) {
             Module module = metaDataProvider.getModule();
-            Provider<ArtifactFile> artifactFile = notation.<ArtifactFile>flatMap(new Transformer<ArtifactFile, Object>() {
+            Provider<ArtifactFile> artifactFile = notation.map(new Transformer<ArtifactFile, Object>() {
                 @Override
                 public ArtifactFile transform(Object value) {
                     ArtifactFile artifactFile;
