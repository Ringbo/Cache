diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java
index 1491e3f..e4e5ad7 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java
@@ -903,7 +903,7 @@
     if (customNonFilteredExtensions.isEmpty()) {
       return Collections.emptySet();
     }
-    return Collections.unmodifiableCollection(customNonFilteredExtensions);
+    return Collections.unmodifiableList(customNonFilteredExtensions);
   }
 
   public int getFilterConfigCrc(ProjectFileIndex fileIndex) {
