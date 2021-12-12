diff --git a/maven-core/src/main/java/org/apache/maven/project/MavenProject.java b/maven-core/src/main/java/org/apache/maven/project/MavenProject.java
index eb9ec33..5f0eb60 100644
--- a/maven-core/src/main/java/org/apache/maven/project/MavenProject.java
+++ b/maven-core/src/main/java/org/apache/maven/project/MavenProject.java
@@ -1062,7 +1062,7 @@
     {
         if ( artifacts == null )
         {
-            if ( artifactFilter == null )
+            if ( artifactFilter == null || resolvedArtifacts == null )
             {
                 artifacts = new LinkedHashSet<Artifact>();
             }
