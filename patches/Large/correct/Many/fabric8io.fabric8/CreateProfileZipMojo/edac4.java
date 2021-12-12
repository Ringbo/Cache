diff --git a/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/CreateProfileZipMojo.java b/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/CreateProfileZipMojo.java
index 50c3462..0a61cf6 100644
--- a/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/CreateProfileZipMojo.java
+++ b/fabric/fabric8-maven-plugin/src/main/java/io/fabric8/maven/CreateProfileZipMojo.java
@@ -253,7 +253,7 @@
                 if (!toBeExclude(file.getName())) {
                     File outFile = new File(profileBuildDir, file.getName());
                     if (file.isDirectory()) {
-                        copyProfileConfigFiles(file, outFile);
+                        copyProfileConfigFiles(outFile, file);
                     } else {
                         Files.copy(file, outFile);
                     }
