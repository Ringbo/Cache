diff --git a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java
index a341685..ab9e877 100644
--- a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java
+++ b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/KarafContainerRegistration.java
@@ -499,7 +499,7 @@
                 if (event.getPid().equals(HTTP_PID) && event.getType() == ConfigurationEvent.CM_UPDATED) {
                     Configuration config = configurationAdmin.getConfiguration(HTTP_PID);
                     int httpPort = Integer.parseInt((String) config.getProperties().get(HTTP_KEY));
-                    String httpUrl = getSshUrl(name, httpPort);
+                    String httpUrl = getHttpUrl(name, httpPort);
                     setData(curator, CONTAINER_HTTP.getPath(name), httpUrl);
                     if (fabricService.getPortService().lookupPort(current, HTTP_PID, HTTP_KEY) != httpPort) {
                         fabricService.getPortService().unRegisterPort(current, HTTP_PID);
