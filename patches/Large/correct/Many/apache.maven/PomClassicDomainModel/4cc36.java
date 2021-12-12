diff --git a/maven-project/src/main/java/org/apache/maven/project/builder/PomClassicDomainModel.java b/maven-project/src/main/java/org/apache/maven/project/builder/PomClassicDomainModel.java
index 41a65c0..8265c11 100644
--- a/maven-project/src/main/java/org/apache/maven/project/builder/PomClassicDomainModel.java
+++ b/maven-project/src/main/java/org/apache/maven/project/builder/PomClassicDomainModel.java
@@ -153,7 +153,7 @@
 
     public boolean isPomInBuild()
     {
-        return projectDirectory != null && new File(projectDirectory, "pom.xml").exists();
+        return projectDirectory != null && new File(projectDirectory, "pom.xml").isFile();
     }
 
     /**
