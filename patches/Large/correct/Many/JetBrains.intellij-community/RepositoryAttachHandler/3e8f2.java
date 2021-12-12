diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/library/RepositoryAttachHandler.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/library/RepositoryAttachHandler.java
index 38f3859..23e22da 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/library/RepositoryAttachHandler.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/utils/library/RepositoryAttachHandler.java
@@ -340,11 +340,11 @@
     finally {
       manager.release(embedder);
       if (!cancelled) {
-        ApplicationManager.getApplication().invokeLater(new Runnable() {
+        ApplicationManager.getApplication().invokeAndWait(new Runnable() {
           public void run() {
             resultProcessor.process(new ArrayList<MavenArtifact>(result));
           }
-        });
+        }, indicator.getModalityState());
       }
     }
   }
