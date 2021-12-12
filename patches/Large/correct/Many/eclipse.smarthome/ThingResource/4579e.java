diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingResource.java
index b54ece8..294c14f 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/thing/ThingResource.java
@@ -308,7 +308,7 @@
             }
         }
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     /**
@@ -452,7 +452,7 @@
 
         ThingStatusInfo thingStatusInfo = thingStatusInfoI18nLocalizationService.getLocalizedThingStatusInfo(thing,
                 LocaleUtil.getLocale(language));
-        return Response.ok().entity(thingStatusInfo).build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).entity(thingStatusInfo).build();
     }
 
     @GET
@@ -475,9 +475,9 @@
 
         ConfigStatusInfo info = configStatusService.getConfigStatus(thingUID, LocaleUtil.getLocale(language));
         if (info != null) {
-            return Response.ok().entity(info.getConfigStatusMessages()).build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).entity(info.getConfigStatusMessages()).build();
         }
-        return Response.ok().entity(Collections.EMPTY_SET).build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).entity(Collections.EMPTY_SET).build();
     }
 
     @PUT
@@ -522,7 +522,7 @@
             return Response.status(Status.NO_CONTENT).build();
         }
 
-        return Response.ok().entity(buildFirmwareStatusDTO(info)).build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).entity(buildFirmwareStatusDTO(info)).build();
     }
 
     private FirmwareStatusDTO getThingFirmwareStatus(ThingUID thingUID) {
