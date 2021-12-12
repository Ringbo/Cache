diff --git a/zeppelin-interpreter/src/main/java/org/apache/zeppelin/dep/DependencyResolver.java b/zeppelin-interpreter/src/main/java/org/apache/zeppelin/dep/DependencyResolver.java
index 03f6b32..889101f 100644
--- a/zeppelin-interpreter/src/main/java/org/apache/zeppelin/dep/DependencyResolver.java
+++ b/zeppelin-interpreter/src/main/java/org/apache/zeppelin/dep/DependencyResolver.java
@@ -99,7 +99,7 @@
         File destFile = new File(destPath, srcFile.getName());
         if (!destFile.exists() || !FileUtils.contentEquals(srcFile, destFile)) {
           FileUtils.copyFile(srcFile, destFile);
-          logger.info("copy {} to {}", srcFile.getAbsolutePath(), destPath);
+          logger.debug("copy {} to {}", srcFile.getAbsolutePath(), destPath);
         }
       }
     }
@@ -117,7 +117,7 @@
 
     if (!destFile.exists() || !FileUtils.contentEquals(srcFile, destFile)) {
       FileUtils.copyFile(srcFile, destFile);
-      logger.info("copy {} to {}", srcFile.getAbsolutePath(), destPath);
+      logger.debug("copy {} to {}", srcFile.getAbsolutePath(), destPath);
     }
   }
 
@@ -145,7 +145,7 @@
     List<File> files = new LinkedList<>();
     for (ArtifactResult artifactResult : listOfArtifact) {
       files.add(artifactResult.getArtifact().getFile());
-      logger.info("load {}", artifactResult.getArtifact().getFile().getAbsolutePath());
+      logger.debug("load {}", artifactResult.getArtifact().getFile().getAbsolutePath());
     }
 
     return files;
