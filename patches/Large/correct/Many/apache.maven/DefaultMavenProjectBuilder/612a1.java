diff --git a/maven-project/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java b/maven-project/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
index b450dd2..d5fd1ab 100644
--- a/maven-project/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
+++ b/maven-project/src/main/java/org/apache/maven/project/DefaultMavenProjectBuilder.java
@@ -206,15 +206,15 @@
         }
         catch ( ArtifactResolutionException e )
         {
-            throw new ProjectBuildingException( project.getId(), "Error resolving project artifact.", e );
+            throw new ProjectBuildingException( artifact.getId(), "Error resolving project artifact.", e );
         }
         catch ( ArtifactNotFoundException e )
         {
-            throw new ProjectBuildingException( project.getId(), "Error finding project artifact.", e );
+            throw new ProjectBuildingException( artifact.getId(), "Error finding project artifact.", e );
         }
         catch ( InvalidRepositoryException e )
         {
-            throw new ProjectBuildingException( project.getId(), "Error with repository specified in project.", e );
+            throw new ProjectBuildingException( artifact.getId(), "Error with repository specified in project.", e );
         }
 
         ProjectBuilderConfiguration config = new DefaultProjectBuilderConfiguration().setLocalRepository( localRepository );
