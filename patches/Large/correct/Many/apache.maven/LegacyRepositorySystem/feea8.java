diff --git a/maven-compat/src/main/java/org/apache/maven/repository/LegacyRepositorySystem.java b/maven-compat/src/main/java/org/apache/maven/repository/LegacyRepositorySystem.java
index 77219b6..e092c11 100644
--- a/maven-compat/src/main/java/org/apache/maven/repository/LegacyRepositorySystem.java
+++ b/maven-compat/src/main/java/org/apache/maven/repository/LegacyRepositorySystem.java
@@ -308,7 +308,7 @@
             // no ide workspace artifact resolution
         }
 
-        return artifactResolver.resolve( request );
+        return artifactResolver.collect( request );
     }
 
     public ArtifactResolutionResult resolve( ArtifactResolutionRequest request )
