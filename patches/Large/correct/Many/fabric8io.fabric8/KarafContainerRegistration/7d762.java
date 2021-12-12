diff --git a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java
index ab9e877..bc668ce 100644
--- a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java
+++ b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java
@@ -510,7 +510,7 @@
                     Configuration config = configurationAdmin.getConfiguration(MANAGEMENT_PID);
                     int rmiServerPort = Integer.parseInt((String) config.getProperties().get(RMI_SERVER_KEY));
                     int rmiRegistryPort = Integer.parseInt((String) config.getProperties().get(RMI_REGISTRY_KEY));
-                    String jmxUrl = getJmxUrl(name, rmiRegistryPort, rmiServerPort);
+                    String jmxUrl = getJmxUrl(name, rmiServerPort, rmiRegistryPort);
                     setData(curator, CONTAINER_JMX.getPath(name), jmxUrl);
                     if (fabricService.getPortService().lookupPort(current, MANAGEMENT_PID, RMI_REGISTRY_KEY) != rmiRegistryPort
                             || fabricService.getPortService().lookupPort(current, MANAGEMENT_PID, RMI_SERVER_KEY) != rmiServerPort) {
