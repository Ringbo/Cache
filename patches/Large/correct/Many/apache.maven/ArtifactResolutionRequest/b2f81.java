diff --git a/maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java b/maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java
index fb67121..d10257c 100644
--- a/maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java
+++ b/maven-compat/src/main/java/org/apache/maven/artifact/resolver/ArtifactResolutionRequest.java
@@ -108,9 +108,9 @@
         return remoteRepositories;
     }
 
-    public ArtifactResolutionRequest setRemoteRepostories( List<ArtifactRepository> remoteRepostories )
+    public ArtifactResolutionRequest setRemoteRepositories( List<ArtifactRepository> remoteRepositories )
     {
-        this.remoteRepositories = remoteRepostories;
+        this.remoteRepositories = remoteRepositories;
 
         return this;
     }
