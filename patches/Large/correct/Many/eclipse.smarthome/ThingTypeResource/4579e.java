diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingTypeResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingTypeResource.java
index 0503c6b..5f5133b 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingTypeResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingTypeResource.java
@@ -180,7 +180,7 @@
         }
 
         Stream<FirmwareDTO> firmwareStream = firmwares.stream().map(this::convertToFirmwareDTO);
-        return Response.ok().entity(new Stream2JSONInputStream(firmwareStream)).build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).entity(new Stream2JSONInputStream(firmwareStream)).build();
     }
 
     private ThingTypeDTO convertToThingTypeDTO(ThingType thingType, Locale locale) {
