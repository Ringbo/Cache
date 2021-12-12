diff --git a/java/openapi/src/org/jetbrains/idea/maven/utils/library/RepositoryLibraryProperties.java b/java/openapi/src/org/jetbrains/idea/maven/utils/library/RepositoryLibraryProperties.java
index 1eb6548..18dc0c9 100644
--- a/java/openapi/src/org/jetbrains/idea/maven/utils/library/RepositoryLibraryProperties.java
+++ b/java/openapi/src/org/jetbrains/idea/maven/utils/library/RepositoryLibraryProperties.java
@@ -41,7 +41,7 @@
   }
 
   public RepositoryLibraryProperties(@NotNull String groupId, @NotNull String artifactId, @NotNull String version, boolean includeTransitiveDependencies) {
-    myDescriptor = new JpsMavenRepositoryLibraryDescriptor(groupId, artifactId, version);
+    myDescriptor = new JpsMavenRepositoryLibraryDescriptor(groupId, artifactId, version, includeTransitiveDependencies);
   }
 
   @Override
