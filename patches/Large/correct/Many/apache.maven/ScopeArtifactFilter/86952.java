diff --git a/maven-artifact/src/main/java/org/apache/maven/artifact/resolver/filter/ScopeArtifactFilter.java b/maven-artifact/src/main/java/org/apache/maven/artifact/resolver/filter/ScopeArtifactFilter.java
index eb9a7b4..3214f0e 100644
--- a/maven-artifact/src/main/java/org/apache/maven/artifact/resolver/filter/ScopeArtifactFilter.java
+++ b/maven-artifact/src/main/java/org/apache/maven/artifact/resolver/filter/ScopeArtifactFilter.java
@@ -54,7 +54,7 @@
         }
         else if ( DefaultArtifact.SCOPE_TEST.equals( scope ) )
         {
-            providedScope = false;
+            providedScope = true;
             compileScope = true;
             runtimeScope = true;
             testScope = true;
