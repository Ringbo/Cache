diff --git a/plugins/plugin-docker/che-plugin-docker-machine/src/main/java/org/eclipse/che/plugin/docker/machine/DockerInstanceProvider.java b/plugins/plugin-docker/che-plugin-docker-machine/src/main/java/org/eclipse/che/plugin/docker/machine/DockerInstanceProvider.java
index acfbb75..5a74f4a 100644
--- a/plugins/plugin-docker/che-plugin-docker-machine/src/main/java/org/eclipse/che/plugin/docker/machine/DockerInstanceProvider.java
+++ b/plugins/plugin-docker/che-plugin-docker-machine/src/main/java/org/eclipse/che/plugin/docker/machine/DockerInstanceProvider.java
@@ -527,7 +527,7 @@
                 env = new ArrayList<>(commonMachineEnvVariables);
             }
 
-            final long machineMemory = machine.getConfig().getLimits().getRam() * 1024 * 1024;
+            final long machineMemory = machine.getConfig().getLimits().getRam() * 1024L * 1024L;
             final long machineMemorySwap = memorySwapMultiplier == -1 ? -1 : (long)(machineMemory * memorySwapMultiplier);
 
             machine.getConfig()
