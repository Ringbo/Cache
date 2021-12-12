diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderWrapper.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderWrapper.java
index 16ea4ec..9e2bf2a 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderWrapper.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/embedder/MavenEmbedderWrapper.java
@@ -137,7 +137,7 @@
     throws MavenProcessCanceledException {
     doExecute(new Executor<Object>() {
       public Object execute() throws Exception {
-        doResolve(artifact, remoteRepositories);
+        doResolve(artifact, convertRepositories(remoteRepositories));
         return null;
       }
     });
@@ -150,12 +150,12 @@
     throws MavenProcessCanceledException {
     return doExecute(new Executor<MavenArtifact>() {
       public MavenArtifact execute() throws Exception {
-        return new MavenArtifact(doResolve(id, type, classifier, remoteRepositories), getLocalRepositoryFile());
+        return new MavenArtifact(doResolve(id, type, classifier, convertRepositories(remoteRepositories)), getLocalRepositoryFile());
       }
     });
   }
 
-  private Artifact doResolve(MavenId id, String type, String classifier, List<MavenRemoteRepository> remoteRepositories) {
+  private Artifact doResolve(MavenId id, String type, String classifier, List<ArtifactRepository> remoteRepositories) {
     Artifact artifact = getComponent(ArtifactFactory.class).createArtifactWithClassifier(id.getGroupId(),
                                                                                          id.getArtifactId(),
                                                                                          id.getVersion(),
@@ -164,9 +164,9 @@
     return doResolve(artifact, remoteRepositories);
   }
 
-  private Artifact doResolve(Artifact artifact, List<MavenRemoteRepository> remoteRepositories) {
+  private Artifact doResolve(Artifact artifact, List<ArtifactRepository> remoteRepositories) {
     try {
-      myImpl.resolve(artifact, convertRepositories(remoteRepositories));
+      myImpl.resolve(artifact, remoteRepositories);
       return artifact;
     }
     catch (Exception e) {
