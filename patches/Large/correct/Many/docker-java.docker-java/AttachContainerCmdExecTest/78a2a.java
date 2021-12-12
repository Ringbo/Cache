diff --git a/src/test/java/com/github/dockerjava/netty/exec/AttachContainerCmdExecTest.java b/src/test/java/com/github/dockerjava/netty/exec/AttachContainerCmdExecTest.java
index 7daa59b..d3e8094 100644
--- a/src/test/java/com/github/dockerjava/netty/exec/AttachContainerCmdExecTest.java
+++ b/src/test/java/com/github/dockerjava/netty/exec/AttachContainerCmdExecTest.java
@@ -93,7 +93,7 @@
 
         dockerClient.startContainerCmd(container.getId()).exec();
 
-        Thread.sleep(SECONDS.toMillis(3)); //wait bash initialisation
+        Thread.sleep(SECONDS.toMillis(10)); //wait bash initialisation
 
         InspectContainerResponse inspectContainerResponse = dockerClient.inspectContainerCmd(container.getId()).exec();
 
