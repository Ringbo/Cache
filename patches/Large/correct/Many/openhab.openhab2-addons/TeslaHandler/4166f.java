diff --git a/addons/binding/org.openhab.binding.tesla/src/main/java/org/openhab/binding/tesla/handler/TeslaHandler.java b/addons/binding/org.openhab.binding.tesla/src/main/java/org/openhab/binding/tesla/handler/TeslaHandler.java
index fc696cd..a879f3a 100644
--- a/addons/binding/org.openhab.binding.tesla/src/main/java/org/openhab/binding/tesla/handler/TeslaHandler.java
+++ b/addons/binding/org.openhab.binding.tesla/src/main/java/org/openhab/binding/tesla/handler/TeslaHandler.java
@@ -411,8 +411,8 @@
             if (response != null && response.getStatus() == 200) {
                 try {
                     JsonObject jsonObject = parser.parse(response.readEntity(String.class)).getAsJsonObject();
-                    logger.trace("Request : {}:{}:{} yields {}",
-                            new Object[] { command, payLoad, target.getUri(), jsonObject.get("response").toString() });
+                    logger.trace("Request : {}:{}:{} yields {}", new Object[] { command, payLoad, target.toString(),
+                            jsonObject.get("response").toString() });
                     return jsonObject.get("response").toString();
                 } catch (Exception e) {
                     logger.error("An exception occurred while invoking a REST request : '{}'", e.getMessage());
