diff --git a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
index 547ad2a..d7fcce7 100644
--- a/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
+++ b/maven-embedder/src/main/java/org/apache/maven/embedder/MavenEmbedder.java
@@ -627,7 +627,7 @@
 
             createMavenSettings();
 
-            profileManager.loadSettingsProfile( settings );
+            profileManager.loadSettingsProfiles( settings );
 
             localRepository = createLocalRepository( settings );
         }
