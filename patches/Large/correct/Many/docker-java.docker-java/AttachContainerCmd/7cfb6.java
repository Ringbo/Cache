diff --git a/src/main/java/com/github/dockerjava/client/command/AttachContainerCmd.java b/src/main/java/com/github/dockerjava/client/command/AttachContainerCmd.java
index 1b3acb9..84b54c3 100644
--- a/src/main/java/com/github/dockerjava/client/command/AttachContainerCmd.java
+++ b/src/main/java/com/github/dockerjava/client/command/AttachContainerCmd.java
@@ -124,7 +124,7 @@
 		try {
 			LOGGER.trace("POST: {}", webResource);
 			return webResource.accept(MediaType.APPLICATION_OCTET_STREAM_TYPE)
-					.post(ClientResponse.class, params);
+					.post(ClientResponse.class);
 		} catch (UniformInterfaceException exception) {
 			if (exception.getResponse().getStatus() == 400) {
 				throw new DockerException("bad parameter");
