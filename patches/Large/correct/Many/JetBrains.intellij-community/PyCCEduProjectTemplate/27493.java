diff --git a/python/edu/course-creator-intellij-py/src/PyCCEduProjectTemplate.java b/python/edu/course-creator-intellij-py/src/PyCCEduProjectTemplate.java
index d725173..70e6221 100644
--- a/python/edu/course-creator-intellij-py/src/PyCCEduProjectTemplate.java
+++ b/python/edu/course-creator-intellij-py/src/PyCCEduProjectTemplate.java
@@ -82,7 +82,7 @@
         StartupManager.getInstance(project).runWhenProjectIsInitialized(new Runnable() {
           @Override
           public void run() {
-            PyCCProjectGenerator.generateProject(project, baseDir, panel.getName(), panel.getAuthor(), panel.getDescription());
+            PyCCProjectGenerator.generateProject(project, baseDir, panel.getName(), panel.getAuthors(), panel.getDescription());
           }
         });
       }
