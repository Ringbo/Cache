diff --git a/subprojects/maven/src/main/groovy/org/gradle/api/publish/maven/internal/publisher/AbstractMavenPublisher.java b/subprojects/maven/src/main/groovy/org/gradle/api/publish/maven/internal/publisher/AbstractMavenPublisher.java
index 85e3148..620bb5e 100644
--- a/subprojects/maven/src/main/groovy/org/gradle/api/publish/maven/internal/publisher/AbstractMavenPublisher.java
+++ b/subprojects/maven/src/main/groovy/org/gradle/api/publish/maven/internal/publisher/AbstractMavenPublisher.java
@@ -29,7 +29,7 @@
 
 import java.io.File;
 
-abstract public class AbstractMavenPublisher<T extends MavenPublishAction> implements MavenPublisher {
+abstract public class AbstractMavenPublisher implements MavenPublisher {
     private final Factory<LoggingManagerInternal> loggingManagerFactory;
 
     private static Logger logger = LoggerFactory.getLogger(AbstractMavenPublisher.class);
@@ -42,12 +42,12 @@
 
     public void publish(MavenNormalizedPublication publication, MavenArtifactRepository artifactRepository) {
         logger.info("Publishing to repository {}", artifactRepository);
-        T deployTask = createDeployTask(publication.getPomFile(), mavenRepositoryLocator, artifactRepository);
+        MavenPublishAction deployTask = createDeployTask(publication.getPomFile(), mavenRepositoryLocator, artifactRepository);
         addPomAndArtifacts(deployTask, publication);
         execute(deployTask);
     }
 
-    abstract protected T createDeployTask(File pomFile, LocalMavenRepositoryLocator mavenRepositoryLocator, MavenArtifactRepository artifactRepository);
+    abstract protected MavenPublishAction createDeployTask(File pomFile, LocalMavenRepositoryLocator mavenRepositoryLocator, MavenArtifactRepository artifactRepository);
 
     private void addPomAndArtifacts(MavenPublishAction publishAction, MavenNormalizedPublication publication) {
         MavenArtifact mainArtifact = publication.getMainArtifact();
