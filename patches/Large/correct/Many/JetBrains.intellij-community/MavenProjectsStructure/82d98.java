diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/navigator/MavenProjectsStructure.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/navigator/MavenProjectsStructure.java
index 6708aac..5ceb14a 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/navigator/MavenProjectsStructure.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/navigator/MavenProjectsStructure.java
@@ -471,7 +471,7 @@
     @Nullable
     public Navigatable getNavigatable() {
       VirtualFile file = getVirtualFile();
-      if (file == null) return null;
+      if (file == null || !file.isValid()) return null;
       return PsiManager.getInstance(myProject).findFile(file);
     }
 
