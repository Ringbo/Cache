diff --git a/src/test/java/com/github/dockerjava/core/command/CreateContainerCmdImplTest.java b/src/test/java/com/github/dockerjava/core/command/CreateContainerCmdImplTest.java
index 5333712..752f0ae 100644
--- a/src/test/java/com/github/dockerjava/core/command/CreateContainerCmdImplTest.java
+++ b/src/test/java/com/github/dockerjava/core/command/CreateContainerCmdImplTest.java
@@ -172,8 +172,7 @@
 
 		assertThat(
 				Arrays.asList(inspectContainerResponse.getConfig().getEnv()),
-				containsInAnyOrder("VARIABLE=success",
-						"PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"));
+				containsInAnyOrder("VARIABLE=success"));
 
 		dockerClient.startContainerCmd(container.getId()).exec();
 
