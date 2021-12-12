diff --git a/itests/autoscale/autoscale-itests-common/src/main/java/io/fabric8/itests/autoscale/ArchetypeTest.java b/itests/autoscale/autoscale-itests-common/src/main/java/io/fabric8/itests/autoscale/ArchetypeTest.java
index 3bd15f2..5be8a22 100644
--- a/itests/autoscale/autoscale-itests-common/src/main/java/io/fabric8/itests/autoscale/ArchetypeTest.java
+++ b/itests/autoscale/autoscale-itests-common/src/main/java/io/fabric8/itests/autoscale/ArchetypeTest.java
@@ -191,7 +191,8 @@
                 property("groupId", groupId),
                 property("artifactId", artifactId),
                 property("version", version),
-                property("package", packageName)
+                property("package", packageName),
+                property("fabric8.profile", artifactId)
         ));
         assertExecuteCommand(commands, workDir);
         File projectDir = new File(workDir, artifactId);
