diff --git a/maven-project/src/main/java/org/apache/maven/project/builder/ArtifactModelContainerFactory.java b/maven-project/src/main/java/org/apache/maven/project/builder/ArtifactModelContainerFactory.java
index 6eca640..b3c0deb 100644
--- a/maven-project/src/main/java/org/apache/maven/project/builder/ArtifactModelContainerFactory.java
+++ b/maven-project/src/main/java/org/apache/maven/project/builder/ArtifactModelContainerFactory.java
@@ -149,7 +149,7 @@
                 type = "jar";
             }
 
-            if ( scope == null )
+            if ( scope == null || scope.equals("provided"))
             {
                 scope = "compile";
             }
