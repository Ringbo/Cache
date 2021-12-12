diff --git a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/discovery/InboxResource.java b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/discovery/InboxResource.java
index f95d6f6..2c26be0 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/discovery/InboxResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.core/src/main/java/org/eclipse/smarthome/io/rest/core/internal/discovery/InboxResource.java
@@ -108,7 +108,7 @@
             return JSONResponse.createErrorResponse(Status.CONFLICT, "No binding found that can create the thing");
         }
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @DELETE
@@ -118,7 +118,7 @@
             @ApiResponse(code = 404, message = "Discovery result not found in the inbox.") })
     public Response delete(@PathParam("thingUID") @ApiParam(value = "thingUID", required = true) String thingUID) {
         if (inbox.remove(new ThingUID(thingUID))) {
-            return Response.ok().build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).build();
         } else {
             return JSONResponse.createErrorResponse(Status.NOT_FOUND, "Thing not found in inbox");
         }
@@ -139,7 +139,7 @@
     @ApiResponses(value = { @ApiResponse(code = 200, message = "OK") })
     public Response ignore(@PathParam("thingUID") @ApiParam(value = "thingUID", required = true) String thingUID) {
         inbox.setFlag(new ThingUID(thingUID), DiscoveryResultFlag.IGNORED);
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @POST
@@ -148,7 +148,7 @@
     @ApiResponses(value = { @ApiResponse(code = 200, message = "OK") })
     public Response unignore(@PathParam("thingUID") @ApiParam(value = "thingUID", required = true) String thingUID) {
         inbox.setFlag(new ThingUID(thingUID), DiscoveryResultFlag.NEW);
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @Override
