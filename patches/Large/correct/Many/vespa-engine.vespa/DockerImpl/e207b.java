diff --git a/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/DockerImpl.java b/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/DockerImpl.java
index 1d0295e..bafa11f 100644
--- a/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/DockerImpl.java
+++ b/docker-api/src/main/java/com/yahoo/vespa/hosted/dockerapi/DockerImpl.java
@@ -246,8 +246,8 @@
                     // --cpus requires API 1.25+ on create and 1.29+ on update
                     // NanoCPUs is supported in docker-java as of 3.1.0 on create and not at all on update
                     // TODO: Simplify this to .withNanoCPUs(resources.cpu()) when docker-java supports it
-                    .withCpuPeriod(resources.cpuQuota() > 0 ? resources.cpuPeriod() : null)
-                    .withCpuQuota(resources.cpuQuota() > 0 ? resources.cpuQuota() : null);
+                    .withCpuPeriod(resources.cpuPeriod())
+                    .withCpuQuota(resources.cpuQuota());
 
             updateContainerCmd.exec();
         } catch (NotFoundException e) {
@@ -288,7 +288,12 @@
     }
 
     private static ContainerResources containerResourcesFromHostConfig(HostConfig hostConfig) {
-        final double cpus = hostConfig.getCpuPeriod() > 0 ?
+        // Docker keeps an internal state of what the period and quota are: in cgroups, the quota is always set
+        // (default is 100000), but docker will report it as 0 unless explicitly set by the user.
+        // This may lead to a state where the quota is set, but period is 0 (accord to docker), which will
+        // mess up the calculation below. This can only happen if someone sets it manually, since this class
+        // will always set both quota and period.
+        final double cpus = hostConfig.getCpuQuota() > 0 ?
                 (double) hostConfig.getCpuQuota() / hostConfig.getCpuPeriod() : 0;
         return new ContainerResources(cpus, hostConfig.getCpuShares(), hostConfig.getMemory());
     }
