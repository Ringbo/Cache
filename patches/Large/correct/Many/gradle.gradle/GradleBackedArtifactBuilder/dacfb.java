diff --git a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/GradleBackedArtifactBuilder.java b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/GradleBackedArtifactBuilder.java
index 576645a..f4e5830 100644
--- a/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/GradleBackedArtifactBuilder.java
+++ b/subprojects/internal-integ-testing/src/main/groovy/org/gradle/integtests/fixtures/executer/GradleBackedArtifactBuilder.java
@@ -43,7 +43,9 @@
                 "apply plugin: 'java'",
                 "dependencies { compile gradleApi() }",
                 String.format("jar.destinationDir = file('%s')", FilenameUtils.separatorsToUnix(jarFile.getParent())),
-                String.format("jar.archiveName = '%s'", jarFile.getName())
+                String.format("jar.archiveName = '%s'", jarFile.getName()),
+                // disable jar file caching to prevent file locking
+                "new URL(\"jar:file://valid_jar_url_syntax.jar!/\").openConnection().setDefaultUseCaches(false)"
         );
         executer.inDirectory(rootDir).withTasks("clean", "jar").run();
     }
