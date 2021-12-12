diff --git a/jps/model-impl/src/org/jetbrains/jps/model/java/impl/JdkVersionDetectorImpl.java b/jps/model-impl/src/org/jetbrains/jps/model/java/impl/JdkVersionDetectorImpl.java
index 3df267b..a178f76 100644
--- a/jps/model-impl/src/org/jetbrains/jps/model/java/impl/JdkVersionDetectorImpl.java
+++ b/jps/model-impl/src/org/jetbrains/jps/model/java/impl/JdkVersionDetectorImpl.java
@@ -118,7 +118,7 @@
         Process process = new ProcessBuilder(javaExe, "-version").redirectErrorStream(true).start();
         VersionOutputReader reader = new VersionOutputReader(process.getInputStream(), runner);
         try {
-          process.waitFor();
+          reader.waitFor();
         }
         catch (InterruptedException e) {
           LOG.info(e);
