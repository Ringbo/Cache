diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java
index 50f9d6a..6c63d26 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsTree.java
@@ -669,7 +669,7 @@
   }
 
   private long getFileTimestamp(VirtualFile file) {
-    if (file == null) return -1;
+    if (file == null || !file.isValid()) return -1;
     return file.getTimeStamp();
   }
 
