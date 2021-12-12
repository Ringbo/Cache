diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
index 8c87b93..89f7e27 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenProjectsManager.java
@@ -224,7 +224,7 @@
         myProjectsTree.save(getProjectsTreeFile());
       }
       catch (IOException e) {
-        MavenLog.LOG.warn(e);
+        MavenLog.LOG.info(e);
       }
     }
   }
