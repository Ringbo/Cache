diff --git a/src/test/java/com/github/dockerjava/core/command/CopyArchiveToContainerCmdImplTest.java b/src/test/java/com/github/dockerjava/core/command/CopyArchiveToContainerCmdImplTest.java
index a165245..d96a6ad 100644
--- a/src/test/java/com/github/dockerjava/core/command/CopyArchiveToContainerCmdImplTest.java
+++ b/src/test/java/com/github/dockerjava/core/command/CopyArchiveToContainerCmdImplTest.java
@@ -134,19 +134,19 @@
         // create a test container which starts and waits 3 seconds for the
         // script to be copied to the container's home dir and then executes it
         String containerCmd = "sleep 3; /home/" + scriptPath.getFileName().toString();
-        CreateContainerResponse container = docker.createContainerCmd("busybox")
+        CreateContainerResponse container = dockerClient.createContainerCmd("busybox")
                 .withName("test")
                 .withCmd("/bin/sh", "-c", containerCmd)
                 .exec();
         // start the container
-        docker.startContainerCmd(container.getId()).exec();
+        dockerClient.startContainerCmd(container.getId()).exec();
         // copy script to container home dir
-        docker.copyArchiveToContainerCmd(container.getId())
+        dockerClient.copyArchiveToContainerCmd(container.getId())
                 .withRemotePath("/home")
                 .withHostResource(scriptPath.toString())
                 .exec();
         // await exid code
-        int exitCode = docker.waitContainerCmd(container.getId())
+        int exitCode = dockerClient.waitContainerCmd(container.getId())
                 .exec(new WaitContainerResultCallback())
                 .awaitStatusCode();
         // check result
