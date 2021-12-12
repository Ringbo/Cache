diff --git a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
index 867c602..0df66a5 100644
--- a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
+++ b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
@@ -156,8 +156,8 @@
                     try {
                         adminService.createInstance(containerName,
                                 sshPort,
-                                rmiServerPort,
-                                rmiRegistryPort, null, jvmOptsBuilder.toString(), collectionAsString(features), featuresUrls);
+                                rmiRegistryPort,
+                                rmiServerPort, null, jvmOptsBuilder.toString(), collectionAsString(features), featuresUrls);
                         adminService.startInstance(containerName, null);
                     } catch (Throwable t) {
                         metadata.setFailure(t);
